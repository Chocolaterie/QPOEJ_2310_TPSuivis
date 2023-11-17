package fr.eni.dal;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JdbcTools {

	public static Connection getConnection() {

		Connection cnx = null;

		try {
			// Récupérer le Context
			Context context = new InitialContext();

			// La ressource du context
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/pool_cnx");

			// Récupérer la connexion depuis la ressource du context
			cnx = dataSource.getConnection();

			// Afficher un message pour savoir si oui ou non la connexion est valide ou pas
			if (!cnx.isClosed()) { // Si la connexion est ouverte
				System.out.println("Connexion avec succès");
			}
			else {
				System.out.println("La connexion est fermée");
			}
		} catch (NamingException e) { // Quand il y'a une erreur sur le context
			e.printStackTrace();
		} catch (SQLException e) { // Quand il y'a une erreur SQL technique (hors requêtes)
			e.printStackTrace();
		}

		// Retourner la connexion (qu'elle soit valide ou pas)
		return cnx;
	}

}
