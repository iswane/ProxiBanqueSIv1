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

import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.domaine.Transaction;
import sn.objis.proxibanquesi.utils.ConnectionDB;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoTransactionImpl implements IDaoTransaction {

	private Connection cnx = ConnectionDB.getConnection();

	private Employe e = new Employe();

	@Override
	public void create(Transaction t) {

		try {
			// 1. Préparation de la requète
			String sql = "INSERT INTO Transaction (numTransaction, dateTransaction, montantTransaction, idEmploye) VALUES (?,?,?,?)";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setLong(1, t.getNumTransaction());
			pst.setDate(2, (Date) t.getDateTransaction());
			pst.setDouble(3, t.getMontantTransaction());
			pst.setLong(4, e.getIdEmploye());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Transaction> getAll() {
		List<Transaction> listeTransactions = new ArrayList<>();
		Transaction transaction = null;

		try {
			// 1. Préparation de la requète
			String sql = "SELECT * FROM Transaction";

			// 2. Création d'une zone de requète
			Statement st = cnx.createStatement();

			// 3. Exécution de la requète
			ResultSet rs = st.executeQuery(sql);

			// 4. traitement du resultat de la requète
			while (rs.next()) {
				long numTransaction = Long.parseLong(rs.getString("numTransaction"));
				Date dateTransaction = Date.valueOf(rs.getString("dateTransaction"));
				double montantTransaction = Double.parseDouble(rs.getString("montantTransaction"));

				transaction = new Transaction(numTransaction, dateTransaction, montantTransaction, e);
				listeTransactions.add(transaction);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeTransactions;
	}

	@Override
	public void update(Transaction t) {

		try {
			// 1. Préparation de la requète
			String sql = "UPDATE Transaction SET montantTransaction=? WHERE numTransaction=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setDouble(1, t.getMontantTransaction());
			pst.setLong(2, t.getNumTransaction());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Transaction t) {
		try {
			// 1. Préparation de la requète
			String sql = "DELETE FROM Transaction WHERE numTransaction=?";

			// 2. Création d'une zone de requète
			PreparedStatement pst = cnx.prepareStatement(sql);

			// 3. Transmission des valeurs aux paramètres de la requète
			pst.setLong(1, t.getNumTransaction());

			// 4. Exécution de la requète
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
