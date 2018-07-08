package sn.objis.proxibanquesi.gui;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.sun.javafx.fxml.ParseTraceElement;

import sn.objis.proxibanquesi.domaine.Client;
import sn.objis.proxibanquesi.domaine.CompteCourant;
import sn.objis.proxibanquesi.domaine.CompteEpargne;

import sn.objis.proxibanquesi.service.IServiceClientImpl;
import sn.objis.proxibanquesi.service.IServiceCompteCourantImpl;
import sn.objis.proxibanquesi.service.IServiceCompteEpargneImpl;

import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.ButtonGroup;
import java.awt.BorderLayout;

public class FenAjouterClient extends JFrame {

	IServiceClientImpl serviceClient = new IServiceClientImpl();
	IServiceCompteCourantImpl serviceCompteCourant = new IServiceCompteCourantImpl();
	IServiceCompteEpargneImpl serviceCompteEpargne = new IServiceCompteEpargneImpl();

	private JPanel contentPane;
	private JTextField tfCode;
	private JTextField tfNom;
	private JTextField tfPrenom;
	private JTextField tfEmail;
	private JTextField tfTel;
	private JTextField tfAdresse;
	private JTextField tfCP;
	private JTextField tfVille;
	private JTextField tfProfession;
	private JPanel panelCompte;
	private JTextField tfNumCompte;
	private JLabel lblNumCompte;
	private JLabel lblSolde;
	private JTextField tfSolde;
	private JTextField tfCodeCompte;
	private JCheckBox cbxCourant;
	private JCheckBox cbxEpargne;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public FenAjouterClient() {
		setBounds(0, 0, 650, 466);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelClient = new JPanel();
		panelClient.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informations du client",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panelClient.setBounds(10, 50, 343, 344);
		contentPane.add(panelClient);
		panelClient.setLayout(null);

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
		tfAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		tfAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		tfAdresse.setColumns(10);
		tfAdresse.setBounds(139, 201, 196, 20);
		panelClient.add(tfAdresse);

		JLabel lblCodePostal = new JLabel("Code Postale :");
		lblCodePostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodePostal.setForeground(Color.BLUE);
		lblCodePostal.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCodePostal.setBounds(20, 234, 108, 26);
		panelClient.add(lblCodePostal);

		tfCP = new JTextField();
		tfCP.setFont(new Font("Verdana", Font.BOLD, 12));
		tfCP.setHorizontalAlignment(SwingConstants.CENTER);
		tfCP.setColumns(10);
		tfCP.setBounds(138, 238, 196, 20);
		panelClient.add(tfCP);

		JLabel lblVille = new JLabel("Ville :");
		lblVille.setHorizontalAlignment(SwingConstants.CENTER);
		lblVille.setForeground(Color.BLUE);
		lblVille.setFont(new Font("Verdana", Font.BOLD, 12));
		lblVille.setBounds(20, 271, 55, 26);
		panelClient.add(lblVille);

		tfVille = new JTextField();
		tfVille.setFont(new Font("Verdana", Font.BOLD, 12));
		tfVille.setHorizontalAlignment(SwingConstants.CENTER);
		tfVille.setColumns(10);
		tfVille.setBounds(138, 275, 196, 20);
		panelClient.add(tfVille);

		JLabel lblProfession = new JLabel("Profession :");
		lblProfession.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfession.setForeground(Color.BLUE);
		lblProfession.setFont(new Font("Verdana", Font.BOLD, 12));
		lblProfession.setBounds(21, 308, 87, 26);
		panelClient.add(lblProfession);

		tfProfession = new JTextField();
		tfProfession.setFont(new Font("Verdana", Font.BOLD, 12));
		tfProfession.setHorizontalAlignment(SwingConstants.CENTER);
		tfProfession.setColumns(10);
		tfProfession.setBounds(139, 312, 196, 20);
		panelClient.add(tfProfession);

		panelCompte = new JPanel();
		panelCompte.setBorder(new TitledBorder(null, "Informations du compte bancaire", TitledBorder.LEADING,
				TitledBorder.TOP, null, Color.BLUE));
		panelCompte.setBounds(363, 50, 261, 185);
		contentPane.add(panelCompte);
		panelCompte.setLayout(null);

		tfNumCompte = new JTextField();
		tfNumCompte.setHorizontalAlignment(SwingConstants.CENTER);
		tfNumCompte.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfNumCompte.setColumns(10);
		tfNumCompte.setBounds(82, 64, 170, 20);
		panelCompte.add(tfNumCompte);

		lblNumCompte = new JLabel("Numéro :");
		lblNumCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumCompte.setForeground(Color.BLUE);
		lblNumCompte.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNumCompte.setBounds(11, 61, 61, 27);
		panelCompte.add(lblNumCompte);

		lblSolde = new JLabel("Solde :");
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

		JPanel panelCheck = new JPanel();
		panelCheck.setBorder(null);
		panelCheck.setBounds(82, 142, 170, 23);
		panelCompte.add(panelCheck);
		panelCheck.setLayout(null);

		cbxEpargne = new JCheckBox("Epargne");
		buttonGroup.add(cbxEpargne);
		cbxEpargne.setBounds(90, 0, 80, 23);
		panelCheck.add(cbxEpargne);
		cbxEpargne.setForeground(Color.BLUE);
		cbxEpargne.setFont(new Font("Verdana", Font.BOLD, 12));

		cbxCourant = new JCheckBox("Courant");
		buttonGroup.add(cbxCourant);
		cbxCourant.setBounds(0, 0, 79, 23);
		panelCheck.add(cbxCourant);
		cbxCourant.setForeground(Color.BLUE);
		cbxCourant.setFont(new Font("Verdana", Font.BOLD, 12));

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
		panelBtn.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelBtn.setBounds(363, 254, 261, 48);
		contentPane.add(panelBtn);
		panelBtn.setLayout(null);

		JButton btnCreer = new JButton("Créer");
		btnCreer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Client client = null;
				CompteCourant cC = null;
				CompteEpargne cE = null;
				boolean areEmpty = false;

				// Récuperation des valeurs saisies
				String codeSaisi = tfCode.getText();
				String nomSaisi = tfNom.getText();
				String prenomSaisi = tfPrenom.getText();
				String emailSaisi = tfEmail.getText();
				String adresseSaisi = tfAdresse.getText();
				String telSaisi = tfTel.getText();
				String cpSaisi = tfCP.getText();
				String villeSiasi = tfVille.getText();
				String professionSaisi = tfProfession.getText();

				String codeCompteSaisi = tfCodeCompte.getText();
				long numCompteSaisi = Long.valueOf(tfNumCompte.getText()) ;
				double soldeSaisi = Double.valueOf(tfSolde.getText());
				
				double decouvert = 1000;
				double taux = 0.03;

				String check = "";
				for (Component c : panelCheck.getComponents()) {
					if (c.getClass().equals(JCheckBox.class)) {
						JCheckBox jck = (JCheckBox) c;
						if (jck.isSelected()) {
							check = jck.getText();
						}
					}
				}
				String choixCheck = check;

				areEmpty = (!codeSaisi.isEmpty()) && (!nomSaisi.isEmpty()) && (!prenomSaisi.isEmpty())
						&& (!emailSaisi.isEmpty()) && (!adresseSaisi.isEmpty()) && (!telSaisi.isEmpty())
						&& (!cpSaisi.isEmpty()) && (!villeSiasi.isEmpty()) && (!professionSaisi.isEmpty())
						&& (!codeCompteSaisi.isEmpty()) && (numCompteSaisi != 0) && (soldeSaisi != 0)
						&& (!choixCheck.isEmpty());

				if (areEmpty == true) {
					client = new Client(codeSaisi, nomSaisi, prenomSaisi, telSaisi, emailSaisi, adresseSaisi, cpSaisi,
							villeSiasi, professionSaisi);
					serviceClient.ajouter(client);

					if (choixCheck == "Courant") {
						cC = new CompteCourant(numCompteSaisi, soldeSaisi, codeCompteSaisi, decouvert);
						serviceCompteCourant.ajouter(cC);
					}else{
						cE = new CompteEpargne(numCompteSaisi, soldeSaisi, codeCompteSaisi, taux);
						serviceCompteEpargne.ajouter(cE);
					}

					JOptionPane.showMessageDialog(null, "Client ajouté avec succès !!!");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires !!!");
				}
			}
		});
		btnCreer.setBounds(10, 5, 111, 32);
		btnCreer.setForeground(Color.BLUE);
		btnCreer.setFont(new Font("Verdana", Font.BOLD, 12));
		panelBtn.add(btnCreer);

		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfCode.setText("");
				tfNom.setText("");
				tfPrenom.setText("");
				tfEmail.setText("");
				tfAdresse.setText("");
				tfTel.setText("");
				tfCP.setText("");
				tfVille.setText("");
				tfProfession.setText("");
				tfCodeCompte.setText("");
				tfNumCompte.setText("");
				tfSolde.setText("");
				buttonGroup.clearSelection();
			}
		});
		btnAnnuler.setBounds(140, 5, 111, 32);
		btnAnnuler.setForeground(Color.BLUE);
		btnAnnuler.setFont(new Font("Verdana", Font.BOLD, 12));
		panelBtn.add(btnAnnuler);
		
		JPanel panelTitre = new JPanel();
		panelTitre.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER,
						TitledBorder.BELOW_BOTTOM, null, Color.WHITE));
		panelTitre.setBounds(0, 0, 634, 39);
		contentPane.add(panelTitre);
		panelTitre.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitre = new JLabel("Ajouter un client");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setForeground(Color.BLUE);
		lblTitre.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		panelTitre.add(lblTitre, BorderLayout.NORTH);
	}
}
