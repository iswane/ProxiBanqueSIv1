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
public abstract class Compte {

	// Attributs
	private long idCompte;
	private long numCompte;
	private Date dateOuvertCompte;
	private double soldeCompte;
	private Client client;
	private List<Transaction> listeTransactions;

	// Constructeurs
	public Compte() {
		super();
	}

	public Compte(long numCompte, double soldeCompte) {
		super();
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	// Getters & Setters

	public long getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}

	public Date getDateOuvertCompte() {
		return dateOuvertCompte;
	}

	public void setDateOuvertCompte(Date dateOuvertCompte) {
		this.dateOuvertCompte = dateOuvertCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public List<Transaction> getListeTransactions() {
		return listeTransactions;
	}

	public void setListeTransactions(List<Transaction> listeTransactions) {
		this.listeTransactions = listeTransactions;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}

}
