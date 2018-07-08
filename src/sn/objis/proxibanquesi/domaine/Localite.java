/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class Localite {

	// Attributs
	private long idLocalite;
	private String nomLocalite;
	private String longitudeLocalite;
	private String latitudeLocalite;
	private List<Agence> agences;

	// Constructeurs
	public Localite() {
		super();
	}

	public Localite(long idLocalite, String nomLocalite, String longitudeLocalite, String latitudeLocalite) {
		super();
		this.idLocalite = idLocalite;
		this.nomLocalite = nomLocalite;
		this.longitudeLocalite = longitudeLocalite;
		this.latitudeLocalite = latitudeLocalite;
	}

	// Getters & Setters

	public Localite(String nomLocalite2, String longitudeLocalite2, String latitudeLocalite2) {
		// TODO Auto-generated constructor stub
	}

	public String getNomLocalite() {
		return nomLocalite;
	}

	public void setNomLocalite(String nomLocalite) {
		this.nomLocalite = nomLocalite;
	}

	public String getLongitudeLocalite() {
		return longitudeLocalite;
	}

	public void setLongitudeLocalite(String longitudeLocalite) {
		this.longitudeLocalite = longitudeLocalite;
	}

	public String getLatitudeLocalite() {
		return latitudeLocalite;
	}

	public void setLatitudeLocalite(String latitudeLocalite) {
		this.latitudeLocalite = latitudeLocalite;
	}

	public List<Agence> getAgences() {
		return agences;
	}

	public void setAgences(List<Agence> agences) {
		this.agences = agences;
	}

	public long getIdLocalite() {
		return idLocalite;
	}

	public void setIdLocalite(long idLocalite) {
		this.idLocalite = idLocalite;
	}

}
