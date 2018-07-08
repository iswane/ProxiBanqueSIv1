/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import javax.swing.ButtonGroup;

import sn.objis.proxibanquesi.dao.IDaoRoleImpl;
import sn.objis.proxibanquesi.domaine.Role;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceRoleImpl implements IServiceRole {

	private IDaoRoleImpl dao = new IDaoRoleImpl();

	@Override
	public void ajouter(Role t) {
		dao.create(t);
	}

	@Override
	public List<Role> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(Role t) {
		dao.update(t);
	}

	@Override
	public void supprimer(Role t) {
		dao.delete(t);
	}

	@Override
	public List<String> recupNomRole() {
		return dao.recupNomRole();
	}

}
