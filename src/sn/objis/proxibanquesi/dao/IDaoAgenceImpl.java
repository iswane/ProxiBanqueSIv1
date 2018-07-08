/**
 * 
 */
package sn.objis.proxibanquesi.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.proxibanquesi.domaine.Agence;
import sn.objis.proxibanquesi.domaine.Localite;
import sn.objis.proxibanquesi.utils.ConnectionDB;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoAgenceImpl implements IDaoAgence {

	private Connection cnx = ConnectionDB.getConnection();

	private Localite l = new Localite();

	@Override
	public void create(Agence t) {

		try {
			// 1. Préparation de la requiète
			String sql = "INSERT INTO agence (numIdentAgence, dateCreateAgence, idLocalite) VALUES (?,?,?)";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux patramètres de la requète
			pst.setString(1, t.getNumIdentAgence());
			pst.setDate(2, (Date) t.getDateCreateAgence());
			pst.setLong(3, t.getLocalite().getIdLocalite());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Agence> getAll() {
		List<Agence> listeAgences = new ArrayList<>();
		Agence agence = null;

		try {
			// 1. Préparation de la requiète
			String sql = "SELECT * FROM agence";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du resultat de la requète
			while (rs.next()) {
				String numIdentAgence = rs.getString("numIdentAgence");
				Date dateCreateAgence = Date.valueOf(rs.getString("dateCreateAgence"));

				agence = new Agence(numIdentAgence, dateCreateAgence, l);
				listeAgences.add(agence);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeAgences;
	}

	@Override
	public void update(Agence t) {
		try {
			// 1. Préparation de la requiète
			String sql = "UPDATE agence SET numIdentAgence=? WHERE numIdentAgence=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux patramètres de la requète
			pst.setString(1, t.getNumIdentAgence());
			pst.setString(2, t.getNumIdentAgence());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Agence t) {
		try {
			// 1. Préparation de la requiète
			String sql = "DELETE FROM agence WHERE numIdentAgence=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux patramètres de la requète
			pst.setString(1, t.getNumIdentAgence());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public long recupIdAgence() {
		long idAgenceRecup = 0;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT idAgence FROM agence";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du résulat de la requète
			idAgenceRecup = Long.parseLong(rs.getString("idAgence"));

		} catch (SQLException e) {
			System.out.println("Problème de requète !");
			e.printStackTrace();
		}

		return idAgenceRecup;
	}

}
