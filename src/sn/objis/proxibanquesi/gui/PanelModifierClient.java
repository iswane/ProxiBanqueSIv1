package sn.objis.proxibanquesi.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import com.sun.media.jfxmediaimpl.MediaDisposer.Disposable;

import sn.objis.proxibanquesi.domaine.Employe;
import sn.objis.proxibanquesi.service.IServiceEmployeImpl;
import sn.objis.proxibanquesi.utils.CryptagePasswd;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelModifierClient extends JPanel {
	private JTextField tfCode;
	private JTextField tfNom;
	private JTextField tfPrenom;
	private JTextField tfEmail;
	private JTextField tfTel;
	private JTextField tfAdresse;

	private IServiceEmployeImpl serviceEmploye;
	private String mdpCrypter = null;
	private JTextField tfCodePostale;
	private JTextField tfVille;
	private JTextField tfProfession;

	/**
	 * Create the panel.
	 */
	public PanelModifierClient() {
		setLayout(null);

		JLabel lblTitre = new JLabel("Modification d'un client");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setForeground(Color.BLUE);
		lblTitre.setFont(new Font("Verdana", Font.BOLD, 14));
		lblTitre.setBounds(139, 29, 230, 26);
		add(lblTitre);

		JLabel lblCode = new JLabel("Code :");
		lblCode.setForeground(Color.BLUE);
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCode.setBounds(95, 66, 55, 26);
		add(lblCode);

		tfCode = new JTextField();
		tfCode.setHorizontalAlignment(SwingConstants.CENTER);
		tfCode.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfCode.setBounds(213, 69, 196, 20);
		add(tfCode);
		tfCode.setColumns(10);

		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setForeground(Color.BLUE);
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdresse.setBounds(95, 258, 73, 26);
		add(lblAdresse);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setForeground(Color.BLUE);
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNom.setBounds(95, 103, 55, 27);
		add(lblNom);

		tfNom = new JTextField();
		tfNom.setHorizontalAlignment(SwingConstants.CENTER);
		tfNom.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfNom.setBounds(213, 106, 196, 20);
		add(tfNom);
		tfNom.setColumns(10);

		JLabel lblPrenom = new JLabel("Prénom :");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setForeground(Color.BLUE);
		lblPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrenom.setBounds(95, 141, 73, 26);
		add(lblPrenom);

		tfPrenom = new JTextField();
		tfPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		tfPrenom.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfPrenom.setBounds(213, 144, 196, 20);
		add(tfPrenom);
		tfPrenom.setColumns(10);

		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setForeground(Color.BLUE);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(95, 221, 58, 26);
		add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tfEmail.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfEmail.setBounds(213, 224, 196, 20);
		add(tfEmail);
		tfEmail.setColumns(10);

		JLabel lblTel = new JLabel("Téléphone :");
		lblTel.setForeground(Color.BLUE);
		lblTel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setBounds(95, 183, 87, 26);
		add(lblTel);

		tfTel = new JTextField();
		tfTel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfTel.setHorizontalAlignment(SwingConstants.CENTER);
		tfTel.setBounds(213, 187, 196, 20);
		add(tfTel);
		tfTel.setColumns(10);

		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				serviceEmploye = new IServiceEmployeImpl();
				boolean areEmpty = false;
				// Récuperation des information de l'employé
				String codeSaisi = tfCode.getText();
				String nomSaisi = tfNom.getText();
				String prenomSaisi = tfPrenom.getText();
				String emailSaisi = tfEmail.getText();
				String telephoneSaisi = tfTel.getText();
				String adresseSaisi = tfAdresse.getText();

				areEmpty = (!codeSaisi.isEmpty()) && (!nomSaisi.isEmpty()) && (!prenomSaisi.isEmpty())
						&& (!emailSaisi.isEmpty()) && (!telephoneSaisi.isEmpty() && (!adresseSaisi.isEmpty()));

				if (areEmpty = true) {

					Employe emp = new Employe(codeSaisi, nomSaisi, prenomSaisi, telephoneSaisi, emailSaisi,
							adresseSaisi);
					serviceEmploye.ajouter(emp);
					JOptionPane.showMessageDialog(null, "Employé ajouté avec succès !!!");
				} else {
					JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs !!!");
				}
			}
		});
		btnValider.setForeground(Color.BLUE);
		btnValider.setFont(new Font("Verdana", Font.BOLD, 12));
		btnValider.setBounds(159, 446, 89, 23);
		add(btnValider);

		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setForeground(Color.BLUE);
		btnAnnuler.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAnnuler.setBounds(281, 446, 89, 23);
		add(btnAnnuler);

		tfAdresse = new JTextField();
		tfAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		tfAdresse.setBounds(213, 262, 196, 20);
		add(tfAdresse);
		tfAdresse.setColumns(10);

		JLabel lblCodePostale = new JLabel("Code Postale :");
		lblCodePostale.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodePostale.setForeground(Color.BLUE);
		lblCodePostale.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCodePostale.setBounds(95, 305, 108, 26);
		add(lblCodePostale);

		tfCodePostale = new JTextField();
		tfCodePostale.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodePostale.setColumns(10);
		tfCodePostale.setBounds(213, 309, 196, 20);
		add(tfCodePostale);

		JLabel lblVille = new JLabel("Ville :");
		lblVille.setHorizontalAlignment(SwingConstants.CENTER);
		lblVille.setForeground(Color.BLUE);
		lblVille.setFont(new Font("Verdana", Font.BOLD, 12));
		lblVille.setBounds(95, 347, 55, 26);
		add(lblVille);

		tfVille = new JTextField();
		tfVille.setHorizontalAlignment(SwingConstants.CENTER);
		tfVille.setColumns(10);
		tfVille.setBounds(213, 351, 196, 20);
		add(tfVille);

		JLabel lblProfession = new JLabel("Profession :");
		lblProfession.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfession.setForeground(Color.BLUE);
		lblProfession.setFont(new Font("Verdana", Font.BOLD, 12));
		lblProfession.setBounds(95, 384, 87, 26);
		add(lblProfession);

		tfProfession = new JTextField();
		tfProfession.setHorizontalAlignment(SwingConstants.CENTER);
		tfProfession.setColumns(10);
		tfProfession.setBounds(213, 388, 196, 20);
		add(tfProfession);

	}
}
