/**
 * 
 */
package sn.objis.proxibanquesi.dao;

import java.util.List;

import javax.swing.ButtonGroup;

import sn.objis.proxibanquesi.domaine.Role;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoRole extends IDao<Role> {
	
	public List<String> recupNomRole();
	
}
