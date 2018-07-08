package sn.objis.proxibanquesi.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import sn.objis.proxibanquesi.domaine.CompteUtilisateur;
import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.service.IServiceCompteUserImpl;
import sn.objis.proxibanquesi.service.IServiceEmployeImpl;
import sn.objis.proxibanquesi.service.IServiceLocaliteImpl;
import sn.objis.proxibanquesi.service.IServiceRole;
import sn.objis.proxibanquesi.service.IServiceRoleImpl;
import sn.objis.proxibanquesi.utils.CryptagePasswd;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Rectangle;

public class FenAjouterEmploye extends JFrame implements ActionListener {

	// Attributs
	private IServiceEmployeImpl serviceEmploye = new IServiceEmployeImpl();
	private IServiceCompteUserImpl serviceCompteUser = new IServiceCompteUserImpl();
	private IServiceLocaliteImpl serviceLocalite = new IServiceLocaliteImpl();

	private String mdpCrypter = null;

	private JTextField tfCode;
	private JTextField tfEmail;
	private JTextField tfLogin;
	private JTextField tfNom;
	private JTextField tfPrenom;
	private JTextField tfTel;
	private JTextField tfAdresse;
	private JPasswordField pfPassword;
	private JComboBox cBoxAgence;

	/**
	 * Create the frame.
	 */
	public FenAjouterEmploye() {
		setBounds(0, 0, 660, 465);
		getContentPane().setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		JPanel panelNord = new JPanel();
		panelNord.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER,
				TitledBorder.BELOW_BOTTOM, null, Color.WHITE));
		getContentPane().add(panelNord, BorderLayout.NORTH);
		panelNord.setLayout(new BorderLayout(0, 0));

		JLabel lblTitre = new JLabel("Ajouter un employé");
		lblTitre.setForeground(Color.BLUE);
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		panelNord.add(lblTitre, BorderLayout.SOUTH);

		JPanel panelCentre = new JPanel();
		getContentPane().add(panelCentre, BorderLayout.CENTER);
		panelCentre.setLayout(null);

		JLabel lblCode = new JLabel("Code : ");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setForeground(Color.BLUE);
		lblCode.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCode.setBounds(35, 57, 55, 20);
		panelCentre.add(lblCode);

		tfCode = new JTextField();
		tfCode.setHorizontalAlignment(SwingConstants.CENTER);
		tfCode.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfCode.setBounds(130, 57, 160, 20);
		panelCentre.add(tfCode);
		tfCode.setColumns(10);

		JLabel lblEmail = new JLabel("Email : ");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.BLUE);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEmail.setBounds(332, 57, 55, 20);
		panelCentre.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tfEmail.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfEmail.setColumns(10);
		tfEmail.setBounds(447, 57, 160, 20);
		panelCentre.add(tfEmail);

		JLabel lblLogin = new JLabel("Login : ");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.BLUE);
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 12));
		lblLogin.setBounds(35, 102, 55, 20);
		panelCentre.add(lblLogin);

		tfLogin = new JTextField();
		tfLogin.setHorizontalAlignment(SwingConstants.CENTER);
		tfLogin.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfLogin.setColumns(10);
		tfLogin.setBounds(130, 102, 160, 20);
		panelCentre.add(tfLogin);

		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPassword.setBounds(332, 102, 81, 20);
		panelCentre.add(lblPassword);

		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setForeground(Color.BLUE);
		lblNom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNom.setBounds(35, 146, 46, 20);
		panelCentre.add(lblNom);

		tfNom = new JTextField();
		tfNom.setHorizontalAlignment(SwingConstants.CENTER);
		tfNom.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfNom.setColumns(10);
		tfNom.setBounds(130, 146, 160, 20);
		panelCentre.add(tfNom);

		JLabel lblPrnom = new JLabel("Prénom : ");
		lblPrnom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrnom.setForeground(Color.BLUE);
		lblPrnom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrnom.setBounds(332, 146, 66, 20);
		panelCentre.add(lblPrnom);

		tfPrenom = new JTextField();
		tfPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		tfPrenom.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfPrenom.setColumns(10);
		tfPrenom.setBounds(447, 146, 160, 20);
		panelCentre.add(tfPrenom);

		JLabel lblTel = new JLabel("Téléphone : ");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setForeground(Color.BLUE);
		lblTel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTel.setBounds(35, 193, 81, 20);
		panelCentre.add(lblTel);

		tfTel = new JTextField();
		tfTel.setHorizontalAlignment(SwingConstants.CENTER);
		tfTel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfTel.setColumns(10);
		tfTel.setBounds(130, 193, 160, 20);
		panelCentre.add(tfTel);

		JLabel lblAdresse = new JLabel("Adresse : ");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setForeground(Color.BLUE);
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdresse.setBounds(332, 193, 66, 20);
		panelCentre.add(lblAdresse);

		tfAdresse = new JTextField();
		tfAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		tfAdresse.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfAdresse.setColumns(10);
		tfAdresse.setBounds(447, 193, 160, 20);
		panelCentre.add(tfAdresse);

		pfPassword = new JPasswordField();
		pfPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pfPassword.setFont(new Font("Verdana", Font.BOLD, 12));
		pfPassword.setBounds(447, 103, 160, 20);
		panelCentre.add(pfPassword);

		JLabel lblRole = new JLabel("Role : ");
		lblRole.setHorizontalAlignment(SwingConstants.CENTER);
		lblRole.setForeground(Color.BLUE);
		lblRole.setFont(new Font("Verdana", Font.BOLD, 12));
		lblRole.setBounds(35, 236, 46, 20);
		panelCentre.add(lblRole);

		ButtonGroup group = new ButtonGroup();
		JRadioButton rdbtnGerant = new JRadioButton("Gérant");
		rdbtnGerant.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		group.add(rdbtnGerant);
		rdbtnGerant.setFont(new Font("Verdana", Font.BOLD, 12));
		rdbtnGerant.setBounds(130, 237, 71, 23);
		panelCentre.add(rdbtnGerant);
		rdbtnGerant.addActionListener(this);

		JRadioButton rdbtnConseiller = new JRadioButton("Conseiller");
		rdbtnConseiller.setBorder(new LineBorder(new Color(0, 0, 0)));
		rdbtnConseiller.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		group.add(rdbtnConseiller);
		rdbtnConseiller.setFont(new Font("Verdana", Font.BOLD, 12));
		rdbtnConseiller.setBounds(203, 237, 91, 23);
		panelCentre.add(rdbtnConseiller);
		rdbtnConseiller.addActionListener(this);

		cBoxAgence = new JComboBox();
		cBoxAgence.setFont(new Font("Verdana", Font.BOLD, 12));
		cBoxAgence = serviceLocalite.getNomLocalite();

		cBoxAgence.setBounds(149, 278, 159, 20);
		panelCentre.add(cBoxAgence);

		JLabel lblAgence = new JLabel("Agence : ");
		lblAgence.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgence.setForeground(Color.BLUE);
		lblAgence.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAgence.setBounds(35, 277, 61, 20);
		panelCentre.add(lblAgence);

		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBorder(UIManager.getBorder("Button.border"));
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				Employe employe = null;
				long idAgence = 0;
				long idRole = 0;
				boolean areEmpty = false;

				// Récuperation des valeurs saisies
				String codeSaisi = tfCode.getText();
				String emailSaisi = tfEmail.getText();
				String loginSaisi = tfLogin.getText();
				String passwdSaisi = pfPassword.getText();
				String nomSaisi = tfNom.getText();
				String prenomSaisi = tfPrenom.getText();
				String telSaisi = tfTel.getText();
				String adresseSaisi = tfAdresse.getText();
				String boxChoisi = cBoxAgence.getSelectedItem().toString();
				int radiogroup = group.getButtonCount();

				switch (boxChoisi) {
				case "Objis":
					idAgence = 1;
					break;
				case "Centre BOPP":
					idAgence = 2;
					break;
				case "HLM":
					idAgence = 3;
					break;
				case "Grand Yoff":
					idAgence = 4;
					break;
				case "Touba":
					idAgence = 5;
					break;
				case "Tivaoune":
					idAgence = 6;
					break;
				case "Médine":
					idAgence = 7;
					break;
				case "Mecque":
					idAgence = 8;
					break;
				case "Mbour":
					idAgence = 9;
					break;
				case "AIDB":
					idAgence = 10;
					break;
				case "Rome":
					idAgence = 11;
					break;
				}
				
				switch (radiogroup) {
				case 1:
					idRole = 1;
					break;
				case 2:
					idRole = 2;
					break;
				}

				areEmpty = (!codeSaisi.isEmpty()) && (!emailSaisi.isEmpty()) && (!loginSaisi.isEmpty())
						&& (!passwdSaisi.isEmpty()) && (!nomSaisi.isEmpty()) && (!prenomSaisi.isEmpty())
						&& (!telSaisi.isEmpty()) && (!adresseSaisi.isEmpty());

				boolean etatCompteUser = true;

				if (areEmpty == true) {
					employe = new Employe(codeSaisi, nomSaisi, prenomSaisi, telSaisi, emailSaisi, adresseSaisi,
							idAgence, idRole);
					serviceEmploye.ajouter(employe);

					mdpCrypter = CryptagePasswd.chiffrage(passwdSaisi);
					CompteUtilisateur compteUser = new CompteUtilisateur(new Date(), etatCompteUser, loginSaisi,
							mdpCrypter);
					serviceCompteUser.ajouter(compteUser);

					JOptionPane.showMessageDialog(null, "Employé ajouté avec succès !!!");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires !!!");
				}

			}
		});

		btnAjouter.setForeground(Color.BLUE);
		btnAjouter.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAjouter.setBounds(221, 341, 111, 29);
		panelCentre.add(btnAjouter);

		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBorder(UIManager.getBorder("Button.border"));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfCode.setText("");
				tfEmail.setText("");
				tfLogin.setText("");
				pfPassword.setText("");
				tfNom.setText("");
				tfPrenom.setText("");
				tfTel.setText("");
				tfAdresse.setText("");
				cBoxAgence.setSelectedItem(null);
			}
		});
		btnAnnuler.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAnnuler.setForeground(Color.BLUE);
		btnAnnuler.setBounds(356, 341, 111, 29);
		panelCentre.add(btnAnnuler);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
