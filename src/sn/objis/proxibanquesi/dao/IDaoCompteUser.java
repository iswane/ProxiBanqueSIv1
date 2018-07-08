/**
 * 
 */
package sn.objis.proxibanquesi.dao;

import sn.objis.proxibanquesi.domaine.CompteUtilisateur;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoCompteUser extends IDao<CompteUtilisateur> {

	public boolean authentification(String login, String passwd);
	
	public CompteUtilisateur findById(long id);
	
	public long recupIdEmp(String login, String passwd);
}
