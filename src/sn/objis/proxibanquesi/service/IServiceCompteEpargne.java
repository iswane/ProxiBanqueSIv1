/**
 * 
 */
package sn.objis.proxibanquesi.service;

import sn.objis.proxibanquesi.domaine.CompteEpargne;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IServiceCompteEpargne extends IService<CompteEpargne> {
	public CompteEpargne rechercherParNumCompte(long numCompte);

	/**
	 * @param compte
	 * @param montant
	 */
	public void retrait(CompteEpargne compte, double montant);

	/**
	 * @param compte
	 * @param montant
	 */
	public void depot(CompteEpargne compte, double montant);

	/**
	 * @param compteDebiteur
	 * @param compteCrediteur
	 * @param montant
	 */
	public void virement(CompteEpargne compteDebiteur, CompteEpargne compteCrediteur, double montant);
}
