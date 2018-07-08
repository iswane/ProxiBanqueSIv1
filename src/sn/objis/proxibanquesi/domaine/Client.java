/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class Client {

	// Attributs
	private long idClient;
	private String codeClient;
	private String nomClient;
	private String prenomClient;
	private String telClient;
	private String emailClient;
	private String adresseClient;
	private String codePostalClient;
	private String villeClient;
	private String professionClient;
	private Employe employe;
	private List<Compte> listeComptes;
	private List<CarteBancaire> listeCarteBancaires;

	// Constructeurs
	public Client() {
		super();
	}

	public Client(String codeClient, String nomClient, String prenomClient, String telClient, String emailClient,
			String adresseClient, String codePostalClient, String villeClient, String professionClient) {
		super();
		this.codeClient = codeClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.telClient = telClient;
		this.emailClient = emailClient;
		this.adresseClient = adresseClient;
		this.codePostalClient = codePostalClient;
		this.villeClient = villeClient;
		this.professionClient = professionClient;
	}

	// Getters & Setters

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getTelClient() {
		return telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public String getCodePostalClient() {
		return codePostalClient;
	}

	public void setCodePostalClient(String codePostalClient) {
		this.codePostalClient = codePostalClient;
	}

	public String getVilleClient() {
		return villeClient;
	}

	public void setVilleClient(String villeClient) {
		this.villeClient = villeClient;
	}

	public String getProfessionClient() {
		return professionClient;
	}

	public void setProfessionClient(String professionClient) {
		this.professionClient = professionClient;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public List<Compte> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(List<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}

	public List<CarteBancaire> getListeCarteBancaires() {
		return listeCarteBancaires;
	}

	public void setListeCarteBancaires(List<CarteBancaire> listeCarteBancaires) {
		this.listeCarteBancaires = listeCarteBancaires;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	public String getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}

}
