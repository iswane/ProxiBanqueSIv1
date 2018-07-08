package sn.objis.proxibanquesi.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import sn.objis.proxibanquesi.model.ClientModel;
import sn.objis.proxibanquesi.model.EmployeModel;

import javax.swing.UIManager;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenPricipaleClient extends JFrame {

	private int xMouse;
	private int yMouse;

	private JPanel contentPane;
	private JTextField tfRechercher;
	private JTable table;
	private JPanel panelTable;
	private JPanel panel;

	private ClientModel modelClient;

	/**
	 * Create the frame.
	 */
	public FenPricipaleClient() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMouve = new JLabel("");
		lblMouve.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		lblMouve.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {
				xMouse = evt.getX();
				yMouse = evt.getY();
			}
		});
		lblMouve.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				int x = evt.getXOnScreen();
				int y = evt.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);
			}
		});

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 89, 875, 465);
		contentPane.add(panel);

		JPanel panelBtn = new JPanel();
		panelBtn.setLayout(null);
		panelBtn.setBorder(null);
		panelBtn.setBounds(0, 0, 633, 35);
		panel.add(panelBtn);

		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				PanelAjouterClient panelAjouterClient = new PanelAjouterClient();
				panelAjouterClient.setVisible(true);
				dispose();
			}
		});
		btnAjouter.setForeground(Color.BLUE);
		btnAjouter.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAjouter.setBounds(10, 5, 92, 25);
		panelBtn.add(btnAjouter);

		JButton btnModifier = new JButton("Modifier");
		btnModifier.setForeground(Color.BLUE);
		btnModifier.setFont(new Font("Verdana", Font.BOLD, 12));
		btnModifier.setBounds(112, 5, 102, 25);
		panelBtn.add(btnModifier);

		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setForeground(Color.BLUE);
		btnSupprimer.setFont(new Font("Verdana", Font.BOLD, 12));
		btnSupprimer.setBounds(224, 5, 117, 25);
		panelBtn.add(btnSupprimer);

		tfRechercher = new JTextField();
		tfRechercher.setColumns(10);
		tfRechercher.setBounds(351, 8, 123, 20);
		panelBtn.add(tfRechercher);

		JButton btnRechercher = new JButton("Recherche");
		btnRechercher.setForeground(Color.BLUE);
		btnRechercher.setFont(new Font("Verdana", Font.BOLD, 12));
		btnRechercher.setBounds(484, 5, 117, 25);
		panelBtn.add(btnRechercher);

		panelTable = new JPanel();
		panelTable.setBounds(10, 35, 623, 399);
		modelClient = new ClientModel();
		panel.add(panelTable);
		panelTable.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 11, 591, 388);
		panelTable.add(scrollPane);
		table = new JTable(modelClient);
		scrollPane.setViewportView(table);

		JPanel panelRight = new JPanel();
		panelRight.setLayout(null);
		panelRight.setName("");
		panelRight.setBorder(new TitledBorder(

				new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP,

						null, new Color(64, 64, 64)),

				"Identit\u00E9 de l'employ\u00E9", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		panelRight.setBounds(643, 11, 222, 423);
		panel.add(panelRight);

		JLabel lblCode = new JLabel("Code :");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCode.setBounds(10, 46, 44, 21);
		panelRight.add(lblCode);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNom.setBounds(10, 77, 44, 21);
		panelRight.add(lblNom);

		JLabel lblPrenom = new JLabel("Prénom :");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrenom.setBounds(10, 109, 60, 21);
		panelRight.add(lblPrenom);

		JLabel lblTelephone = new JLabel("Téléphone :");
		lblTelephone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelephone.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTelephone.setBounds(10, 141, 77, 21);
		panelRight.add(lblTelephone);

		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEmail.setBounds(10, 173, 51, 21);
		panelRight.add(lblEmail);

		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdresse.setBounds(10, 205, 69, 21);
		panelRight.add(lblAdresse);

		JLabel txtCode = new JLabel("");
		txtCode.setHorizontalAlignment(SwingConstants.CENTER);
		txtCode.setFont(new Font("Verdana", Font.BOLD, 12));
		txtCode.setBounds(106, 49, 130, 21);
		panelRight.add(txtCode);

		JLabel txtNom = new JLabel("");
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setFont(new Font("Verdana", Font.BOLD, 12));
		txtNom.setBounds(106, 81, 130, 21);
		panelRight.add(txtNom);

		JLabel txtPrenom = new JLabel("");
		txtPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		txtPrenom.setBounds(106, 113, 130, 21);
		panelRight.add(txtPrenom);

		JLabel txtTel = new JLabel("");
		txtTel.setHorizontalAlignment(SwingConstants.CENTER);
		txtTel.setFont(new Font("Verdana", Font.BOLD, 12));
		txtTel.setBounds(106, 145, 130, 21);
		panelRight.add(txtTel);

		JLabel txtEmail = new JLabel("");
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		txtEmail.setBounds(106, 177, 130, 21);
		panelRight.add(txtEmail);

		JLabel txtAdresse = new JLabel("");
		txtAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		txtAdresse.setBounds(106, 209, 130, 21);
		panelRight.add(txtAdresse);

		JLabel lblCodePostal = new JLabel("Code Postal :");
		lblCodePostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodePostal.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCodePostal.setBounds(10, 245, 92, 21);
		panelRight.add(lblCodePostal);

		JLabel txtCP = new JLabel("");
		txtCP.setHorizontalAlignment(SwingConstants.CENTER);
		txtCP.setFont(new Font("Verdana", Font.BOLD, 12));
		txtCP.setBounds(106, 249, 130, 21);
		panelRight.add(txtCP);

		JLabel lblVille = new JLabel("Ville :");
		lblVille.setHorizontalAlignment(SwingConstants.CENTER);
		lblVille.setFont(new Font("Verdana", Font.BOLD, 12));
		lblVille.setBounds(10, 285, 44, 21);
		panelRight.add(lblVille);

		JLabel txtVille = new JLabel("");
		txtVille.setHorizontalAlignment(SwingConstants.CENTER);
		txtVille.setFont(new Font("Verdana", Font.BOLD, 12));
		txtVille.setBounds(106, 285, 130, 21);
		panelRight.add(txtVille);

		JLabel lblTitre = new JLabel("Clients de ProxiBanque");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setForeground(new Color(0, 191, 255));
		lblTitre.setFont(new Font("Verdana", Font.BOLD, 30));
		lblTitre.setBounds(160, 11, 431, 37);
		contentPane.add(lblTitre);
		lblMouve.setBounds(0, 0, 807, 48);
		contentPane.add(lblMouve);

		JLabel lblCopyright = new JLabel("Copyright © Promo 3 -  OBJIS-SENEGAL - 2017");
		lblCopyright.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyright.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCopyright.setBounds(33, 580, 341, 20);
		contentPane.add(lblCopyright);

		JLabel lblReduire = new JLabel("-");
		lblReduire.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblReduire.setHorizontalTextPosition(SwingConstants.CENTER);
		lblReduire.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(FenPricipaleClient.ICONIFIED);
			}
		});
		lblReduire.setToolTipText("réduire");
		lblReduire.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduire.setForeground(new Color(0, 204, 255));
		lblReduire.setFont(new Font("Verdana", Font.BOLD, 34));
		lblReduire.setBounds(817, 11, 24, 37);
		contentPane.add(lblReduire);

		JLabel lblQuitter = new JLabel("X");
		lblQuitter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblQuitter.setToolTipText("fermer");
		lblQuitter.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuitter.setForeground(new Color(0, 204, 255));
		lblQuitter.setFont(new Font("Verdana", Font.BOLD, 24));
		lblQuitter.setBounds(851, 11, 24, 37);
		contentPane.add(lblQuitter);

		JLabel label = new JLabel("Deconnexion");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FenAuthentif fen = new FenAuthentif();
				fen.setVisible(true);
				dispose();
			}
		});
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 12));
		label.setBorder(new LineBorder(Color.WHITE));
		label.setBounds(774, 69, 91, 20);
		contentPane.add(label);

		JLabel lblAccueil = new JLabel("Accueil");
		lblAccueil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AccueilConseiller conseiller = new AccueilConseiller();
				conseiller.setVisible(true);
				dispose();
			}
		});
		lblAccueil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAccueil.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccueil.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblAccueil.setBorder(new LineBorder(Color.WHITE));
		lblAccueil.setBounds(698, 69, 62, 20);
		contentPane.add(lblAccueil);

		JLabel lblFond = new JLabel("");
		lblFond.setIcon(
				new ImageIcon(FenPricipaleClient.class.getResource("/sn/objis/proxibanquesi/images/Accueil.png")));
		lblFond.setBounds(0, 0, 875, 600);
		contentPane.add(lblFond);
	}
}
