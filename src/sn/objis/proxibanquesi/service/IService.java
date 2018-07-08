/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IService<T> {

	/**
	 * @param t
	 */
	public void ajouter(T t);

	/**
	 * @return
	 */
	public List<T> Lister();

	/**
	 * @param t
	 */
	public void maj(T t);

	/**
	 * @param t
	 */
	public void supprimer(T t);

}
