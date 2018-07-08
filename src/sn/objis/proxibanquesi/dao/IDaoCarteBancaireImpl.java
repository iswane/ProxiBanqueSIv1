/**
 * 
 */
package sn.objis.proxibanquesi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.proxibanquesi.domaine.CarteBancaire;
import sn.objis.proxibanquesi.domaine.Client;
import sn.objis.proxibanquesi.utils.ConnectionDB;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoCarteBancaireImpl implements IDaoCarteBancaire {

	private Connection cnx = ConnectionDB.getConnection();

	private Client c = new Client();

	@Override
	public void create(CarteBancaire t) {

		try {

			// 1. Préparation de la requète
			String sql = "INSERT INTO carteBancaire (numCarte, descriptionCarte, idClient) VALUES (?,?,?)";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setLong(1, t.getNumcarte());
			pst.setString(2, t.getDescriptionCarte());
			pst.setLong(3, c.getIdClient());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<CarteBancaire> getAll() {

		List<CarteBancaire> listeCartes = new ArrayList<>();
		CarteBancaire carteBancaire = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM carteBancaire";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du resultat de la requète
			while (rs.next()) {
				long numCarte = Long.parseLong(rs.getString("numCarte"));
				String descCarte = rs.getString("descriptionCarte");

				carteBancaire = new CarteBancaire(numCarte, descCarte, c);
				listeCartes.add(carteBancaire);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeCartes;
	}

	@Override
	public void update(CarteBancaire t) {

		try {
			// 1. Préparation de la requète
			String sql = "UPDATE carteBancaire SET descriptionCarte=? WHERE numCarte=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, t.getDescriptionCarte());
			pst.setLong(2, t.getNumcarte());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(CarteBancaire t) {
		try {
			// 1. Préparation de la requète
			String sql = "DELETE FROM carteBancaire WHERE numCarte=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setLong(1, t.getNumcarte());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
