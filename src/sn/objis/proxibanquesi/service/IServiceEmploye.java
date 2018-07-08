/**
 * 
 */
package sn.objis.proxibanquesi.service;

import sn.objis.proxibanquesi.domaine.Employe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IServiceEmploye extends IService<Employe>{

	public Employe rechercherParCle(String cle);

	public long recupIdEmploye();

	public long recupIdRole(long idEmploye);
}
