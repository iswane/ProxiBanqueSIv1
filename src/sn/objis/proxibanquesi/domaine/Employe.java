/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class Employe {

	// Attributs
	private long idEmploye;
	private String codeEmploye;
	private String nomEmploye;
	private String prenomEmploye;
	private String telEmploye;
	private String emailEmploye;
	private String adresseEmploye;
	private Agence agence;
	private Role role;
	private Employe manager;
	private List<Employe> listeEmployes;
	private CompteUtilisateur compteUtilisateur;
	private List<Client> listeClients;
	private List<Transaction> listeTransactions;
	private long idAgence;
	private long idRole;

	// Constructeurs
	public Employe() {
		super();
	}

	public Employe(long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public Employe(String codeEmploye, String nomEmploye, String prenomEmploye, String telEmploye, String emailEmploye,
			String adresseEmploye) {
		this.codeEmploye = codeEmploye;
		this.nomEmploye = nomEmploye;
		this.prenomEmploye = prenomEmploye;
		this.telEmploye = telEmploye;
		this.emailEmploye = emailEmploye;
		this.adresseEmploye = adresseEmploye;
	}

	public Employe(String codeEmploye, String nomEmploye, String prenomEmploye, String telEmploye, String emailEmploye,
			String adresseEmploye, Agence agence, Role role) {
		super();
		this.codeEmploye = codeEmploye;
		this.nomEmploye = nomEmploye;
		this.prenomEmploye = prenomEmploye;
		this.telEmploye = telEmploye;
		this.emailEmploye = emailEmploye;
		this.adresseEmploye = adresseEmploye;
		this.agence = agence;
		this.role = role;
	}

	public Employe(String codeEmploye, String nomEmploye, String prenomEmploye, String telEmploye, String emailEmploye,
			String adresseEmploye, long idAgence, long idRole) {
		super();
		this.codeEmploye = codeEmploye;
		this.nomEmploye = nomEmploye;
		this.prenomEmploye = prenomEmploye;
		this.telEmploye = telEmploye;
		this.emailEmploye = emailEmploye;
		this.adresseEmploye = adresseEmploye;
		this.idAgence = idAgence;
		this.idRole = idRole;
	}

	// Gettres & Setters

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public String getPrenomEmploye() {
		return prenomEmploye;
	}

	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}

	public String getTelEmploye() {
		return telEmploye;
	}

	public void setTelEmploye(String telEmploye) {
		this.telEmploye = telEmploye;
	}

	public String getEmailEmploye() {
		return emailEmploye;
	}

	public void setEmailEmploye(String emailEmploye) {
		this.emailEmploye = emailEmploye;
	}

	public String getAdresseEmploye() {
		return adresseEmploye;
	}

	public void setAdresseEmploye(String adresseEmploye) {
		this.adresseEmploye = adresseEmploye;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public CompteUtilisateur getCompteUtilisateur() {
		return compteUtilisateur;
	}

	public void setCompteUtilisateur(CompteUtilisateur compteUtilisateur) {
		this.compteUtilisateur = compteUtilisateur;
	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	public List<Transaction> getListeTransactions() {
		return listeTransactions;
	}

	public void setListeTransactions(List<Transaction> listeTransactions) {
		this.listeTransactions = listeTransactions;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getCodeEmploye() {
		return codeEmploye;
	}

	public void setCodeEmploye(String codeEmploye) {
		this.codeEmploye = codeEmploye;
	}

	public Employe getManager() {
		return manager;
	}

	public void setManager(Employe manager) {
		this.manager = manager;
	}

	public List<Employe> getListeEmployes() {
		return listeEmployes;
	}

	public void setListeEmployes(List<Employe> listeEmployes) {
		this.listeEmployes = listeEmployes;
	}

	public long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(long idAgence) {
		this.idAgence = idAgence;
	}

	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

}
