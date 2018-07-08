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

import sn.objis.proxibanquesi.domaine.Client;
import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.utils.ConnectionDB;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoClientImpl implements IDaoClient {

	private static Connection cnx = ConnectionDB.getConnection();

	IDaoEmployeImpl idEmploye = new IDaoEmployeImpl();

	@Override
	public void create(Client t) {

		try {
			// 1. Préparation de la requète
			String sql = "INSERT INTO client (codeclient, nomclient, prenomclient, telclient, emailclient, adresseclient,"
					+ " codePostclient, villeclient, professionclient, idEmploye) VALUES (?,?,?,?,?,?,?,?,?,?)";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, t.getCodeClient());
			pst.setString(2, t.getNomClient());
			pst.setString(3, t.getPrenomClient());
			pst.setString(4, t.getTelClient());
			pst.setString(5, t.getEmailClient());
			pst.setString(6, t.getAdresseClient());
			pst.setString(7, t.getCodePostalClient());
			pst.setString(8, t.getVilleClient());
			pst.setString(9, t.getProfessionClient());
			pst.setLong(10, idEmploye.recupIdEmploye());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Client> getAll() {
		Client clt = null;
		List<Client> listeClients = new ArrayList<>();

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM client";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du resultat de la requète
			while (rs.next()) {
				String codeClt = rs.getString("codeClient");
				String nomClt = rs.getString("nomClient");
				String prenomClt = rs.getString("prenomClient");
				String telClt = rs.getString("telClient");
				String emailClt = rs.getString("emailClient");
				String adresseClt = rs.getString("adresseClient");
				String codePostClt = rs.getString("codePostClient");
				String villeClt = rs.getString("villeClient");
				String professionClt = rs.getString("professionClient");

				clt = new Client(codeClt, nomClt, prenomClt, telClt, emailClt, adresseClt, codePostClt, villeClt,
						professionClt);
				listeClients.add(clt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeClients;
	}

	@Override
	public void update(Client t) {

		try {
			// 1. Préparation de la requète
			String sql = "UPDATE client SET nomClient=?, prenomClient=?, telClient=?, adresseClient=?, villeClient=? WHERE emailClient=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, t.getNomClient());
			pst.setString(2, t.getPrenomClient());
			pst.setString(3, t.getTelClient());
			pst.setString(4, t.getAdresseClient());
			pst.setString(5, t.getVilleClient());
			pst.setString(6, t.getEmailClient());

			// 4. Exécution de la requète
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Client t) {
		try {
			// 1. Préparation de la requète
			String sql = "DELETE FROM client WHERE emailClient=? ";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, t.getEmailClient());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Client findByKey(String key) {
		Client clt = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM client";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setString(1, key);

			// 4. Exécution de la requète
			ResultSet rs = pst.executeQuery(sql);

			// 5. Traitement du resultat de la requète
			while (rs.next()) {
				String codeClt = rs.getString("codeClient");
				String nomClt = rs.getString("nomClient");
				String prenomClt = rs.getString("prenomClient");
				String telClt = rs.getString("telClient");
				String emailClt = rs.getString("emailClient");
				String adresseClt = rs.getString("adresseClient");
				String codePostClt = rs.getString("codePostClient");
				String villeClt = rs.getString("villeClient");
				String professionClt = rs.getString("professionClient");

				clt = new Client(codeClt, nomClt, prenomClt, telClt, emailClt, adresseClt, codePostClt, villeClt,
						professionClt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clt;
	}

	@Override
	public long recupIdClient() {

		long idClient = 0;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT idClient FROM  client";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du résulat de la requète
			while (rs.next()) {
				long idClientRecup = Long.parseLong(rs.getString("idClient"));
				idClient = idClientRecup;
			}
		} catch (SQLException e) {
			System.out.println("Problème de requète !");
			e.printStackTrace();
		}

		return idClient;
	}

}
