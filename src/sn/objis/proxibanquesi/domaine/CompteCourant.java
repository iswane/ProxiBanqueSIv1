/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.Date;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class CompteCourant extends Compte {

	// Attributs
	private String codeCCourant;
	private double decouvert = 1000;

	// Constructeurs
	public CompteCourant() {
		super();
	}

	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

	public CompteCourant(long numCompte, double soldeCompte, String codeCCourant, double decouvert) {
		super(numCompte, soldeCompte);
		this.codeCCourant = codeCCourant;
		this.decouvert = decouvert;
	}

	// Getters & Setters

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public String getCodeCCourant() {
		return codeCCourant;
	}

	public void setCodeCCourant(String codeCCourant) {
		this.codeCCourant = codeCCourant;
	}

}
