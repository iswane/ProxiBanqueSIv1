package sn.objis.proxibanquesi.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FenAccueilAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FenAccueilAdmin(JDesktopPane desktopPane) {
	}
	public FenAccueilAdmin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(null);
		desktopPane.setBounds(188, 99, 660, 465);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon(FenAccueilAdmin.class.getResource("/sn/objis/proxibanquesi/images/deskPane.png")));
		lblNewLabel.setBounds(0, 0, 660, 465);
		desktopPane.add(lblNewLabel);

		JButton btnEmployes = new JButton("Employes");
		btnEmployes.setBounds(26, 200, 132, 48);
		contentPane.add(btnEmployes);
		btnEmployes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListeEmployes interneFrame = new ListeEmployes();
				desktopPane.add(interneFrame);
				try {
					interneFrame.setMaximum(true);
				} catch (PropertyVetoException e) {
					e.printStackTrace();
				}
				interneFrame.setVisible(true);
				validate();
			}
		});

		btnEmployes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JButton btnClients = new JButton("Clients");
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListeClients interneFrame = new ListeClients();
				desktopPane.add(interneFrame);
				try {
					interneFrame.setMaximum(true);
				} catch (PropertyVetoException e) {
					e.printStackTrace();
				}
				interneFrame.setVisible(true);
				validate();
			}
		});
		btnClients.setBounds(26, 259, 132, 48);
		contentPane.add(btnClients);
		btnClients.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JButton btnOperations = new JButton("Operations");
		btnOperations.setBounds(26, 318, 132, 48);
		contentPane.add(btnOperations);
		btnOperations.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JButton btnGP = new JButton("Patrimoine");
		btnGP.setBounds(26, 377, 132, 48);
		contentPane.add(btnGP);
		btnGP.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JButton btnSCredit = new JButton("Simulation");
		btnSCredit.setBounds(26, 436, 132, 48);
		contentPane.add(btnSCredit);
		btnSCredit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JButton btnAudit = new JButton("Auditer");
		btnAudit.setBounds(26, 495, 132, 48);
		contentPane.add(btnAudit);
		btnAudit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JLabel lblReduire = new JLabel("-");
		lblReduire.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(FenAccueilAdmin.ICONIFIED);
			}
		});
		lblReduire.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblReduire.setToolTipText("réduire");
		lblReduire.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduire.setForeground(new Color(0, 204, 255));
		lblReduire.setFont(new Font("Verdana", Font.BOLD, 34));
		lblReduire.setBounds(812, 11, 24, 28);
		contentPane.add(lblReduire);

		JLabel lblQuitter = new JLabel("X");
		lblQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblQuitter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblQuitter.setToolTipText("fermer");
		lblQuitter.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuitter.setForeground(new Color(0, 204, 255));
		lblQuitter.setFont(new Font("Verdana", Font.BOLD, 24));
		lblQuitter.setBounds(846, 11, 24, 28);
		contentPane.add(lblQuitter);

		JLabel lblTitre = new JLabel("PROXIBANQUE SI");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setForeground(new Color(0, 191, 255));
		lblTitre.setFont(new Font("Verdana", Font.BOLD, 30));
		lblTitre.setBounds(288, 11, 322, 37);
		contentPane.add(lblTitre);

		JLabel lblLogoGerant = new JLabel("");
		lblLogoGerant.setIcon(new ImageIcon(FenAccueilAdmin.class
				.getResource("/sn/objis/proxibanquesi/images/3-administrateur-icone-7079-128.png")));
		lblLogoGerant.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoGerant.setBounds(1, 0, 90, 128);
		contentPane.add(lblLogoGerant);

		JLabel lblNomGerant = new JLabel("Admin :");
		lblNomGerant.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomGerant.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNomGerant.setBounds(87, 66, 79, 22);
		contentPane.add(lblNomGerant);

		JLabel lblCopyright = new JLabel("Copyright © Promo 3 -  OBJIS-SENEGAL - 2017");
		lblCopyright.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyright.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCopyright.setBounds(34, 578, 324, 22);
		contentPane.add(lblCopyright);

		JLabel lblMouve = new JLabel("");
		lblMouve.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		lblMouve.setBounds(0, 0, 802, 48);
		contentPane.add(lblMouve);

		JLabel lblDcnx = new JLabel("Deconnexion");
		lblDcnx.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				removeAll();
				FenAuthentif authentif = new FenAuthentif();
				authentif.setVisible(true);
				dispose();
			}
		});
		lblDcnx.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblDcnx.setToolTipText("");
		lblDcnx.setHorizontalAlignment(SwingConstants.CENTER);
		lblDcnx.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblDcnx.setBorder(new LineBorder(Color.WHITE));
		lblDcnx.setBounds(775, 68, 90, 20);
		contentPane.add(lblDcnx);
		
		JLabel lblAccueil = new JLabel("Accueil");
		lblAccueil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FenAccueilAdmin admin = new FenAccueilAdmin();
				admin.setVisible(true);
			}
		});
		lblAccueil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAccueil.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccueil.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblAccueil.setBorder(new LineBorder(Color.WHITE));
		lblAccueil.setBounds(703, 68, 62, 20);
		contentPane.add(lblAccueil);

		JLabel lblFond = new JLabel("");
		lblFond.setIcon(
				new ImageIcon(FenAccueilAdmin.class.getResource("/sn/objis/proxibanquesi/images/Accueil.png")));
		lblFond.setBounds(0, 0, 875, 600);
		contentPane.add(lblFond);
	}
}
