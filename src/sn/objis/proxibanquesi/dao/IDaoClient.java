package sn.objis.proxibanquesi.dao;

import sn.objis.proxibanquesi.domaine.Client;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoClient extends IDao<Client>{

	/**
	 * @param key
	 * @return
	 */
	public Client findByKey(String key);
	
	/**
	 * @return
	 */
	public long recupIdClient();
}
