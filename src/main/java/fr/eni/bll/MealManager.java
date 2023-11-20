package fr.eni.bll;

import java.util.List;

import fr.eni.bo.Meal;
import fr.eni.dal.DAOFactory;

public class MealManager {
	
	public List<Meal> getAll() {
		List<Meal> meals = DAOFactory.getDAOMeal().selectAll();
		return meals;
	}
	
	public void save(Meal meal) {
		DAOFactory.getDAOMeal().insert(meal);
	}
}
