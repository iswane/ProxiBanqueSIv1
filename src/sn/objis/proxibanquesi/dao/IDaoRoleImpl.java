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

import javax.swing.ButtonGroup;

import sn.objis.proxibanquesi.domaine.Role;
import sn.objis.proxibanquesi.utils.ConnectionDB;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoRoleImpl implements IDaoRole {

	private Connection cnx = ConnectionDB.getConnection();

	@Override
	public void create(Role t) {

		try {
			// 1. Préparation de la requiète
			String sql = "INSERT INTO Role (codeRole, nomRole) VALUES (?,?)";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux patramètres de la requète
			pst.setString(1, t.getCodeRole());
			pst.setString(2, t.getNomRole());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Role> getAll() {
		List<Role> listeRoles = new ArrayList<>();
		Role role = null;

		try {
			// 1. Préparation de la requiète
			String sql = "SELECT * FROM Role";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du resultat de la requète
			while (rs.next()) {
				String codeRole = rs.getString("codeRole");
				String nomRole = rs.getString("nomRole");

				role = new Role(codeRole, nomRole);
				listeRoles.add(role);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeRoles;

	}

	@Override
	public void update(Role t) {
		try {
			// 1. Préparation de la requiète
			String sql = "UPDATE Role SET nomRole=? WHERE codeRole=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux patramètres de la requète
			pst.setString(1, t.getCodeRole());
			pst.setString(2, t.getNomRole());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Role t) {
		try {
			// 1. Préparation de la requiète
			String sql = "DELETE FROM Role WHERE codeRole=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux patramètres de la requète
			pst.setString(1, t.getCodeRole());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<String> recupNomRole() {
		List<String> listeBoutons = new ArrayList<>();
		String nomRoleRecup = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT nomRole FROM  Role";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();
			
			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);
			
			// 4. Traitement du résulat de la requète
			while(rs.next()) {
				nomRoleRecup = rs.getString("nomRole");
				listeBoutons.add(nomRoleRecup);
				
			}
		} catch (SQLException e) {
			System.out.println("Problème de requète !");
			e.printStackTrace();
		}

		return listeBoutons;
	}

}
