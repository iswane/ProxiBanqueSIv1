/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.Date;
import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class Transaction {

	// Attributs
	private long idTransaction;
	private long numTransaction;
	private Date dateTransaction;
	private double montantTransaction;
	private Employe employe;
	private List<Compte> listeComptes;

	// Constructeurs
	public Transaction() {
		super();
	}

	public Transaction(long numTransaction, Date dateTransaction, double montantTransaction, Employe employe) {
		super();
		this.numTransaction = numTransaction;
		this.dateTransaction = dateTransaction;
		this.montantTransaction = montantTransaction;
		this.setEmploye(employe);
	}

	// Getters & Setters

	public long getNumTransaction() {
		return numTransaction;
	}

	public void setNumTransaction(long numTransaction) {
		this.numTransaction = numTransaction;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public double getMontantTransaction() {
		return montantTransaction;
	}

	public void setMontantTransaction(double montantTransaction) {
		this.montantTransaction = montantTransaction;
	}

	public List<Compte> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(List<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}

	public long getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(long idTransaction) {
		this.idTransaction = idTransaction;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

}
