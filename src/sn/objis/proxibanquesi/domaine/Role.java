/**
 * 
 */
package sn.objis.proxibanquesi.domaine;

import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class Role {

	// Attributs
	private long idRole;
	private String codeRole;
	private String nomRole;
	private List<Employe> listeEmployes;

	// Constructeurs
	public Role() {
		super();
	}
	
	public Role(long idRole) {
		super();
		this.idRole = idRole;
	}

	public Role(long idRole, String nomRole, String codeRole) {
		super();
		this.idRole = idRole;
		this.nomRole = nomRole;
		this.setCodeRole(codeRole);
	}

	// Getters & Setters

	public Role(String codeRole2, String nomRole2) {
		// TODO Auto-generated constructor stub
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	public List<Employe> getListeEmployes() {
		return listeEmployes;
	}

	public void setListeEmployes(List<Employe> listeEmployes) {
		this.listeEmployes = listeEmployes;
	}

	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	public String getCodeRole() {
		return codeRole;
	}

	public void setCodeRole(String codeRole) {
		this.codeRole = codeRole;
	}

}
