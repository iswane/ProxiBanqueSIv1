/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import sn.objis.proxibanquesi.dao.IDaoClientImpl;
import sn.objis.proxibanquesi.domaine.Client;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceClientImpl implements IServiceClient{
	
	private IDaoClientImpl dao = new IDaoClientImpl();

	@Override
	public void ajouter(Client t) {
		dao.create(t);
	}

	@Override
	public List<Client> Lister() {
		return dao.getAll();
	}

	@Override
	public void maj(Client t) {
		dao.update(t);
	}

	@Override
	public void supprimer(Client t) {
		dao.delete(t);
	}

}
