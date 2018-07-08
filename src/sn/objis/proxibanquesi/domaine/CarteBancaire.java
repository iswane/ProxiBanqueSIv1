/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class CarteBancaire {

	// Attributs
	private long idCarte;
	private long numcarte;
	private String descriptionCarte;
	private Client client;
	private TypeCarte typeCarte;

	// Constructeurs
	public CarteBancaire() {
		super();
	}

	public CarteBancaire(long numcarte, String descriptionCarte, Client client) {
		super();
		this.numcarte = numcarte;
		this.descriptionCarte = descriptionCarte;
		this.client = client;
	}

	// Getters & Setters

	public long getNumcarte() {
		return numcarte;
	}

	public void setNumcarte(long numcarte) {
		this.numcarte = numcarte;
	}

	public String getDescriptionCarte() {
		return descriptionCarte;
	}

	public void setDescriptionCarte(String descriptionCarte) {
		this.descriptionCarte = descriptionCarte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public TypeCarte getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(TypeCarte typeCarte) {
		this.typeCarte = typeCarte;
	}

	public long getIdCarte() {
		return idCarte;
	}

	public void setIdCarte(long idCarte) {
		this.idCarte = idCarte;
	}

}
