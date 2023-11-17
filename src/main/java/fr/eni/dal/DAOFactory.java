package fr.eni.dal;

import fr.eni.dal.jdbc.DAOMealImpl;

public class DAOFactory {

	public static DAOMeal getDAOMeal() {
		return new DAOMealImpl();
	}
}
