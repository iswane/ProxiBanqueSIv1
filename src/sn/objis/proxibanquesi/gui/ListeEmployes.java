package sn.objis.proxibanquesi.gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;

import sn.objis.proxibanquesi.domaine.CompteUtilisateur;
import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.model.EmployeModel;
import sn.objis.proxibanquesi.service.IServiceEmployeImpl;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListeEmployes extends JInternalFrame {
	private JTextField tfSearch;
	private JTable table;
	private EmployeModel employeModel;
	private JDesktopPane desktopPane;
	private FenModifierEmploye modifierEmploye;
	private IServiceEmployeImpl serviceEmploye;

	/**
	 * Create the frame.
	 */
	public ListeEmployes() {
		setTitle("Liste des Employés de ProxiBanque");
		setBorder(null);
		setBounds(100, 100, 660, 465);
		getContentPane().setLayout(null);
		employeModel = new EmployeModel();
		desktopPane = new JDesktopPane();
		serviceEmploye = new IServiceEmployeImpl();

		JPanel panelTable = new JPanel();
		panelTable.setBounds(0, 0, 437, 377);
		getContentPane().add(panelTable);
		panelTable.setLayout(null);
		panelTable.setBorder(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 435, 377);
		panelTable.add(scrollPane);

		table = new JTable(employeModel);
		table.setFont(new Font("Verdana", Font.PLAIN, 12));
		scrollPane.setViewportView(table);

		JPanel panelIdentite = new JPanel();
		panelIdentite.setLayout(null);
		panelIdentite.setName("");
		panelIdentite.setBorder(new TitledBorder(

				new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP,

						null, new Color(64, 64, 64)),

				"Identit\u00E9 de l'employ\u00E9", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		panelIdentite.setBounds(444, 0, 207, 377);
		getContentPane().add(panelIdentite);

		JLabel lblCode = new JLabel("Code :");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCode.setBounds(10, 46, 44, 21);
		panelIdentite.add(lblCode);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNom.setBounds(10, 78, 44, 21);
		panelIdentite.add(lblNom);

		JLabel lblPrenom = new JLabel("Prénom :");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrenom.setBounds(10, 110, 60, 21);
		panelIdentite.add(lblPrenom);

		JLabel lblTel = new JLabel("Téléphone :");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTel.setBounds(10, 142, 77, 21);
		panelIdentite.add(lblTel);

		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEmail.setBounds(10, 174, 51, 21);
		panelIdentite.add(lblEmail);

		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdresse.setBounds(10, 206, 69, 21);
		panelIdentite.add(lblAdresse);

		JLabel txtCode = new JLabel("");
		txtCode.setHorizontalAlignment(SwingConstants.CENTER);
		txtCode.setFont(new Font("Verdana", Font.BOLD, 12));
		txtCode.setBounds(89, 50, 106, 21);
		panelIdentite.add(txtCode);

		JLabel txtNom = new JLabel("");
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setFont(new Font("Verdana", Font.BOLD, 12));
		txtNom.setBounds(89, 82, 106, 21);
		panelIdentite.add(txtNom);

		JLabel txtPrenom = new JLabel("");
		txtPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		txtPrenom.setBounds(89, 114, 106, 21);
		panelIdentite.add(txtPrenom);

		JLabel txtTel = new JLabel("");
		txtTel.setHorizontalAlignment(SwingConstants.CENTER);
		txtTel.setFont(new Font("Verdana", Font.BOLD, 12));
		txtTel.setBounds(89, 146, 106, 21);
		panelIdentite.add(txtTel);

		JLabel txtEmail = new JLabel("");
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		txtEmail.setBounds(89, 178, 106, 21);
		panelIdentite.add(txtEmail);

		JLabel txtAdresse = new JLabel("");
		txtAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		txtAdresse.setBounds(89, 210, 106, 21);
		panelIdentite.add(txtAdresse);

		JPanel panelBtn = new JPanel();
		panelBtn.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panelBtn.setBounds(10, 384, 641, 44);
		getContentPane().add(panelBtn);
		panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnAdd = new JButton("Ajouter");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FenAjouterEmploye employe = new FenAjouterEmploye();
				employe.setVisible(true);
				validate();
			}
		});
		btnAdd.setForeground(Color.BLUE);
		btnAdd.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		panelBtn.add(btnAdd);

		JButton btnUpdate = new JButton("Modifier");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Employe empToModify = null;

				int[] selection = table.getSelectedRows();

				if (selection.length == 0) {

					JOptionPane.showMessageDialog(null, "Veuillez selectionner la ligne à Modifier");

				} else {

					for (int i = 0; i < selection.length; i++) {
						int index = selection[i];

						String emailEmpToModify = (String) table.getValueAt(index, 0);

						empToModify = serviceEmploye.rechercherParCle(emailEmpToModify);
						modifierEmploye = new FenModifierEmploye(emailEmpToModify);

						modifierEmploye.getTfCode().setText(empToModify.getCodeEmploye());
						modifierEmploye.getTfEmail().setText(empToModify.getEmailEmploye());
						modifierEmploye.getTfNom().setText(empToModify.getNomEmploye());
						modifierEmploye.getTfPrenom().setText(empToModify.getPrenomEmploye());
						modifierEmploye.getTfTel().setText(empToModify.getTelEmploye());
						modifierEmploye.getTfAdresse().setText(empToModify.getAdresseEmploye());

						modifierEmploye.setVisible(true);
						validate();
					}

				}
			}
		});
		btnUpdate.setForeground(Color.BLUE);
		btnUpdate.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		panelBtn.add(btnUpdate);

		JButton btnDelete = new JButton("Supprimer");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employe empToDelete = null;

				int[] selection = table.getSelectedRows();
				//

				if (selection.length == 0) {

					JOptionPane.showMessageDialog(null, "Veuillez selectionner la ligne à supprimer");

				} else {

					for (int i = 0; i < selection.length; i++) {
						int index = selection[i];

						String emailEmpToDelete = (String) table.getValueAt(index, 0);

						empToDelete = serviceEmploye.rechercherParCle(emailEmpToDelete);

						if (JOptionPane.showConfirmDialog(null, "Voulez vous confirmer la suppréssion",
								"Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

							serviceEmploye.supprimer(empToDelete);
							employeModel.removeEmploye(index);

							JOptionPane.showMessageDialog(null, "Suppression reussie !!");
							dispose();
						}

					}

				}
			}
		});
		btnDelete.setForeground(Color.BLUE);
		btnDelete.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		panelBtn.add(btnDelete);

		tfSearch = new JTextField();
		tfSearch.setFont(new Font("Verdana", Font.BOLD, 14));
		panelBtn.add(tfSearch);
		tfSearch.setColumns(10);

		JButton btnSearch = new JButton("Recherche");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				Employe empSearch = null;
//				String nomSearch = tfSearch.getText();
//				empSearch = serviceEmploye.rechercherParCle(nomSearch);
//				table.setModel((TableModel) empSearch);
			}
		});
		btnSearch.setForeground(Color.BLUE);
		btnSearch.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		panelBtn.add(btnSearch);

	}
}
