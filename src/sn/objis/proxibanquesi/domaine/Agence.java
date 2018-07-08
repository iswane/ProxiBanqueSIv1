/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.Date;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class Agence {

	// Attributs
	private long idAgence;
	private String numIdentAgence;
	private Date dateCreateAgence;
	private Localite localite;

	// Constructeurs
	public Agence() {
		super();
	}
	
	public Agence(long idAgence) {
		super();
		this.setIdAgence(idAgence);
	}

	public Agence(long idAgence, String numIdentAgence, Date dateCreateAgence, Localite localite) {
		super();
		this.setIdAgence(idAgence);
		this.numIdentAgence = numIdentAgence;
		this.dateCreateAgence = dateCreateAgence;
		this.localite = localite;
	}

	// Getters & Setters
	
	public Agence(String numIdentAgence2, java.sql.Date dateCreateAgence2, Localite l) {
		// TODO Auto-generated constructor stub
	}

	public String getNumIdentAgence() {
		return numIdentAgence;
	}

	public void setNumIdentAgence(String numIdentAgence) {
		this.numIdentAgence = numIdentAgence;
	}

	public Date getDateCreateAgence() {
		return dateCreateAgence;
	}

	public void setDateCreateAgence(Date dateCreateAgence) {
		this.dateCreateAgence = dateCreateAgence;
	}

	public Localite getLocalite() {
		return localite;
	}

	public void setLocalite(Localite localite) {
		this.localite = localite;
	}

	public long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(long idAgence) {
		this.idAgence = idAgence;
	}

	

}
