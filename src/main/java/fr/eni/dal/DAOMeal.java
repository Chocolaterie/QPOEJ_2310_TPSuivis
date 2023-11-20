package fr.eni.dal;

import java.util.List;

import fr.eni.bo.Meal;

public interface DAOMeal {

	public List<Meal> selectAll();
	
	public void insert(Meal meal);
}
