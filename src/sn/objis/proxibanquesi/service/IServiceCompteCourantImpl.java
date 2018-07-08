/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import sn.objis.proxibanquesi.dao.IDaoCompteCourantImpl;
import sn.objis.proxibanquesi.domaine.CompteCourant;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceCompteCourantImpl implements IServiceCompteCourant {
	
	private IDaoCompteCourantImpl dao = new IDaoCompteCourantImpl();

	@Override
	public void ajouter(CompteCourant t) {
		dao.create(t);
	}

	@Override
	public List<CompteCourant> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(CompteCourant t) {
		dao.update(t);
	}

	@Override
	public void supprimer(CompteCourant t) {
		dao.delete(t);
	}

	@Override
	public CompteCourant rechercherParNumCompte(long numCompte) {
		return dao.findByNumCompte(numCompte);
	}

	@Override
	public void retrait(CompteCourant compte, double montant) {
		dao.whiteDrawal(compte, montant);
	}

	@Override
	public void depot(CompteCourant compte, double montant) {
		dao.deposit(compte, montant);
	}

	@Override
	public void virement(CompteCourant compteDebiteur, CompteCourant compteCrediteur, double montantVirement) {
		dao.transfer(compteCrediteur, compteDebiteur, montantVirement);
	}

}
