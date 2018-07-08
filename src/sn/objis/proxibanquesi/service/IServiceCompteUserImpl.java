/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import sn.objis.proxibanquesi.dao.IDaoCompteUserImpl;
import sn.objis.proxibanquesi.domaine.CompteUtilisateur;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceCompteUserImpl implements IServiceCompteUser{
	
	private IDaoCompteUserImpl dao = new IDaoCompteUserImpl();

	@Override
	public void ajouter(CompteUtilisateur t) {
		dao.create(t);
	}

	@Override
	public List<CompteUtilisateur> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(CompteUtilisateur t) {
		dao.update(t);
	}

	@Override
	public void supprimer(CompteUtilisateur t) {
		dao.delete(t);
	}

	@Override
	public CompteUtilisateur rechercherParId(long id) {
		return dao.findById(id);
	}

	@Override
	public boolean authentification(String login, String passwd) {
		return dao.authentification(login, passwd);
	}

	@Override
	public long recupIdEmp(String login, String passwd) {
		return dao.recupIdEmp(login, passwd);
	}

}
