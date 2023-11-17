package fr.eni.ihm.controller;

import java.io.IOException;
import java.util.List;

import fr.eni.bll.ManagerFactory;
import fr.eni.bll.MealManager;
import fr.eni.bo.Meal;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletShowAllMeal
 */
@WebServlet("/meal/show-all")
public class ServletShowAllMeal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletShowAllMeal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupérer tout les repas
		/* Equivalent
		MealManager mealmanager = new MealManager();
		mealmanager.getAll(); 
		*/
		List<Meal> meals = ManagerFactory.getMealManager().getAll();
		
		// Envoyer les repas dans la jsp
		request.setAttribute("meals", meals);
		
		// Afficher la JSP
		RequestDispatcher rd = request.getRequestDispatcher("show_all_meal.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
