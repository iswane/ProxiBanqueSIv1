package sn.objis.proxibanquesi.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import com.sun.javafx.font.Disposer;
import com.sun.media.jfxmediaimpl.MediaDisposer.Disposable;

import sn.objis.proxibanquesi.domaine.CompteUtilisateur;
import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.service.IServiceCompteUserImpl;
import sn.objis.proxibanquesi.service.IServiceEmployeImpl;
import sn.objis.proxibanquesi.utils.CryptagePasswd;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class PanelModifierEmploye extends JPanel {

	private IServiceEmployeImpl serviceEmploye;
	private IServiceCompteUserImpl serviceCompteUser;
	private String mdpCrypter = null;
	private JTextField tfCode;
	private JTextField tfEmail;
	private JTextField tfLogin;
	private JTextField tfNom;
	private JTextField tfPrenom;
	private JTextField tfTel;
	private JTextField tfAdresse;
	private JPasswordField pfPasswd;

	private String emailInitial;

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

	public JTextField getTfLogin() {
		return tfLogin;
	}

	public void setTfLogin(JTextField tfLogin) {
		this.tfLogin = tfLogin;
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

	public JPasswordField getPfPasswd() {
		return pfPasswd;
	}

	public void setPfPasswd(JPasswordField pfPasswd) {
		this.pfPasswd = pfPasswd;
	}

	/**
	 * Create the panel.
	 */
	public PanelModifierEmploye(String email) {
		emailInitial = email;
		setLayout(new BorderLayout(0, 0));

		JPanel panelCentre = new JPanel();
		add(panelCentre, BorderLayout.CENTER);
		panelCentre.setLayout(null);

		JLabel lblCode = new JLabel("Code : ");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setForeground(Color.BLUE);
		lblCode.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCode.setBounds(52, 41, 55, 20);
		panelCentre.add(lblCode);

		tfCode = new JTextField();
		tfCode.setHorizontalAlignment(SwingConstants.CENTER);
		tfCode.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfCode.setColumns(10);
		tfCode.setBounds(147, 41, 160, 20);
		panelCentre.add(tfCode);

		JLabel lblEmail = new JLabel("Email : ");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.BLUE);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEmail.setBounds(331, 41, 55, 20);
		panelCentre.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tfEmail.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfEmail.setColumns(10);
		tfEmail.setBounds(446, 41, 160, 20);
		panelCentre.add(tfEmail);

		JLabel lblLogin = new JLabel("Login : ");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.BLUE);
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 12));
		lblLogin.setBounds(52, 86, 55, 20);
		panelCentre.add(lblLogin);

		tfLogin = new JTextField();
		tfLogin.setHorizontalAlignment(SwingConstants.CENTER);
		tfLogin.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfLogin.setColumns(10);
		tfLogin.setBounds(147, 86, 160, 20);
		panelCentre.add(tfLogin);

		JLabel lblPasswd = new JLabel("Password : ");
		lblPasswd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswd.setForeground(Color.BLUE);
		lblPasswd.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPasswd.setBounds(331, 86, 81, 20);
		panelCentre.add(lblPasswd);

		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setForeground(Color.BLUE);
		lblNom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNom.setBounds(52, 130, 46, 20);
		panelCentre.add(lblNom);

		tfNom = new JTextField();
		tfNom.setHorizontalAlignment(SwingConstants.CENTER);
		tfNom.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfNom.setColumns(10);
		tfNom.setBounds(147, 130, 160, 20);
		panelCentre.add(tfNom);

		JLabel lblPrenom = new JLabel("Prénom : ");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setForeground(Color.BLUE);
		lblPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrenom.setBounds(331, 130, 66, 20);
		panelCentre.add(lblPrenom);

		tfPrenom = new JTextField();
		tfPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		tfPrenom.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfPrenom.setColumns(10);
		tfPrenom.setBounds(446, 130, 160, 20);
		panelCentre.add(tfPrenom);

		JLabel lblTel = new JLabel("Téléphone : ");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setForeground(Color.BLUE);
		lblTel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTel.setBounds(52, 177, 81, 20);
		panelCentre.add(lblTel);

		tfTel = new JTextField();
		tfTel.setHorizontalAlignment(SwingConstants.CENTER);
		tfTel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfTel.setColumns(10);
		tfTel.setBounds(147, 177, 160, 20);
		panelCentre.add(tfTel);

		JLabel lblAdresse = new JLabel("Adresse : ");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setForeground(Color.BLUE);
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdresse.setBounds(331, 177, 66, 20);
		panelCentre.add(lblAdresse);

		tfAdresse = new JTextField();
		tfAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		tfAdresse.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfAdresse.setColumns(10);
		tfAdresse.setBounds(446, 177, 160, 20);
		panelCentre.add(tfAdresse);

		pfPasswd = new JPasswordField();
		pfPasswd.setHorizontalAlignment(SwingConstants.CENTER);
		pfPasswd.setFont(new Font("Verdana", Font.BOLD, 12));
		pfPasswd.setBounds(446, 87, 160, 20);
		panelCentre.add(pfPasswd);

		JLabel lblRole = new JLabel("Role : ");
		lblRole.setHorizontalAlignment(SwingConstants.CENTER);
		lblRole.setForeground(Color.BLUE);
		lblRole.setFont(new Font("Verdana", Font.BOLD, 12));
		lblRole.setBounds(52, 220, 46, 20);
		panelCentre.add(lblRole);

		JRadioButton rbntGerant = new JRadioButton("Gérant");
		rbntGerant.setFont(new Font("Verdana", Font.BOLD, 12));
		rbntGerant.setBounds(147, 221, 71, 23);
		panelCentre.add(rbntGerant);

		JRadioButton rbtnConseiller = new JRadioButton("Conseiller");
		rbtnConseiller.setFont(new Font("Verdana", Font.BOLD, 12));
		rbtnConseiller.setBorder(new LineBorder(new Color(0, 0, 0)));
		rbtnConseiller.setBounds(220, 221, 91, 23);
		panelCentre.add(rbtnConseiller);

		JLabel lblAgence = new JLabel("Agence : ");
		lblAgence.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgence.setForeground(Color.BLUE);
		lblAgence.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAgence.setBounds(52, 261, 61, 20);
		panelCentre.add(lblAgence);

		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				serviceEmploye = new IServiceEmployeImpl();
				serviceCompteUser = new IServiceCompteUserImpl();

				Employe employeToModify = null;
				CompteUtilisateur userModify = null;

				boolean areEmpty = false;

				// Récupération des valeurs saisies
				String codeEmpToModify = tfCode.getText();
				String nouveauEmail = tfEmail.getText();
				String loginEmpToModify = tfLogin.getText();
				String nouveauPassword = pfPasswd.getText();
				String nouveauNom = tfNom.getText();
				String nouveauPrenom = tfPrenom.getText();

				areEmpty = (!loginEmpToModify.isEmpty()) && (!nouveauPassword.isEmpty()) && (!nouveauNom.isEmpty())
						&& (!nouveauPrenom.isEmpty()) && (!nouveauEmail.isEmpty());

				if (areEmpty == true) {

					employeToModify = serviceEmploye.rechercherParCle(emailInitial);
					long idEmlpoye = employeToModify.getIdEmploye();
					userModify = serviceCompteUser.rechercherParId(idEmlpoye);

					employeToModify.setCodeEmploye(codeEmpToModify);
					employeToModify.setEmailEmploye(nouveauEmail);
					employeToModify.setNomEmploye(nouveauNom);
					employeToModify.setPrenomEmploye(nouveauPrenom);

					serviceEmploye.maj(employeToModify);

					JOptionPane.showMessageDialog(null, "Modification Réussi");

				} else {
					JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires !!");
				}
			}
		});
		btnAjouter.setForeground(Color.BLUE);
		btnAjouter.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAjouter.setBorder(UIManager.getBorder("Button.border"));
		btnAjouter.setBounds(196, 317, 111, 29);
		panelCentre.add(btnAjouter);

		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnnuler.setForeground(Color.BLUE);
		btnAnnuler.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAnnuler.setBorder(UIManager.getBorder("Button.border"));
		btnAnnuler.setBounds(331, 317, 111, 29);
		panelCentre.add(btnAnnuler);

		JPanel panelNord = new JPanel();
		add(panelNord, BorderLayout.NORTH);
		panelNord.setLayout(new BorderLayout(0, 0));

		JLabel lblTitre = new JLabel("Modification d'un employé");
		panelNord.add(lblTitre, BorderLayout.SOUTH);
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setForeground(Color.BLUE);
		lblTitre.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));

	}

}
