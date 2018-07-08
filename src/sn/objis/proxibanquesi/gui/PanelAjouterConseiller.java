package sn.objis.proxibanquesi.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.BorderLayout;

public class PanelAjouterConseiller extends JPanel {
	private JTextField tfCode;
	private JTextField tfTel;
	private JTextField tfLogin;
	private JTextField tfPasswd;
	private JTextField tfPrenom;
	private JTextField tfEmail;
	private JTextField tfAdresse;
	private JPasswordField pfPasswd;

	/**
	 * Create the panel.
	 */
	public PanelAjouterConseiller() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelNord = new JPanel();
		add(panelNord, BorderLayout.NORTH);
		panelNord.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitre = new JLabel("Ajouter un employé");
		lblTitre.setForeground(Color.BLUE);
		lblTitre.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		panelNord.add(lblTitre, BorderLayout.SOUTH);
		
		JPanel panelCentre = new JPanel();
		add(panelCentre, BorderLayout.CENTER);
		panelCentre.setLayout(null);
		
		JLabel lblCode = new JLabel("Code : ");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setForeground(Color.BLUE);
		lblCode.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCode.setBounds(45, 61, 55, 20);
		panelCentre.add(lblCode);
		
		tfCode = new JTextField();
		tfCode.setHorizontalAlignment(SwingConstants.CENTER);
		tfCode.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfCode.setColumns(10);
		tfCode.setBounds(143, 62, 160, 20);
		panelCentre.add(tfCode);
		
		JLabel lblEmail = new JLabel("Email : ");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.BLUE);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEmail.setBounds(349, 60, 55, 20);
		panelCentre.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tfEmail.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfEmail.setColumns(10);
		tfEmail.setBounds(450, 60, 160, 20);
		panelCentre.add(tfEmail);
		
		tfTel = new JTextField();
		tfTel.setHorizontalAlignment(SwingConstants.CENTER);
		tfTel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfTel.setColumns(10);
		tfTel.setBounds(144, 194, 160, 20);
		panelCentre.add(tfTel);
		
		JLabel lblLogin = new JLabel("Login : ");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.BLUE);
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 12));
		lblLogin.setBounds(43, 107, 55, 20);
		panelCentre.add(lblLogin);
		
		tfLogin = new JTextField();
		tfLogin.setHorizontalAlignment(SwingConstants.CENTER);
		tfLogin.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfLogin.setColumns(10);
		tfLogin.setBounds(144, 106, 160, 20);
		panelCentre.add(tfLogin);
		
		JLabel lblPasswd = new JLabel("Password : ");
		lblPasswd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswd.setForeground(Color.BLUE);
		lblPasswd.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPasswd.setBounds(349, 104, 81, 20);
		panelCentre.add(lblPasswd);
		
		JLabel label_4 = new JLabel("Nom : ");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Verdana", Font.BOLD, 12));
		label_4.setBounds(43, 148, 46, 20);
		panelCentre.add(label_4);
		
		tfPasswd = new JTextField();
		tfPasswd.setHorizontalAlignment(SwingConstants.CENTER);
		tfPasswd.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfPasswd.setColumns(10);
		tfPasswd.setBounds(143, 148, 160, 20);
		panelCentre.add(tfPasswd);
		
		JLabel lblPrenom = new JLabel("Prénom : ");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setForeground(Color.BLUE);
		lblPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrenom.setBounds(347, 149, 66, 20);
		panelCentre.add(lblPrenom);
		
		tfPrenom = new JTextField();
		tfPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		tfPrenom.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfPrenom.setColumns(10);
		tfPrenom.setBounds(451, 153, 160, 20);
		panelCentre.add(tfPrenom);
		
		JLabel lblTel = new JLabel("Téléphone : ");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setForeground(Color.BLUE);
		lblTel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTel.setBounds(45, 194, 81, 20);
		panelCentre.add(lblTel);
		
		JLabel lblAdresse = new JLabel("Adresse : ");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setForeground(Color.BLUE);
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdresse.setBounds(350, 197, 66, 20);
		panelCentre.add(lblAdresse);
		
		tfAdresse = new JTextField();
		tfAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		tfAdresse.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		tfAdresse.setColumns(10);
		tfAdresse.setBounds(450, 197, 160, 20);
		panelCentre.add(tfAdresse);
		
		pfPasswd = new JPasswordField();
		pfPasswd.setHorizontalAlignment(SwingConstants.CENTER);
		pfPasswd.setFont(new Font("Verdana", Font.BOLD, 12));
		pfPasswd.setBounds(451, 104, 160, 20);
		panelCentre.add(pfPasswd);
		
		JButton button = new JButton("Ajouter");
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Verdana", Font.BOLD, 12));
		button.setBorder(UIManager.getBorder("Button.border"));
		button.setBounds(212, 284, 111, 29);
		panelCentre.add(button);
		
		JButton button_1 = new JButton("Annuler");
		button_1.setForeground(Color.BLUE);
		button_1.setFont(new Font("Verdana", Font.BOLD, 12));
		button_1.setBorder(UIManager.getBorder("Button.border"));
		button_1.setBounds(347, 284, 111, 29);
		panelCentre.add(button_1);

	}
}
