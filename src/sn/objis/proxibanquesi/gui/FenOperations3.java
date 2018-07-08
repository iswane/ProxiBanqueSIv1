package sn.objis.proxibanquesi.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class FenOperations3 extends JFrame {

	private int xMouse;
	private int yMouse;

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FenOperations3() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelCentre = new JPanel();
		panelCentre.setOpaque(false);
		panelCentre.setBounds(195, 131, 600, 421);
		contentPane.add(panelCentre);
		panelCentre.setLayout(null);

		JButton btnRetrait = new JButton("");
		btnRetrait.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/retrait2.png"));
				btnRetrait.setIcon(img);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/retrait2.png"));
				btnRetrait.setIcon(img);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(
						getClass().getResource("/sn/objis/proxibanquesi/images/retrait.png"));
				btnRetrait.setIcon(img);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/retrait3.png"));
				btnRetrait.setIcon(img);
			}
		});
		btnRetrait
				.setIcon(new ImageIcon(FenOperations3.class.getResource("/sn/objis/proxibanquesi/images/retrait.png")));
		btnRetrait.setBounds(80, 121, 172, 82);
		panelCentre.add(btnRetrait);

		JButton btnVirement = new JButton("");
		btnVirement.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/virement2.png"));
				btnVirement.setIcon(img);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/virement2.png"));
				btnVirement.setIcon(img);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(
						getClass().getResource("/sn/objis/proxibanquesi/images/virement.png"));
				btnVirement.setIcon(img);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/virement3.png"));
				btnVirement.setIcon(img);
			}
		});
		btnVirement.setIcon(new ImageIcon(FenOperations3.class.getResource("/sn/objis/proxibanquesi/images/virement.png")));
		btnVirement.setBounds(341, 121, 172, 82);
		panelCentre.add(btnVirement);

		JButton btnDepot = new JButton("");
		btnDepot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/depot2.png"));
				btnDepot.setIcon(img);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/depot2.png"));
				btnDepot.setIcon(img);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(
						getClass().getResource("/sn/objis/proxibanquesi/images/depot.png"));
				btnDepot.setIcon(img);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/depot3.png"));
				btnDepot.setIcon(img);
			}
		});
		btnDepot.setIcon(new ImageIcon(FenOperations3.class.getResource("/sn/objis/proxibanquesi/images/depot.png")));
		btnDepot.setBounds(80, 253, 172, 82);
		panelCentre.add(btnDepot);

		JLabel lblVide = new JLabel("");
		lblVide.setIcon(new ImageIcon(FenOperations3.class.getResource("/sn/objis/proxibanquesi/images/argent.png")));
		lblVide.setBounds(341, 253, 172, 82);
		panelCentre.add(lblVide);
		
		JLabel lblSsTitre = new JLabel("Veuillez choisir une opération SVP !!!");
		lblSsTitre.setForeground(Color.WHITE);
		lblSsTitre.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblSsTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsTitre.setBounds(10, 11, 580, 34);
		panelCentre.add(lblSsTitre);

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
		
				JLabel lblTitre = new JLabel("OPERATIONS");
				lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
				lblTitre.setForeground(new Color(0, 191, 255));
				lblTitre.setFont(new Font("Verdana", Font.BOLD, 30));
				lblTitre.setBounds(285, 11, 322, 37);
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
				setState(FenOperations3.ICONIFIED);
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
		lblFond.setIcon(new ImageIcon(FenOperations3.class.getResource("/sn/objis/proxibanquesi/images/Accueil.png")));
		lblFond.setBounds(0, 0, 875, 600);
		contentPane.add(lblFond);
	}
}
