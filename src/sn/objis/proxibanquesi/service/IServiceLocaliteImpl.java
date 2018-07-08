/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import javax.swing.JComboBox;

import sn.objis.proxibanquesi.dao.IDaoLocaliteImpl;
import sn.objis.proxibanquesi.domaine.Localite;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceLocaliteImpl implements IServiceLocalite {

	private IDaoLocaliteImpl dao = new IDaoLocaliteImpl();

	@Override
	public void ajouter(Localite t) {
		dao.create(t);
	}

	@Override
	public List<Localite> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(Localite t) {
		dao.update(t);
	}

	@Override
	public void supprimer(Localite t) {
		dao.delete(t);
	}

	@Override
	public JComboBox getNomLocalite() {
		return dao.getNomLocalite();
	}

}
