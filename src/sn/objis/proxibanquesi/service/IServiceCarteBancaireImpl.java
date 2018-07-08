/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import sn.objis.proxibanquesi.dao.IDaoCarteBancaireImpl;
import sn.objis.proxibanquesi.domaine.CarteBancaire;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceCarteBancaireImpl implements IServiceCarteBancaire {

	private IDaoCarteBancaireImpl dao = new IDaoCarteBancaireImpl();

	@Override
	public void ajouter(CarteBancaire t) {
		dao.create(t);
	}

	@Override
	public List<CarteBancaire> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(CarteBancaire t) {
		dao.update(t);
	}

	@Override
	public void supprimer(CarteBancaire t) {
		dao.delete(t);
	}

}
