package sn.objis.proxibanquesi.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import sn.objis.proxibanquesi.domaine.CompteUtilisateur;
import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.service.IServiceCompteUserImpl;
import sn.objis.proxibanquesi.service.IServiceEmployeImpl;
import sn.objis.proxibanquesi.service.IServiceLocaliteImpl;
import sn.objis.proxibanquesi.utils.CryptagePasswd;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;

public class FenModifierEmploye extends JFrame implements ActionListener {

	private JPanel contentPane;
	private IServiceEmployeImpl serviceEmploye;
	private IServiceCompteUserImpl serviceCompteUser;
	private IServiceLocaliteImpl serviceLocalite = new IServiceLocaliteImpl();
	private String mdpCrypter = null;

	private String emailInitial;
	private JComboBox cBoxAgence;
	private JTextField tfCode;
	private JTextField tfNom;
	private JTextField tfPrenom;
	private JTextField tfEmail;
	private JTextField tfTel;
	private JTextField tfAdresse;
	private JTextField tfCp;
	private JTextField tfVille;
	private JTextField tfProfession;
	private JTextField tfNum;
	private JTextField tfSolde;
	private JTextField tfCodeCompte;

	// Getters & Setters
	public JTextField getTfCode() {
		return tfCode;
	}

	public void setTfCode(JTextField tfCode) {
		this.tfCode = tfCode;
	}

	public JTextField getTfEmail() {
		return tfEmail;
	}

	public void setTfEmail(JTextField tfEmail) {
		this.tfEmail = tfEmail;
	}

	

	public JTextField getTfNom() {
		return tfNom;
	}

	public void setTfNom(JTextField tfNom) {
		this.tfNom = tfNom;
	}

	public JTextField getTfPrenom() {
		return tfPrenom;
	}

	public void setTfPrenom(JTextField tfPrenom) {
		this.tfPrenom = tfPrenom;
	}

	public JTextField getTfTel() {
		return tfTel;
	}

	public void setTfTel(JTextField tfTel) {
		this.tfTel = tfTel;
	}

	public JTextField getTfAdresse() {
		return tfAdresse;
	}

	public void setTfAdresse(JTextField tfAdresse) {
		this.tfAdresse = tfAdresse;
	}



	/**
	 * Create the frame.
	 */
	public FenModifierEmploye(String email) {
		setBounds(0, 0, 650, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelClient = new JPanel();
		panelClient.setLayout(null);
		panelClient.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informations du client",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panelClient.setBounds(10, 50, 343, 344);
		contentPane.add(panelClient);
		
		JLabel lblCode = new JLabel("Code :");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setForeground(Color.BLUE);
		lblCode.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCode.setBounds(21, 11, 55, 26);
		panelClient.add(lblCode);
		
		tfCode = new JTextField();
		tfCode.setHorizontalAlignment(SwingConstants.CENTER);
		tfCode.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfCode.setColumns(10);
		tfCode.setBounds(138, 14, 196, 20);
		panelClient.add(tfCode);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setForeground(Color.BLUE);
		lblNom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNom.setBounds(20, 48, 55, 27);
		panelClient.add(lblNom);
		
		tfNom = new JTextField();
		tfNom.setHorizontalAlignment(SwingConstants.CENTER);
		tfNom.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfNom.setColumns(10);
		tfNom.setBounds(138, 51, 196, 20);
		panelClient.add(tfNom);
		
		JLabel lblPrenom = new JLabel("Prénom :");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setForeground(Color.BLUE);
		lblPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrenom.setBounds(20, 86, 73, 26);
		panelClient.add(lblPrenom);
		
		tfPrenom = new JTextField();
		tfPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		tfPrenom.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfPrenom.setColumns(10);
		tfPrenom.setBounds(138, 89, 196, 20);
		panelClient.add(tfPrenom);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.BLUE);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEmail.setBounds(20, 160, 58, 26);
		panelClient.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tfEmail.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfEmail.setColumns(10);
		tfEmail.setBounds(138, 163, 196, 20);
		panelClient.add(tfEmail);
		
		JLabel lblTel = new JLabel("Téléphone :");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setForeground(Color.BLUE);
		lblTel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTel.setBounds(20, 123, 87, 26);
		panelClient.add(lblTel);
		
		tfTel = new JTextField();
		tfTel.setHorizontalAlignment(SwingConstants.CENTER);
		tfTel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfTel.setColumns(10);
		tfTel.setBounds(138, 127, 196, 20);
		panelClient.add(tfTel);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setForeground(Color.BLUE);
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdresse.setBounds(21, 197, 73, 26);
		panelClient.add(lblAdresse);
		
		tfAdresse = new JTextField();
		tfAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		tfAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		tfAdresse.setColumns(10);
		tfAdresse.setBounds(139, 201, 196, 20);
		panelClient.add(tfAdresse);
		
		JLabel lblCp = new JLabel("Code Postale :");
		lblCp.setHorizontalAlignment(SwingConstants.CENTER);
		lblCp.setForeground(Color.BLUE);
		lblCp.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCp.setBounds(20, 234, 108, 26);
		panelClient.add(lblCp);
		
		tfCp = new JTextField();
		tfCp.setHorizontalAlignment(SwingConstants.CENTER);
		tfCp.setFont(new Font("Verdana", Font.BOLD, 12));
		tfCp.setColumns(10);
		tfCp.setBounds(138, 238, 196, 20);
		panelClient.add(tfCp);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setHorizontalAlignment(SwingConstants.CENTER);
		lblVille.setForeground(Color.BLUE);
		lblVille.setFont(new Font("Verdana", Font.BOLD, 12));
		lblVille.setBounds(20, 271, 55, 26);
		panelClient.add(lblVille);
		
		tfVille = new JTextField();
		tfVille.setHorizontalAlignment(SwingConstants.CENTER);
		tfVille.setFont(new Font("Verdana", Font.BOLD, 12));
		tfVille.setColumns(10);
		tfVille.setBounds(138, 275, 196, 20);
		panelClient.add(tfVille);
		
		JLabel lblPrefession = new JLabel("Profession :");
		lblPrefession.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrefession.setForeground(Color.BLUE);
		lblPrefession.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrefession.setBounds(21, 308, 87, 26);
		panelClient.add(lblPrefession);
		
		tfProfession = new JTextField();
		tfProfession.setHorizontalAlignment(SwingConstants.CENTER);
		tfProfession.setFont(new Font("Verdana", Font.BOLD, 12));
		tfProfession.setColumns(10);
		tfProfession.setBounds(139, 312, 196, 20);
		panelClient.add(tfProfession);
		
		JPanel panelCompte = new JPanel();
		panelCompte.setLayout(null);
		panelCompte.setBorder(new TitledBorder(null, "Informations du compte bancaire", TitledBorder.LEADING,
						TitledBorder.TOP, null, Color.BLUE));
		panelCompte.setBounds(363, 50, 261, 185);
		contentPane.add(panelCompte);
		
		tfNum = new JTextField();
		tfNum.setHorizontalAlignment(SwingConstants.CENTER);
		tfNum.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfNum.setColumns(10);
		tfNum.setBounds(82, 64, 170, 20);
		panelCompte.add(tfNum);
		
		JLabel lblNum = new JLabel("Numéro :");
		lblNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum.setForeground(Color.BLUE);
		lblNum.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNum.setBounds(11, 61, 61, 27);
		panelCompte.add(lblNum);
		
		JLabel lblSolde = new JLabel("Solde :");
		lblSolde.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolde.setForeground(Color.BLUE);
		lblSolde.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSolde.setBounds(10, 99, 47, 26);
		panelCompte.add(lblSolde);
		
		tfSolde = new JTextField();
		tfSolde.setHorizontalAlignment(SwingConstants.CENTER);
		tfSolde.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfSolde.setColumns(10);
		tfSolde.setBounds(82, 102, 170, 20);
		panelCompte.add(tfSolde);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(null);
		panel_2.setBounds(82, 142, 170, 23);
		panelCompte.add(panel_2);
		
		JCheckBox cbxEpargne = new JCheckBox("Epargne");
		cbxEpargne.setForeground(Color.BLUE);
		cbxEpargne.setFont(new Font("Verdana", Font.BOLD, 12));
		cbxEpargne.setBounds(90, 0, 80, 23);
		panel_2.add(cbxEpargne);
		
		JCheckBox cbxCourant = new JCheckBox("Courant");
		cbxCourant.setForeground(Color.BLUE);
		cbxCourant.setFont(new Font("Verdana", Font.BOLD, 12));
		cbxCourant.setBounds(0, 0, 79, 23);
		panel_2.add(cbxCourant);
		
		JLabel lblType = new JLabel("Type :");
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setForeground(Color.BLUE);
		lblType.setFont(new Font("Verdana", Font.BOLD, 12));
		lblType.setBounds(11, 139, 41, 26);
		panelCompte.add(lblType);
		
		JLabel lblCodeCompte = new JLabel("Code :");
		lblCodeCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodeCompte.setForeground(Color.BLUE);
		lblCodeCompte.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCodeCompte.setBounds(11, 26, 47, 27);
		panelCompte.add(lblCodeCompte);
		
		tfCodeCompte = new JTextField();
		tfCodeCompte.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodeCompte.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfCodeCompte.setColumns(10);
		tfCodeCompte.setBounds(82, 29, 170, 20);
		panelCompte.add(tfCodeCompte);
		
		JPanel panelBtn = new JPanel();
		panelBtn.setLayout(null);
		panelBtn.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelBtn.setBounds(363, 254, 261, 48);
		contentPane.add(panelBtn);
		
		JButton btnCreer = new JButton("Créer");
		btnCreer.setForeground(Color.BLUE);
		btnCreer.setFont(new Font("Verdana", Font.BOLD, 12));
		btnCreer.setBounds(10, 5, 111, 32);
		panelBtn.add(btnCreer);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setForeground(Color.BLUE);
		btnAnnuler.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAnnuler.setBounds(140, 5, 111, 32);
		panelBtn.add(btnAnnuler);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER,
								TitledBorder.BELOW_BOTTOM, null, Color.WHITE));
		panel_4.setBounds(0, 0, 634, 39);
		contentPane.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel label_13 = new JLabel("Ajouter un client");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.BLUE);
		label_13.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		panel_4.add(label_13, BorderLayout.NORTH);
		setLocationRelativeTo(null);
		serviceEmploye = new IServiceEmployeImpl();
		serviceCompteUser = new IServiceCompteUserImpl();
		emailInitial = email;

		ButtonGroup group = new ButtonGroup();

		cBoxAgence = new JComboBox();
		cBoxAgence.setFont(new Font("Verdana", Font.BOLD, 12));
		cBoxAgence = serviceLocalite.getNomLocalite();

		cBoxAgence.setBounds(149, 278, 159, 20);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
