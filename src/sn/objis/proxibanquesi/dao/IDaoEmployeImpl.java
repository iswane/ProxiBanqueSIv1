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

import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.utils.ConnectionDB;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoEmployeImpl implements IDaoEmploye {

	private static Connection cnx = ConnectionDB.getConnection();

	@Override
	public void create(Employe t) {

		try {
			// 1. Préparation de la requète
			String sql = "INSERT INTO Employe (codeEmploye, nomEmploye, prenomEmploye, telEmploye, emailEmploye,"
					+ " adresseEmploye, idAgence, idRole) VALUES (?,?,?,?,?,?,?,?)";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, t.getCodeEmploye());
			pst.setString(2, t.getNomEmploye());
			pst.setString(3, t.getPrenomEmploye());
			pst.setString(4, t.getTelEmploye());
			pst.setString(5, t.getEmailEmploye());
			pst.setString(6, t.getAdresseEmploye());
			pst.setLong(7, t.getIdAgence());
			pst.setLong(8, t.getIdRole());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Employe> getAll() {
		Employe emp = null;
		List<Employe> listeEmployes = new ArrayList<>();

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM Employe";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du resultat de la requète
			while (rs.next()) {
				String codeEmp = rs.getString("codeEmploye");
				String nomEmp = rs.getString("nomEmploye");
				String prenomEmp = rs.getString("prenomEmploye");
				String telEmp = rs.getString("telEmploye");
				String emailEmp = rs.getString("emailEmploye");
				String adresseEmp = rs.getString("adresseEmploye");

				emp = new Employe(codeEmp, nomEmp, prenomEmp, telEmp, emailEmp, adresseEmp);
				listeEmployes.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeEmployes;
	}

	@Override
	public void update(Employe t) {

		try {
			// 1. Préparation de la requète
			String sql = "UPDATE Employe SET nomEmploye=?, prenomEmploye=?, telEmploye=?, adresseEmploye=? WHERE emailEmploye=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, t.getNomEmploye());
			pst.setString(2, t.getPrenomEmploye());
			pst.setString(3, t.getTelEmploye());
			pst.setString(4, t.getAdresseEmploye());
			pst.setString(5, t.getEmailEmploye());

			// 4. Exécution de la requète
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Employe t) {

		try {
			// 1. Préparation de la requète
			String sql = "DELETE FROM Employe WHERE emailEmploye=? ";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, t.getEmailEmploye());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Employe findByKey(String key) {

		Employe emp = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM Employe WHERE codeEmploye=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, key);

			// 4. Exécution de la requète
			ResultSet rs = pst.executeQuery();

			// 5. Traitement du resultat de la requète
			while (rs.next()) {
				String codeEmp = rs.getString("codeEmploye");
				String nomEmp = rs.getString("nomEmploye");
				String prenomEmp = rs.getString("prenomEmploye");
				String telEmp = rs.getString("telEmploye");
				String emailEmp = rs.getString("emailEmploye");
				String adresseEmp = rs.getString("adresseEmploye");

				emp = new Employe(codeEmp, nomEmp, prenomEmp, telEmp, emailEmp, adresseEmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public long recupIdEmploye() {
		long idEmploye = 0;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT idEmploye FROM  Employe";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du résulat de la requète
			while (rs.next()) {
				long idEmployeRecup = Long.parseLong(rs.getString("idEmploye"));
				idEmploye = idEmployeRecup;
			}
		} catch (SQLException e) {
			System.out.println("Problème de requète !");
			e.printStackTrace();
		}

		return idEmploye;
	}

	@Override
	public long recupIdRole(long idEmploye) {
		long idRole = 0;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT idRole FROM  Employe WHERE idEmploye=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setLong(1, idEmploye);
			
			// 4. Exécution de la requète
			ResultSet rs = pst.executeQuery();

			// 5. Traitement du résulat de la requète
			while (rs.next()) {
				long idEmployeRecup = Long.parseLong(rs.getString("idRole"));
				idRole = idEmployeRecup;
			}
		} catch (SQLException e) {
			System.out.println("Problème de requète !");
			e.printStackTrace();
		}

		return idRole;
	}

}
