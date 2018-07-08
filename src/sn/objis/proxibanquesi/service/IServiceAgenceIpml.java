/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import sn.objis.proxibanquesi.dao.IDaoAgenceImpl;
import sn.objis.proxibanquesi.domaine.Agence;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceAgenceIpml implements IServiceAgence {

	private IDaoAgenceImpl dao = new IDaoAgenceImpl();

	@Override
	public void ajouter(Agence t) {
		dao.create(t);
	}

	@Override
	public List<Agence> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(Agence t) {
		dao.update(t);
	}

	@Override
	public void supprimer(Agence t) {
		dao.delete(t);
	}

	@Override
	public long recupIdAgence() {
		return dao.recupIdAgence();
	}

}
