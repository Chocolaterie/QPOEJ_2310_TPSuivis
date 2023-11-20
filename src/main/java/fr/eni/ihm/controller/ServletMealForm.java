package fr.eni.ihm.controller;

import java.io.IOException;

import fr.eni.bll.ManagerFactory;
import fr.eni.bo.Meal;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletMealForm
 */
@WebServlet("/meal/form")
public class ServletMealForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMealForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Objet vide par defaut
		Meal meal = new Meal();
		
		// Afficher la page avec l'objet
		request.setAttribute("meal", meal);
		
		RequestDispatcher rq = request.getRequestDispatcher("page_meal_form.jsp");
		rq.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Mapper les données de la requête en objet Meal
		String createDate = request.getParameter("createdDate");
		String createdHour = request.getParameter("createdHour");
		String aliments = request.getParameter("aliments");
		
		Meal meal = new Meal(-1, createDate, createdHour, aliments);
		
		// Appeler le manager 
		ManagerFactory.getMealManager().save(meal);
		
		// Rediriger vers l'accueil
		response.sendRedirect("");
	}

}
