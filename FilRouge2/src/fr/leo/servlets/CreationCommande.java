package fr.leo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.leo.beans.Client;
import fr.leo.beans.Commande;

/**
 * Servlet implementation class CreationCommande
 */
@WebServlet("/CreationCommande")
public class CreationCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationCommande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom =  request.getParameter("nomClient");
		String prenom =  request.getParameter("prenomClient");
		String adresse =  request.getParameter("adresseClient");
		String telephone =  request.getParameter("telephoneClient");
		String email =  request.getParameter("emailClient");
		
		Client client = new Client(nom, prenom, adresse, telephone, email);
		
		
		String date =  request.getParameter("dateCommande");
		Double montant = Double.parseDouble(request.getParameter("montantCommande"));
		String modePaiement =  request.getParameter("modePaiementCommande");
		String statutPaiement =  request.getParameter("statutPaiementCommande");
		String modeLivraison =  request.getParameter("modeLivraisonCommande");
		String statutLivraison =  request.getParameter("statutLivraisonCommande");
		
		Commande commande = new Commande(client, date, montant, modePaiement, statutPaiement, modeLivraison, statutLivraison);
		
		request.setAttribute("commande", commande);
		
		request.getRequestDispatcher( "/WEB-INF/creerCommande.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
