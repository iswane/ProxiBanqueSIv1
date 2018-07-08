/**
 * 
 */
package sn.objis.proxibanquesi.dao;


import javax.swing.JComboBox;

import sn.objis.proxibanquesi.domaine.Localite;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoLocalite extends IDao<Localite>{
	
	public JComboBox getNomLocalite();

}
