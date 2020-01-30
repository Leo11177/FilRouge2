<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Affichage d'un client</title>
<link type="text/css" rel="stylesheet" href="inc/style.css" />
        <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body  class="container">

    	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">COMMANDES</a>
		
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link" href="creerClient.jsp">Créer un nouveau client</a>
				<a class="nav-item nav-link" href="creerCommande.jsp" tabindex="-1"
					aria-disabled="true">Créer une nouvelle commande</a>
			</div>
		</div>
	</nav>




		<p class="info">${ message }</p>

			<div class="card">
		<div class="card-body">
				<p class="card-text">Nom : ${ client.nom }</p>
			</div>
		</div>
			<div class="card">
		<div class="card-body">
				<p class="card-text">Prénom : ${ client.prenom }</p>
			</div>
		</div>
			<div class="card">
		<div class="card-body">
				<p class="card-text">Adresse : ${ client.adresse }</p>
			</div>
		</div>
			<div class="card">
		<div class="card-body">
				<p class="card-text">Numéro de téléphone : ${ client.telephone }</p>
			</div>
		</div>
		<div class="card">
			<div class="card-body">
				<p class="card-text">Email : ${ client.email }</p>
			</div>
		</div>



	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>