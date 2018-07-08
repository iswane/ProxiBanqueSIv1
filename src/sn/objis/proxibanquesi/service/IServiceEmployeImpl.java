/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import sn.objis.proxibanquesi.dao.IDaoEmployeImpl;
import sn.objis.proxibanquesi.domaine.Employe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceEmployeImpl implements IServiceEmploye {

	private IDaoEmployeImpl dao = new IDaoEmployeImpl();

	@Override
	public void ajouter(Employe t) {
		dao.create(t);
	}

	@Override
	public List<Employe> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(Employe t) {
		dao.update(t);
	}

	@Override
	public void supprimer(Employe t) {
		dao.delete(t);
	}

	@Override
	public long recupIdEmploye() {
		return dao.recupIdEmploye();
	}

	@Override
	public Employe rechercherParCle(String cle) {
		return dao.findByKey(cle);
	}

	@Override
	public long recupIdRole(long idEmploye) {
		// TODO Auto-generated method stub
		return dao.recupIdRole(idEmploye);
	}

}
