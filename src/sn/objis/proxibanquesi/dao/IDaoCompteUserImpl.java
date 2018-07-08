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

import sn.objis.proxibanquesi.domaine.CompteUtilisateur;
import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.utils.ConnectionDB;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoCompteUserImpl implements IDaoCompteUser {

	private Connection cnx = ConnectionDB.getConnection();
	private Employe e = new Employe();
	private IDaoEmployeImpl idEmploye = new IDaoEmployeImpl();

	@Override
	public void create(CompteUtilisateur t) {

		try {
			// 1. Préparation de la requète
			String sql = "INSERT INTO compteUser (dateCreateCompteUser, etatCompteUser, loginUser, passwdUser, idEmploye) VALUES"
					+ " (NOW(),?,?,?,?)";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setBoolean(1, t.isEtatCompteUser());
			pst.setString(2, t.getLogin());
			pst.setString(3, t.getPasswd());
			pst.setLong(4, idEmploye.recupIdEmploye());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<CompteUtilisateur> getAll() {
		List<CompteUtilisateur> listeCompteUsers = new ArrayList<>();
		CompteUtilisateur compteUser = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM compteUser";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. traitement du resultat de la requète
			while (rs.next()) {
				Date dateCreate = Date.valueOf(rs.getString("dateCreateCompteUser"));
				boolean etatCompte = Boolean.parseBoolean(rs.getString("etatCompteUser"));
				String login = rs.getString("loginUser");
				String passwd = rs.getString("passwdUser");

				compteUser = new CompteUtilisateur(dateCreate, etatCompte, login, passwd, e.getIdEmploye());
				listeCompteUsers.add(compteUser);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeCompteUsers;
	}

	@Override
	public void update(CompteUtilisateur t) {

		try {
			// 1. Préparation de la requète
			String sql = "UPDATE compteUser SET etatCompteUser=?, passwdUser=? WHERE loginUser=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setBoolean(1, t.isEtatCompteUser());
			pst.setString(2, t.getPasswd());
			pst.setString(3, t.getLogin());

			// 4. Exécution de la requète
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(CompteUtilisateur t) {

		try {
			// 1. Préparation de la requète
			String sql = "DELETE FROM compteUser WHERE loginUser=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, t.getLogin());

			// 4. Exécution de la requète
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean authentification(String login, String passwd) {
		CompteUtilisateur compteUser = null;
		List<CompteUtilisateur> listecompteUsers = new ArrayList<>();

		boolean canConnect = false;

		try {

			// 1. Préparation de la requète
			String sql = "SELECT loginUser, PasswdUser FROM compteUser WHERE loginUser=? AND PasswdUser=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, login);
			pst.setString(2, passwd);

			// 4. Exécution de la requète
			ResultSet rs = pst.executeQuery();

			// 5. Traitement du resultat de la requète
			while (rs.next()) {
				String loginCompte = rs.getString("loginUser");
				String passwdCompte = rs.getString("PasswdUser");

				compteUser = new CompteUtilisateur(loginCompte, passwdCompte);
				listecompteUsers.add(compteUser);
			}

			for (CompteUtilisateur compteUsers : listecompteUsers) {
				if (login.equalsIgnoreCase(compteUsers.getLogin())
						&& passwd.equalsIgnoreCase(compteUsers.getPasswd())) {
					canConnect = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return canConnect;
	}

	@Override
	public CompteUtilisateur findById(long id) {

		CompteUtilisateur user = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM compteUser WHERE idEmploye=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setLong(1, id);

			// 4. Exécution de la requète
			ResultSet rs = pst.executeQuery();

			// 5. Traitement du resultat de la requète
			while (rs.next()) {
				boolean etatCompte = Boolean.parseBoolean(rs.getString("etatCompteUser"));
				String login = rs.getString("loginUser");
				String passwd = rs.getString("passwdUser");

				user = new CompteUtilisateur(etatCompte, login, passwd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public long recupIdEmp(String login, String passwd) {

		long idRecup = 0;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT idEmploye FROM compteUser WHERE loginUser=? AND PasswdUser=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);
			
			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, login);
			pst.setString(2, passwd);

			// 4. Exécution de la requète
			ResultSet rs = pst.executeQuery();

			// 5. Traitement du resultat de la requète
			while (rs.next()) {
				long idEmp = Long.parseLong(rs.getString("idEmploye"));
				idRecup = idEmp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return idRecup;
	}

}
