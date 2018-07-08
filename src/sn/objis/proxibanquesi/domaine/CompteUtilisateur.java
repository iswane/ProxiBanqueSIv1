/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.Date;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class CompteUtilisateur {

	// Attributs
	private int idCompteUser;
	private Date dateCreateCompteUser;
	private boolean etatCompteUser;
	private String login;
	private String passwd;
	private Employe employe;

	// Constructeurs
	public CompteUtilisateur() {
		super();
	}

	public CompteUtilisateur(String login, String passwd) {
		super();
		this.login = login;
		this.passwd = passwd;
	}
	
	public CompteUtilisateur(boolean etatCompteUser, String login, String passwd) {
		super();
		this.etatCompteUser = etatCompteUser;
		this.login = login;
		this.passwd = passwd;
	}

	public CompteUtilisateur(Date dateCreateCompteUser, boolean etatCompteUser, String login, String passwd) {
		super();
		this.dateCreateCompteUser = dateCreateCompteUser;
		this.etatCompteUser = etatCompteUser;
		this.login = login;
		this.passwd = passwd;
	}

	public CompteUtilisateur(Date dateCreateCompteUser, boolean etatCompteUser, String login, String passwd,
			Employe employe) {
		super();
		this.dateCreateCompteUser = dateCreateCompteUser;
		this.etatCompteUser = etatCompteUser;
		this.login = login;
		this.passwd = passwd;
		this.employe = employe;
	}

	public CompteUtilisateur(Date dateCreateCompteUser, boolean etatCompteUser, String login, String passwd,
			long idEmploye) {
		super();
		this.dateCreateCompteUser = dateCreateCompteUser;
		this.etatCompteUser = etatCompteUser;
		this.login = login;
		this.passwd = passwd;
		idEmploye = employe.getIdEmploye();
	}

	// Getters & Setters

	public Date getDateCreateCompteUser() {
		return dateCreateCompteUser;
	}

	public void setDateCreateCompteUser(Date dateCreateCompteUser) {
		this.dateCreateCompteUser = dateCreateCompteUser;
	}

	public boolean isEtatCompteUser() {
		return etatCompteUser;
	}

	public void setEtatCompteUser(boolean etatCompteUser) {
		this.etatCompteUser = etatCompteUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public int getIdCompteUser() {
		return idCompteUser;
	}

	public void setIdCompteUser(int idCompteUser) {
		this.idCompteUser = idCompteUser;
	}

}
