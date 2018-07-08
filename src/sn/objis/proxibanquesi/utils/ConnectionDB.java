package sn.objis.proxibanquesi.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Cette classe implemente le pattern Singleton. Elle permet la cr�ation de
 * l'unique instance de connexion avec la BD.
 * 
 * @author OBJIS #10000codeurs
 * @since 03/08/2017
 * @version GestionBanque 1.0
 * 
 */
public class ConnectionDB {

	// Les paramètres de la BD
	private static String driver = null;
	private static String url = null;
	private static String user = null;
	private static String password = null;

	private static Connection cnx = null;
	private static ResourceBundle rs = null;
	private static String bundleName = null;

	/**
	 * Constructeur avec une vibilité private : Pour interdir les classes
	 * utilisatrices de créer des instances via le constructeur
	 */
	private ConnectionDB() {
		super();
	}

	/**
	 * cnx Cette méthode retourne l'unique instance de Connection avec la BD
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		try {
			if (cnx == null) {
				// 1: Chargement du fichier properties
				bundleName = "resources.configDB";
				rs = ResourceBundle.getBundle(bundleName);

				// 2: Accès aux données du fichier properties
				driver = rs.getString("driver");
				url = rs.getString("url");
				user = rs.getString("user");
				password = rs.getString("password");

				// 3: Chargement du driver
				Class.forName(driver);

				// 4: Etablissement de la connexion
				cnx = DriverManager.getConnection(url, user, password);
				System.out.println("Connexion avec la DB reussie !!");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Problème de connection !!!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cnx;

	}

}
