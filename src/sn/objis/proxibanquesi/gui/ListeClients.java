package sn.objis.proxibanquesi.gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import sn.objis.proxibanquesi.model.ClientModel;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListeClients extends JInternalFrame {
	private JTextField tfSearch;
	private ClientModel clientModel;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public ListeClients() {
		setBorder(null);
		setTitle("Liste des Clients de ProxiBanque");
		setBounds(100, 100, 660, 465);
		getContentPane().setLayout(null);
		clientModel = new ClientModel();

		JPanel panelBtn = new JPanel();
		panelBtn.setBounds(10, 387, 623, 40);
		getContentPane().add(panelBtn);
		panelBtn.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FenAjouterClient ajouterClient = new FenAjouterClient();
				ajouterClient.setVisible(true);
				validate();
			}
		});
		btnAjouter.setForeground(Color.BLUE);
		btnAjouter.setFont(new Font("Verdana", Font.BOLD, 14));
		panelBtn.add(btnAjouter);

		JButton btnModifier = new JButton("Modifier");
		btnModifier.setForeground(Color.BLUE);
		btnModifier.setFont(new Font("Verdana", Font.BOLD, 14));
		panelBtn.add(btnModifier);

		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setForeground(Color.BLUE);
		btnSupprimer.setFont(new Font("Verdana", Font.BOLD, 14));
		panelBtn.add(btnSupprimer);

		tfSearch = new JTextField();
		tfSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfSearch.setColumns(10);
		panelBtn.add(tfSearch);

		JButton btnRechercher = new JButton("Recherche");
		btnRechercher.setForeground(Color.BLUE);
		btnRechercher.setFont(new Font("Verdana", Font.BOLD, 14));
		panelBtn.add(btnRechercher);

		JPanel panelIdentite = new JPanel();
		panelIdentite.setBounds(444, 0, 207, 377);
		getContentPane().add(panelIdentite);
		panelIdentite.setLayout(null);
		panelIdentite.setName("");
		panelIdentite.setBorder(new TitledBorder(

				new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP,

						null, new Color(64, 64, 64)),

				"Identit\u00E9 de l'employ\u00E9", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));

		JLabel lblCode = new JLabel("Code :");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCode.setBounds(10, 46, 44, 21);
		panelIdentite.add(lblCode);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNom.setBounds(10, 77, 44, 21);
		panelIdentite.add(lblNom);

		JLabel lblPrenom = new JLabel("Prénom :");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrenom.setBounds(10, 109, 60, 21);
		panelIdentite.add(lblPrenom);

		JLabel lblTel = new JLabel("Téléphone :");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTel.setBounds(10, 141, 77, 21);
		panelIdentite.add(lblTel);

		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEmail.setBounds(10, 173, 51, 21);
		panelIdentite.add(lblEmail);

		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdresse.setBounds(10, 205, 69, 21);
		panelIdentite.add(lblAdresse);

		JLabel txtCode = new JLabel("");
		txtCode.setHorizontalAlignment(SwingConstants.CENTER);
		txtCode.setFont(new Font("Verdana", Font.BOLD, 12));
		txtCode.setBounds(106, 49, 101, 21);
		panelIdentite.add(txtCode);

		JLabel txtNom = new JLabel("");
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setFont(new Font("Verdana", Font.BOLD, 12));
		txtNom.setBounds(106, 81, 101, 21);
		panelIdentite.add(txtNom);

		JLabel txtPrenom = new JLabel("");
		txtPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		txtPrenom.setBounds(106, 113, 101, 21);
		panelIdentite.add(txtPrenom);

		JLabel txtTel = new JLabel("");
		txtTel.setHorizontalAlignment(SwingConstants.CENTER);
		txtTel.setFont(new Font("Verdana", Font.BOLD, 12));
		txtTel.setBounds(106, 145, 101, 21);
		panelIdentite.add(txtTel);

		JLabel txtEmail = new JLabel("");
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		txtEmail.setBounds(106, 177, 101, 21);
		panelIdentite.add(txtEmail);

		JLabel txtAdresse = new JLabel("");
		txtAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		txtAdresse.setBounds(106, 209, 101, 21);
		panelIdentite.add(txtAdresse);

		JLabel lblCodePostal = new JLabel("Code Postal :");
		lblCodePostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodePostal.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCodePostal.setBounds(10, 245, 92, 21);
		panelIdentite.add(lblCodePostal);

		JLabel txtCodePostal = new JLabel("");
		txtCodePostal.setHorizontalAlignment(SwingConstants.CENTER);
		txtCodePostal.setFont(new Font("Verdana", Font.BOLD, 12));
		txtCodePostal.setBounds(106, 249, 101, 21);
		panelIdentite.add(txtCodePostal);

		JLabel lblVille = new JLabel("Ville :");
		lblVille.setHorizontalAlignment(SwingConstants.CENTER);
		lblVille.setFont(new Font("Verdana", Font.BOLD, 12));
		lblVille.setBounds(10, 285, 44, 21);
		panelIdentite.add(lblVille);

		JLabel txtVille = new JLabel("");
		txtVille.setHorizontalAlignment(SwingConstants.CENTER);
		txtVille.setFont(new Font("Verdana", Font.BOLD, 12));
		txtVille.setBounds(106, 285, 101, 21);
		panelIdentite.add(txtVille);
		
		JLabel lblProfession = new JLabel("Profession :");
		lblProfession.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfession.setFont(new Font("Verdana", Font.BOLD, 12));
		lblProfession.setBounds(10, 317, 86, 21);
		panelIdentite.add(lblProfession);
		
		JLabel txtProfession = new JLabel("");
		txtProfession.setHorizontalAlignment(SwingConstants.CENTER);
		txtProfession.setFont(new Font("Verdana", Font.BOLD, 12));
		txtProfession.setBounds(106, 317, 101, 21);
		panelIdentite.add(txtProfession);

		JPanel panelTable = new JPanel();
		panelTable.setBounds(0, 0, 437, 377);
		getContentPane().add(panelTable);
		panelTable.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 417, 355);
		panelTable.add(scrollPane);
		
		table = new JTable(clientModel);
		scrollPane.setViewportView(table);

		
		table.setFont(new Font("Verdana", Font.PLAIN, 12));

	}
}
