package fr.leo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.leo.beans.Client;

/**
 * Servlet implementation class CreationClient
 */
@WebServlet("/CreationClient")
public class CreationClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
        * R�cup�ration des donn�es saisies, envoy�es en tant que param�tres de
        * la requ�te GET g�n�r�e � la validation du formulaire
        */
       String nom = request.getParameter( "nomClient" );
       String prenom = request.getParameter( "prenomClient" );
       String adresse = request.getParameter( "adresseClient" );
       String telephone = request.getParameter( "telephoneClient" );
       String email = request.getParameter( "emailClient" );

       String message;
       /*
        * Initialisation du message � afficher : si un des champs obligatoires
        * du formulaire n'est pas renseign�, alors on affiche un message
        * d'erreur, sinon on affiche un message de succ�s
        */
       if ( nom.trim().isEmpty() || adresse.trim().isEmpty() || telephone.trim().isEmpty() ) {
           message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"creerClient.jsp\">Cliquez ici</a> pour acc�der au formulaire de cr�ation d'un client.";
       } else {
           message = "Client cr�� avec succ�s !";
       }
       /*
        * Cr�ation du bean Client et initialisation avec les donn�es r�cup�r�es
        */
       Client client = new Client();
       client.setNom( nom );
       client.setPrenom( prenom );
       client.setAdresse( adresse );
       client.setTelephone( telephone );
       client.setEmail( email );

       /* Ajout du bean et du message � l'objet requ�te */
       request.setAttribute( "client", client );
       request.setAttribute( "message", message );
		
		request.getRequestDispatcher( "/WEB-INF/aficherClientCreer.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
