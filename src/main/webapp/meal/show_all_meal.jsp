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
    		<h1 class="uk-heading-divider">Historique</h1>
    		
   			<div class="uk-child-width-expand@s uk-text-center" uk-grid>
		    	<!-- Pour chaque meal  -->
		        <c:forEach var="meal" items="${meals}">
		        	<div class="uk-padding-small uk-width-1-2@m">
						<div class="uk-card uk-card-default uk-card-body">
						    <h3 class="uk-card-title">${ meal.createdDate } - ${ meal.createdHour }</h3>
						  	<p>${ meal.aliments }</p>
						</div>
					</div>
				</c:forEach>
			</div>
			
			<!-- les deux boutons pour naviguer -->
			 <p>
		 		<a class="uk-button uk-button-default" href="${ pageContext.request.contextPath }">Ajouter un nouveau repas</a>
			 </p>
    
 			 <p>
		 		<a class="uk-button uk-button-default" href="${ pageContext.request.contextPath }">Retour à l'accueil</a>
			 </p>
			 
   		</div>
		<!-- JS FILES -->
		<script src="${ pageContext.request.contextPath }/vendors/uikit-3.17.8/js/uikit.min.js"></script>
        <script src="${ pageContext.request.contextPath }/vendors/uikit-3.17.8/js/uikit-icons.min.js"></script>
        
	</body>
</html>
