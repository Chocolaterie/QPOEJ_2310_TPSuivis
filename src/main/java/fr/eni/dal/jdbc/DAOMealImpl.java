package fr.eni.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.bo.Meal;
import fr.eni.dal.DAOMeal;
import fr.eni.dal.JdbcTools;

public class DAOMealImpl implements DAOMeal {

	@Override
	public List<Meal> selectAll() {
		
		List<Meal> meals = new ArrayList<Meal>();
		
		Connection cnx = JdbcTools.getConnection();
	
		try {
			PreparedStatement stmt;
			stmt = cnx.prepareStatement("SELECT * FROM Meal");
			
			ResultSet result = stmt.executeQuery();
			
			while(result.next()) {
				Meal meal = new Meal(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
			
				meals.add(meal);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Fermer la connexion
			try {
				cnx.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// retourner la liste des repas récupérés
		return meals;
	}

}
