/**
 * 
 */
package sn.objis.proxibanquesi.service;

import sn.objis.proxibanquesi.domaine.CompteCourant;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IServiceCompteCourant extends IService<CompteCourant> {

	public CompteCourant rechercherParNumCompte(long numCompte);

	/**
	 * @param compte
	 * @param montant
	 */
	public void retrait(CompteCourant compte, double montant);

	/**
	 * @param compte
	 * @param montant
	 */
	public void depot(CompteCourant compte, double montant);

	/**
	 * @param compteDebiteur
	 * @param compteCrediteur
	 * @param montant
	 */
	public void virement(CompteCourant compteDebiteur, CompteCourant compteCrediteur, double montant);
}
