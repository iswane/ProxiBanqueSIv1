/**
 * 
 */
package sn.objis.proxibanquesi.service;

import java.util.List;

import javax.swing.ButtonGroup;

import sn.objis.proxibanquesi.domaine.Role;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IServiceRole extends IService<Role>{

	public List<String> recupNomRole();
	
}
