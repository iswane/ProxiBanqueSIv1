/**
 * 
 */
package sn.objis.proxibanquesi.service;


import javax.swing.JComboBox;

import sn.objis.proxibanquesi.domaine.Localite;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IServiceLocalite extends IService<Localite>{
	public JComboBox getNomLocalite();
}
