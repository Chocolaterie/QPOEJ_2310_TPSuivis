<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Suivis Repas</title>
		<link rel="icon" href="img/favicon.ico">
		<!-- CSS FILES -->
		<link rel="stylesheet" href="${ pageContext.request.contextPath }/vendors/uikit-3.17.8/css/uikit.min.css" />
		<style>
		.uk-container-small {
		max-width: 47rem;
		}
		</style>
	</head>
	<body>
		<!--HEADER-->
		<header style="background-color: #fff; border-bottom: 1px solid #f2f2f2" data-uk-sticky="show-on-up: true; animation: uk-animation-slide-top">
			<div class="uk-container">
			</div>
		</header>
		<!--/HEADER-->
		

		<div class="uk-container">
		
			<!-- Titre/Header -->
    		<h1 class="uk-heading-divider">Ajout</h1>
			
			 <!-- Formulaire -->
	    	<form action="${ pageContext.request.contextPath }/meal/form" method="post">
	            <fieldset class="uk-fieldset">
	    
	                <!-- Champs Date -->
	                <div class="uk-margin">
	                    <input class="uk-input" name="createdDate" type="text" placeholder="Date" aria-label="Date" value="${ repas.createdDate }">
	                </div>
	                
	                 <!-- Champs Heure -->
	                <div class="uk-margin">
	                    <input class="uk-input" name="createdHour" type="text" placeholder="Heure" aria-label="Heure" value="${ repas.createdHour }">
	                </div>
	                
	                 <!-- Champs Aliments -->
	                <div class="uk-margin">
	                    <input class="uk-input" name="aliments" type="text" placeholder="Aliments" aria-label="Aliments" value="${ repas.aliments }">
	                </div>
	                	
	                <!-- Bouton submit -->
	                <div class="uk-margin">
	                    <input type="submit" value="Valider" class="uk-button uk-button-primary" />
	                </div>
	
	            </fieldset>
	        </form>
			 
   		</div>
		<!-- JS FILES -->
		<script src="${ pageContext.request.contextPath }/vendors/uikit-3.17.8/js/uikit.min.js"></script>
        <script src="${ pageContext.request.contextPath }/vendors/uikit-3.17.8/js/uikit-icons.min.js"></script>
        
	</body>
</html>
