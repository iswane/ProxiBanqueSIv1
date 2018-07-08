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

import javax.swing.JComboBox;

import sn.objis.proxibanquesi.domaine.Localite;
import sn.objis.proxibanquesi.utils.ConnectionDB;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoLocaliteImpl implements IDaoLocalite {

	private Connection cnx = ConnectionDB.getConnection();

	@Override
	public void create(Localite t) {

		try {
			// 1. Préparation de la requiète
			String sql = "INSERT INTO localite (nomLocalite, longitudeLocalite, latitudeLocalite) VALUES (?,?,?)";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux patramètres de la requète
			pst.setString(1, t.getNomLocalite());
			pst.setString(2, t.getLongitudeLocalite());
			pst.setString(3, t.getLatitudeLocalite());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Localite> getAll() {
		List<Localite> listeLocalites = new ArrayList<>();
		Localite localite = null;

		try {
			// 1. Préparation de la requiète
			String sql = "SELECT * FROM localite";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du resultat de la requète
			while (rs.next()) {
				String nomLocalite = rs.getString("nomLocalite");
				String longitudeLocalite = rs.getString("longitudeLocalite");
				String latitudeLocalite = rs.getString("latitudeLocalite");

				localite = new Localite(nomLocalite, longitudeLocalite, latitudeLocalite);
				listeLocalites.add(localite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeLocalites;
	}

	@Override
	public void update(Localite t) {
		try {
			// 1. Préparation de la requiète
			String sql = "UPDATE localite SET nomLocalite=? WHERE nomLocalite=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux patramètres de la requète
			pst.setString(1, t.getNomLocalite());
			pst.setString(2, t.getNomLocalite());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Localite t) {
		try {
			// 1. Préparation de la requiète
			String sql = "DELETE FROM localite WHERE nomLocalite=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux patramètres de la requète
			pst.setString(1, t.getNomLocalite());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public JComboBox getNomLocalite() {

		JComboBox cBox = new JComboBox();
		String nomLocalite = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT nomLocalite FROM Localite";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();
			
			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);
			
			// 4. Traitement du resultat de la requète
			while(rs.next()) {
				nomLocalite = rs.getString("nomLocalite");
				cBox.addItem(nomLocalite);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cBox;
	}

}
