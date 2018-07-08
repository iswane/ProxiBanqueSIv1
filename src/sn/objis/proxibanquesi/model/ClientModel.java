/**
 * 
 */
package sn.objis.proxibanquesi.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import sn.objis.proxibanquesi.domaine.Client;
import sn.objis.proxibanquesi.service.IServiceClientImpl;


/**
 * @author OBJIS #10000codeurs
 *
 */
public class ClientModel extends AbstractTableModel {

	private String[] entete = { "Code ", "Nom ", "Prenom ", "Téléphone ", "Email ", "Adresse ", "CodePostal", "Ville", "Profession" };
	private IServiceClientImpl serviceClient;
	private List<Client> listeClients;

	public ClientModel() {

		serviceClient = new IServiceClientImpl();
		listeClients = serviceClient.Lister();
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
		return listeClients.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int colIndex) {
		switch (colIndex) {
		case 0:
			return listeClients.get(rowIndex).getCodeClient();
		case 1:
			return listeClients.get(rowIndex).getNomClient();
		case 2:
			return listeClients.get(rowIndex).getPrenomClient();
		case 3:
			return listeClients.get(rowIndex).getTelClient();
		case 4:
			return listeClients.get(rowIndex).getEmailClient();
		case 5:
			return listeClients.get(rowIndex).getAdresseClient();
		case 6:
			return listeClients.get(rowIndex).getCodePostalClient();
		case 7:
			return listeClients.get(rowIndex).getVilleClient();
		case 8:
			return listeClients.get(rowIndex).getProfessionClient();
		default:
			throw new IllegalArgumentException();
		}
	}

	public void addClient(Client client) {
		listeClients.add(client);
		fireTableRowsInserted(listeClients.size() - 1, listeClients.size() - 1);
	}

	public void removeClient(int rowIndex) {
		listeClients.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
	}

}
