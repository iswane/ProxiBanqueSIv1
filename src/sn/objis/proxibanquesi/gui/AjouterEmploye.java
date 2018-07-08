package sn.objis.proxibanquesi.gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class AjouterEmploye extends JInternalFrame {
	private JTextField tfCode;
	private JTextField tfEmail;
	private JTextField tfLogin;
	private JTextField tfNom;
	private JTextField tfPrenom;
	private JTextField tfTel;
	private JTextField tfAdresse;
	private JPasswordField pfPasswd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterEmploye frame = new AjouterEmploye();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AjouterEmploye() {
		setBounds(100, 100, 660, 465);
		getContentPane().setLayout(null);
		
		JPanel panelNord = new JPanel();
		panelNord.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER,
						TitledBorder.BELOW_BOTTOM, null, Color.WHITE));
		panelNord.setBounds(0, 0, 644, 38);
		getContentPane().add(panelNord);
		panelNord.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTitre = new JLabel("Ajouter un employé !!!");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setForeground(Color.BLUE);
		lblTitre.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		panelNord.add(lblTitre);
		
		JPanel panelCentre = new JPanel();
		panelCentre.setLayout(null);
		panelCentre.setBounds(0, 38, 644, 397);
		getContentPane().add(panelCentre);
		
		JLabel lblCode = new JLabel("Code : ");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setForeground(Color.BLUE);
		lblCode.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCode.setBounds(35, 57, 55, 20);
		panelCentre.add(lblCode);
		
		tfCode = new JTextField();
		tfCode.setHorizontalAlignment(SwingConstants.CENTER);
		tfCode.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfCode.setColumns(10);
		tfCode.setBounds(130, 57, 160, 20);
		panelCentre.add(tfCode);
		
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
		
		JLabel lblPasswd = new JLabel("Password : ");
		lblPasswd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswd.setForeground(Color.BLUE);
		lblPasswd.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPasswd.setBounds(332, 102, 81, 20);
		panelCentre.add(lblPasswd);
		
		pfPasswd = new JPasswordField();
		pfPasswd.setHorizontalAlignment(SwingConstants.CENTER);
		pfPasswd.setFont(new Font("Verdana", Font.BOLD, 12));
		pfPasswd.setBounds(447, 103, 160, 20);
		panelCentre.add(pfPasswd);
		
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
		
		JLabel lblPrenom = new JLabel("Prénom : ");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setForeground(Color.BLUE);
		lblPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrenom.setBounds(332, 146, 66, 20);
		panelCentre.add(lblPrenom);
		
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
		
		JLabel lblRole = new JLabel("Role : ");
		lblRole.setHorizontalAlignment(SwingConstants.CENTER);
		lblRole.setForeground(Color.BLUE);
		lblRole.setFont(new Font("Verdana", Font.BOLD, 12));
		lblRole.setBounds(35, 236, 46, 20);
		panelCentre.add(lblRole);
		
		JRadioButton radioButton = new JRadioButton("Gérant");
		radioButton.setFont(new Font("Verdana", Font.BOLD, 12));
		radioButton.setBounds(130, 237, 71, 23);
		panelCentre.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Conseiller");
		radioButton_1.setFont(new Font("Verdana", Font.BOLD, 12));
		radioButton_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		radioButton_1.setBounds(203, 237, 91, 23);
		panelCentre.add(radioButton_1);
		
		JLabel lblAgence = new JLabel("Agence : ");
		lblAgence.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgence.setForeground(Color.BLUE);
		lblAgence.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAgence.setBounds(35, 277, 61, 20);
		panelCentre.add(lblAgence);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setForeground(Color.BLUE);
		btnValider.setFont(new Font("Verdana", Font.BOLD, 12));
		btnValider.setBorder(UIManager.getBorder("Button.border"));
		btnValider.setBounds(221, 341, 111, 29);
		panelCentre.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setForeground(Color.BLUE);
		btnAnnuler.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAnnuler.setBorder(UIManager.getBorder("Button.border"));
		btnAnnuler.setBounds(356, 341, 111, 29);
		panelCentre.add(btnAnnuler);

	}
}
