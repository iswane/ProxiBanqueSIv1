package sn.objis.proxibanquesi.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.LineBorder;

public class AccueilConseiller extends JFrame {
	
	private int xMouse;
	private int yMouse;

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AccueilConseiller() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnClients = new JButton("");
		btnClients.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnClients0.png"));
				btnClients.setIcon(img);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnClients0.png"));
				btnClients.setIcon(img);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(
						getClass().getResource("/sn/objis/proxibanquesi/images/btnClients.png"));
				btnClients.setIcon(img);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnClients01.png"));
				btnClients.setIcon(img);
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				FenPricipaleClient client = new FenPricipaleClient();
				client.setVisible(true);
				dispose();
			}
		});
		btnClients.setBorder(UIManager.getBorder("Button.border"));
		btnClients.setIcon(
				new ImageIcon(AccueilConseiller.class.getResource("/sn/objis/proxibanquesi/images/btnClients.png")));
		btnClients.setBounds(275, 251, 172, 83);
		contentPane.add(btnClients);
		
		JButton btnOperation = new JButton("");
		btnOperation.setBorder(UIManager.getBorder("Button.border"));
		btnOperation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnOperations0.png"));
				btnOperation.setIcon(img);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnOperations.png"));
				btnOperation.setIcon(img);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnOperations01.png"));
				btnOperation.setIcon(img);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnOperations0.png"));
				btnOperation.setIcon(img);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FenOperations3 operations = new FenOperations3();
				operations.setVisible(true);
				dispose();
			}
		});
		btnOperation.setIcon(new ImageIcon(AccueilConseiller.class.getResource("/sn/objis/proxibanquesi/images/btnOperations.png")));
		btnOperation.setBounds(535, 250, 172, 84);
		contentPane.add(btnOperation);
		
		JButton btnGP = new JButton("");
		btnGP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnGP0.png"));
				btnGP.setIcon(img);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnGP.png"));
				btnGP.setIcon(img);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnGP01.png"));
				btnGP.setIcon(img);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnGP0.png"));
				btnGP.setIcon(img);
			}
		});
		btnGP.setIcon(new ImageIcon(AccueilConseiller.class.getResource("/sn/objis/proxibanquesi/images/btnGP.png")));
		btnGP.setBounds(275, 384, 172, 83);
		contentPane.add(btnGP);
		
		JButton btnSC = new JButton("");
		btnSC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnSC0.png"));
				btnSC.setIcon(img);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnSC.png"));
				btnSC.setIcon(img);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnSC01.png"));
				btnSC.setIcon(img);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnSC0.png"));
				btnSC.setIcon(img);
			}
		});
		btnSC.setIcon(new ImageIcon(AccueilConseiller.class.getResource("/sn/objis/proxibanquesi/images/btnSC.png")));
		btnSC.setBounds(535, 384, 172, 83);
		contentPane.add(btnSC);
		
		JLabel lblTitre = new JLabel("PROXIBANQUE SI");
		lblTitre.setForeground(new Color(0, 191, 255));
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setFont(new Font("Verdana", Font.BOLD, 30));
		lblTitre.setBounds(306, 11, 322, 37);
		contentPane.add(lblTitre);
		
		JLabel lblSousTitre = new JLabel("Accueil Conseiller Client");
		lblSousTitre.setForeground(Color.WHITE);
		lblSousTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSousTitre.setFont(new Font("Verdana", Font.BOLD, 40));
		lblSousTitre.setBounds(198, 133, 596, 54);
		contentPane.add(lblSousTitre);
		
		JLabel lblPiedPage = new JLabel("Copyright © Promo 3 -  OBJIS-SENEGAL - 2017");
		lblPiedPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedPage.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPiedPage.setBounds(30, 578, 324, 22);
		contentPane.add(lblPiedPage);
		
		JLabel lblQuit = new JLabel("X");
		lblQuit.setToolTipText("fermer");
		lblQuit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblQuit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblQuit.setForeground(new Color(0, 204, 255));
		lblQuit.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuit.setFont(new Font("Verdana", Font.BOLD, 24));
		lblQuit.setBounds(841, 20, 24, 28);
		contentPane.add(lblQuit);
		
		JLabel lblReduire = new JLabel("-");
		lblReduire.setToolTipText("réduire");
		lblReduire.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(AccueilConseiller.ICONIFIED);
			}
		});
		lblReduire.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblReduire.setForeground(new Color(0, 204, 255));
		lblReduire.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduire.setFont(new Font("Verdana", Font.BOLD, 34));
		lblReduire.setBounds(807, 20, 24, 28);
		contentPane.add(lblReduire);
		
		JLabel lblMouve = new JLabel("");
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
		lblMouve.setBounds(0, 0, 797, 48);
		contentPane.add(lblMouve);
		
		JLabel lblNomConseiller = new JLabel("Conseiller clientèle :");
		lblNomConseiller.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomConseiller.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNomConseiller.setBounds(88, 67, 161, 22);
		contentPane.add(lblNomConseiller);
		
		JLabel lblLogout = new JLabel("Deconnexion");
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FenAuthentif fen = new FenAuthentif();
				fen.setVisible(true);
				dispose();
			}
		});
		lblLogout.setBorder(new LineBorder(Color.WHITE));
		lblLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblLogout.setBounds(774, 67, 91, 20);
		contentPane.add(lblLogout);
		
		JLabel lblConseiller = new JLabel("");
		lblConseiller.setIcon(new ImageIcon(AccueilConseiller.class.getResource("/sn/objis/proxibanquesi/images/working.png")));
		lblConseiller.setHorizontalAlignment(SwingConstants.CENTER);
		lblConseiller.setBounds(0, 11, 119, 156);
		contentPane.add(lblConseiller);

		JLabel lblFond = new JLabel("");
		lblFond.setIcon(
				new ImageIcon(AccueilConseiller.class.getResource("/sn/objis/proxibanquesi/images/Accueil.png")));
		lblFond.setBounds(0, 0, 875, 600);
		contentPane.add(lblFond);
	}
}
