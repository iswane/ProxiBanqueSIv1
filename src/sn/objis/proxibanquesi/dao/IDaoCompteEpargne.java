/**
 * 
 */
package sn.objis.proxibanquesi.dao;

import sn.objis.proxibanquesi.domaine.CompteEpargne;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoCompteEpargne extends IDao<CompteEpargne> {

	/**
	 * @param numCompte
	 * @return
	 */
	public CompteEpargne findByNumCompte(long numCompte);

	/**
	 * @param compte
	 * @param montant
	 */
	public void whiteDrawal(CompteEpargne compte, double montant);

	/**
	 * @param compte
	 * @param montant
	 */
	public void deposit(CompteEpargne compte, double montant);

	/**
	 * @param compte1
	 * @param compte2
	 * @param montant
	 */
	public void transfer(CompteEpargne compte1, CompteEpargne compte2, double montant);
}
