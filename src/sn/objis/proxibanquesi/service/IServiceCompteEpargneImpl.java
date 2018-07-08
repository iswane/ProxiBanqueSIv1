/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import sn.objis.proxibanquesi.dao.IDaoCompteEpargneImpl;
import sn.objis.proxibanquesi.domaine.CompteEpargne;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceCompteEpargneImpl implements IServiceCompteEpargne {

	private IDaoCompteEpargneImpl dao = new IDaoCompteEpargneImpl();

	@Override
	public void ajouter(CompteEpargne t) {
		dao.create(t);
	}

	@Override
	public List<CompteEpargne> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(CompteEpargne t) {
		dao.update(t);
	}

	@Override
	public void supprimer(CompteEpargne t) {
		dao.delete(t);
	}

	@Override
	public CompteEpargne rechercherParNumCompte(long numCompte) {
		return dao.findByNumCompte(numCompte);
	}

	@Override
	public void retrait(CompteEpargne compte, double montant) {
		dao.whiteDrawal(compte, montant);
	}

	@Override
	public void depot(CompteEpargne compte, double montant) {
		dao.deposit(compte, montant);
	}

	@Override
	public void virement(CompteEpargne compteDebiteur, CompteEpargne compteCrediteur, double montantVirement) {
		dao.transfer(compteCrediteur, compteDebiteur, montantVirement);
	}

}
