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

import sn.objis.proxibanquesi.domaine.Client;
import sn.objis.proxibanquesi.domaine.CompteCourant;
import sn.objis.proxibanquesi.utils.ConnectionDB;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoCompteCourantImpl implements IDaoCompteCourant {

	private Connection cnx = ConnectionDB.getConnection();

	private IDaoClientImpl idClient = new IDaoClientImpl();

	@Override
	public void create(CompteCourant t) {

		try {
			// 1. Préparation de la requète
			String sql = "INSERT INTO compte (numCompte, dateOuvertCompte, soldeCompte, decouvert, codeCCourant, idClient) VALUES (?,NOW(),?,?,?,?)";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission de valeurs aux paramètres de la requète
			pst.setLong(1, t.getNumCompte());
			pst.setDouble(2, t.getSoldeCompte());
			pst.setDouble(3, t.getDecouvert());
			pst.setString(4, t.getCodeCCourant());
			pst.setLong(5, idClient.recupIdClient());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<CompteCourant> getAll() {
		List<CompteCourant> listeCCourants = new ArrayList<>();
		CompteCourant cCourant = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM compte";

			// 2. Créatiion d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. Traitement du resultat de la requète
			while (rs.next()) {
				long numCompte = Long.parseLong(rs.getString("numCompte"));
				double soldeCompte = Double.parseDouble(rs.getString("soldeCompte"));
				double decouvertCompte = Double.parseDouble(rs.getString("decouvert"));
				String codeCEpargne = rs.getString("codeCCourant");

				cCourant = new CompteCourant(numCompte, soldeCompte, codeCEpargne, decouvertCompte);
				listeCCourants.add(cCourant);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeCCourants;
	}

	@Override
	public void update(CompteCourant t) {

		try {
			// 1. Préparation de la requète
			String sql = "UPDATE compte SET soldeCompte=? WHERE numCompte=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setLong(1, t.getNumCompte());

			// 4. Exécution de la requète
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(CompteCourant t) {
		try {
			// 1. Préparation de la requète
			String sql = "DELETE FROM compte WHERE numCompte=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setLong(1, t.getNumCompte());

			// 4. Exécution de la requète
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public CompteCourant findByNumCompte(long numCompte) {
		CompteCourant cCourant = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM compte WHERE numCompte=?";

			// 2. Créatiion d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setLong(1, numCompte);

			// 4. Exécution de la requète
			ResultSet rs = pst.executeQuery(sql);

			// 5. Traitement du resultat de la requète
			while (rs.next()) {
				long numeroCompte = Long.parseLong(rs.getString("numCompte"));
				Date dateOuvert = Date.valueOf(rs.getString("dateOuvertCompte"));
				double soldeCompte = Double.parseDouble(rs.getString("soldeCompte"));
				double decouvertCompte = Double.parseDouble(rs.getString("decouvert"));
				String codeCCourant = rs.getString("codeCCourant");

				cCourant = new CompteCourant(numeroCompte, soldeCompte, codeCCourant, decouvertCompte);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cCourant;
	}

	@Override
	public void whiteDrawal(CompteCourant compte, double montant) {

		// 1. Calcule du montant total disponible sur le compte
		double soldePlusDecouvert = compte.getSoldeCompte() + compte.getDecouvert();
		if (soldePlusDecouvert < montant) {
			System.out.println("Vôtre solde est insuffisant !");
		} else {
			double newSolde = compte.getSoldeCompte() - montant;

			try {
				// 2. Préparation de la requète
				String sql = "UPDATE compte SET soldeCompte=? WHERE numCompte=?";

				// 3. Création d'une zone de requète
				PreparedStatement pst = cnx.prepareStatement(sql);

				// 4. Transmission des valeurs aux paramètres de la requète
				pst.setDouble(1, newSolde);
				pst.setLong(2, compte.getNumCompte());

				// 5. Exécution de la requète
				pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void deposit(CompteCourant compte, double montant) {

		// 1. Calcule du montant total disponible sur le compte
		double newSolde = compte.getSoldeCompte() + montant;

		try {
			// 2. Préparation de la requète
			String sql = "UPDATE compte SET soldeCompte=? WHERE numCompte=?";

			// 3. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 4. Transmission des valeurs aux paramètres de la requète
			pst.setDouble(1, newSolde);
			pst.setLong(2, compte.getNumCompte());

			// 5. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void transfer(CompteCourant compteCrediteur, CompteCourant compteDebiteur, double montantVirement) {

		// 1. Calcule du montant total disponible sur le compte
		double soldePlusDecouvert = compteCrediteur.getSoldeCompte() + compteCrediteur.getDecouvert();

		if (soldePlusDecouvert < montantVirement) {
			System.out.println("Le virement ne pas être éffectue !");
		} else {
			// 2. Débiter le compte débiteur
			this.whiteDrawal(compteDebiteur, montantVirement);
			// 3. Créditer le compte créditeur
			this.deposit(compteCrediteur, montantVirement);
		}
	}

}
