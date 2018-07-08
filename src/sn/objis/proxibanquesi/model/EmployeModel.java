/**
 * 
 */
package sn.objis.proxibanquesi.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.service.IServiceEmployeImpl;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class EmployeModel extends AbstractTableModel {

	private String[] entete = {"Code ", "Nom ", "Prenom ", "Téléphone ", "Email ", "Adresse "};
	private IServiceEmployeImpl serviceEmploye;
	private List<Employe> listeEmployes;

	public EmployeModel() {

		serviceEmploye = new IServiceEmployeImpl();
		listeEmployes = serviceEmploye.Lister();
	}

	@Override
	public String getColumnName(int column) {
		return entete[column];
	}

	@Override
	public int getColumnCount() {
		return entete.length;
	}

	@Override
	public int getRowCount() {
		return listeEmployes.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int colIndex) {
		switch (colIndex) {
		case 0:
			return listeEmployes.get(rowIndex).getCodeEmploye();
		case 1:
			return listeEmployes.get(rowIndex).getNomEmploye();
		case 2:
			return listeEmployes.get(rowIndex).getPrenomEmploye();
		case 3:
			return listeEmployes.get(rowIndex).getTelEmploye();
		case 4:
			return listeEmployes.get(rowIndex).getEmailEmploye();
		case 5:
			return listeEmployes.get(rowIndex).getAdresseEmploye();
		default:
			throw new IllegalArgumentException();
		}
	}

	public void addEmploye(Employe emp) {
		listeEmployes.add(emp);
		fireTableRowsInserted(listeEmployes.size() - 1, listeEmployes.size() - 1);
	}

	public void removeEmploye(int rowIndex) {
		listeEmployes.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
	}

}
