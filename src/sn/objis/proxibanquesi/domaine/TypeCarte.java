/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class TypeCarte {

	// Attributs
	private long idTypeCatre;
	private String libelleTypeCarte;
	private List<CarteBancaire> listeCartes;

	// Constructeurs
	public TypeCarte() {
		super();
	}

	public TypeCarte(String libelleTypeCarte) {
		super();
		this.libelleTypeCarte = libelleTypeCarte;
	}

	// Getters & Setters

	public String getLibelleTypeCarte() {
		return libelleTypeCarte;
	}

	public void setLibelleTypeCarte(String libelleTypeCarte) {
		this.libelleTypeCarte = libelleTypeCarte;
	}

	public List<CarteBancaire> getListeCartes() {
		return listeCartes;
	}

	public void setListeCartes(List<CarteBancaire> listeCartes) {
		this.listeCartes = listeCartes;
	}

	public long getIdTypeCatre() {
		return idTypeCatre;
	}

	public void setIdTypeCatre(long idTypeCatre) {
		this.idTypeCatre = idTypeCatre;
	}

}
