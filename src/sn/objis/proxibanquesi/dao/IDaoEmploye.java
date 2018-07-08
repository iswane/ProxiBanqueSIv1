/**
 * 
 */
package sn.objis.proxibanquesi.dao;

import sn.objis.proxibanquesi.domaine.Employe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoEmploye extends IDao<Employe> {

	/**
	 * @param key
	 * @return
	 */
	public Employe findByKey(String key);

	public long recupIdEmploye();

	public long recupIdRole(long idEmploye);
}
