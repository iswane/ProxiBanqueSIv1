/**
 * 
 */
package sn.objis.proxibanquesi.service;

import sn.objis.proxibanquesi.domaine.CompteUtilisateur;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IServiceCompteUser extends IService<CompteUtilisateur> {

	public boolean authentification(String login, String passwd);

	public CompteUtilisateur rechercherParId(long id);
	
	public long recupIdEmp(String login, String passwd);

}
