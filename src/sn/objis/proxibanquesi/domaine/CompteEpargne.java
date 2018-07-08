/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.Date;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class CompteEpargne extends Compte {

	// Attributs
	private String codeCEpargne;
	private double taux = 0.03;

	// Constructeurs
	public CompteEpargne() {
		super();
	}

	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}

	public CompteEpargne(long numCompte, double soldeCompte, String codeCEpargne, double taux) {
		super(numCompte, soldeCompte);
		this.codeCEpargne = codeCEpargne;
		this.taux = taux;
	}

	// Getters & Setters

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public String getCodeCEpargne() {
		return codeCEpargne;
	}

	public void setCodeCEpargne(String codeCEpargne) {
		this.codeCEpargne = codeCEpargne;
	}

}
