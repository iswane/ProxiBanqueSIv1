/**
 * 
 */
package sn.objis.proxibanquesi.dao;

import sn.objis.proxibanquesi.domaine.CompteCourant;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoCompteCourant extends IDao<CompteCourant> {
	/**
	 * @param numCompte
	 * @return
	 */
	public CompteCourant findByNumCompte(long numCompte);

	/**
	 * @param compte
	 * @param montant
	 */
	public void whiteDrawal(CompteCourant compte, double montant);

	/**
	 * @param compte
	 * @param montant
	 */
	public void deposit(CompteCourant compte, double montant);

	/**
	 * @param compte1
	 * @param compte2
	 * @param montant
	 */
	public void transfer(CompteCourant compteCrediteur, CompteCourant compteDebiteur, double montantVirement);
}
