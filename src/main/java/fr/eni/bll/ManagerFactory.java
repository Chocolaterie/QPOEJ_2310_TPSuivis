package fr.eni.bll;

public class ManagerFactory {

	public static MealManager getMealManager() {
		return new MealManager();
	}

}
