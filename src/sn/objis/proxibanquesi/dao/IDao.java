/**
 * 
 */
package sn.objis.proxibanquesi.dao;

import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDao<T> {
	
	/**
	 * @param t
	 */
	public void create(T t);
	
	/**
	 * @return
	 */
	public List<T> getAll();
	
	/**
	 * @param t
	 */
	public void update(T t);
	
	/**
	 * @param t
	 */
	public void delete(T t);

}
