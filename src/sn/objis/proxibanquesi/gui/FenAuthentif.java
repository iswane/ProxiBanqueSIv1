package sn.objis.proxibanquesi.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sn.objis.proxibanquesi.service.IServiceCompteUserImpl;
import sn.objis.proxibanquesi.service.IServiceEmployeImpl;
import sn.objis.proxibanquesi.utils.CryptagePasswd;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FenAuthentif extends JFrame {

	private IServiceEmployeImpl serviceEmploye;
	private IServiceCompteUserImpl serviceCompteUser;

	private JPanel contentPane;
	private JTextField tfLogin;
	private JPasswordField pfPasswd;
	private String mdpCrypter;

	private int xMouse;
	private int yMouse;

	/**
	 * Create the frame.
	 */
	public FenAuthentif() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		serviceEmploye = new IServiceEmployeImpl();
		serviceCompteUser = new IServiceCompteUserImpl();

		JLabel btnCnx = new JLabel("");
		btnCnx.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnHover0.png"));
				btnCnx.setIcon(img);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnHover0.png"));
				btnCnx.setIcon(img);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(
						getClass().getResource("/sn/objis/proxibanquesi/images/btnRelasead0.png"));
				btnCnx.setIcon(img);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				ImageIcon img = new ImageIcon(getClass().getResource("/sn/objis/proxibanquesi/images/btnClicked0.png"));
				btnCnx.setIcon(img);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == btnCnx) {
					boolean isConnect = false;
					long idEmploye = 0;
					long idRole = 0;
					String loginSaisi = tfLogin.getText();
					String passwordSaisi = pfPasswd.getText();

					mdpCrypter = CryptagePasswd.chiffrage(passwordSaisi);

					isConnect = serviceCompteUser.authentification(loginSaisi, mdpCrypter);
					idEmploye = serviceCompteUser.recupIdEmp(loginSaisi, mdpCrypter);
					idRole = serviceEmploye.recupIdRole(idEmploye);

					if (isConnect == true) {
						if (idRole == 1) {
							FenAccueilAdmin fenAdmin = new FenAccueilAdmin();
							fenAdmin.setVisible(true);
							dispose();
						} else if (idRole == 2) {
							AccueilConseiller fenConseil = new AccueilConseiller();
							fenConseil.setVisible(true);
							dispose();
						} else if (idRole == 3) {
							FenAccueilAdmin fenAdmin = new FenAccueilAdmin();
							fenAdmin.setVisible(true);
							dispose();
						} else {
							System.out.println("Role incorrect !");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Login ou mot de passe incorrect !!!");
					}
				}
			}
		});

		JLabel lblPiedP = new JLabel("Copyright © Promo 3 -  OBJIS-SENEGAL - 2017");
		lblPiedP.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPiedP.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedP.setBounds(10, 504, 321, 21);
		contentPane.add(lblPiedP);

		JLabel lblTitre = new JLabel("PROXIBANQUE SI");
		lblTitre.setForeground(Color.WHITE);
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
		lblTitre.setBounds(175, 11, 360, 35);
		contentPane.add(lblTitre);

		JLabel lblDescription = new JLabel("");
		lblDescription.setForeground(new Color(255, 69, 0));
		lblDescription.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setBounds(240, 393, 321, 29);
		contentPane.add(lblDescription);
		btnCnx.setIcon(
				new ImageIcon(FenAuthentif.class.getResource("/sn/objis/proxibanquesi/images/btnRelasead0.png")));
		btnCnx.setBounds(240, 320, 321, 51);
		contentPane.add(btnCnx);

		JLabel btnQuit = new JLabel("X");
		btnQuit.setToolTipText("fermer");
		btnQuit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnQuit.setBackground(Color.WHITE);
		btnQuit.setForeground(Color.WHITE);
		btnQuit.setHorizontalAlignment(SwingConstants.CENTER);
		btnQuit.setFont(new Font("Verdana", Font.BOLD, 24));
		btnQuit.setBounds(670, 0, 24, 46);
		contentPane.add(btnQuit);

		JLabel btnReduire = new JLabel("-");
		btnReduire.setToolTipText("réduire");
		btnReduire.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReduire.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(FenAuthentif.ICONIFIED);
			}
		});
		btnReduire.setBackground(Color.WHITE);
		btnReduire.setForeground(Color.WHITE);
		btnReduire.setHorizontalAlignment(SwingConstants.CENTER);
		btnReduire.setFont(new Font("Verdana", Font.BOLD, 34));
		btnReduire.setBounds(636, 0, 24, 43);
		contentPane.add(btnReduire);

		tfLogin = new JTextField();
		tfLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblDescription.setText("");
			}
		});
		tfLogin.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				lblDescription.setText("Veuillez saisir vôtre login SVP !");
			}
		});
		tfLogin.setHorizontalAlignment(SwingConstants.CENTER);
		tfLogin.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		tfLogin.setBorder(null);
		tfLogin.setOpaque(false);
		tfLogin.setBounds(240, 187, 278, 29);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);

		pfPasswd = new JPasswordField();
		pfPasswd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					boolean isConnect = false;
					long idEmploye = 0;
					long idRole = 0;
					String loginSaisi = tfLogin.getText();
					String passwordSaisi = pfPasswd.getText();

					mdpCrypter = CryptagePasswd.chiffrage(passwordSaisi);

					isConnect = serviceCompteUser.authentification(loginSaisi, mdpCrypter);
					idEmploye = serviceCompteUser.recupIdEmp(loginSaisi, mdpCrypter);
					idRole = serviceEmploye.recupIdRole(idEmploye);

					if (isConnect == true) {

						if (idRole == 1) {
							FenAccueilAdmin fenAdmin = new FenAccueilAdmin();
							fenAdmin.setVisible(true);
							dispose();
						} else if (idRole == 2) {
							AccueilConseiller fenConseil = new AccueilConseiller();
							fenConseil.setVisible(true);
							dispose();
						} else if (idRole == 3) {
							FenAccueilAdmin fenAdmin = new FenAccueilAdmin();
							fenAdmin.setVisible(true);
							dispose();
						} else {
							System.out.println("Role incorrect !");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Login ou mot de passe incorrecte !!!");
					}
				}
			}
		});
		pfPasswd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblDescription.setText("");
			}
		});
		pfPasswd.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				lblDescription.setText("Veuillez saisir vôtre mot de passe SVP !");
			}
		});
		pfPasswd.setEchoChar('*');
		pfPasswd.setHorizontalAlignment(SwingConstants.CENTER);
		pfPasswd.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		pfPasswd.setBorder(null);
		pfPasswd.setOpaque(false);
		pfPasswd.setBounds(240, 256, 278, 29);
		contentPane.add(pfPasswd);

		JLabel lblMouvFen = new JLabel("");
		lblMouvFen.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		lblMouvFen.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {
				xMouse = evt.getX();
				yMouse = evt.getY();
			}
		});
		lblMouvFen.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				int x = evt.getXOnScreen();
				int y = evt.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);
			}
		});
		lblMouvFen.setBounds(0, 0, 623, 46);
		contentPane.add(lblMouvFen);

		JLabel lblPiedPage = new JLabel("");
		lblPiedPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedPage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPiedPage.setIcon(
				new ImageIcon(FenAuthentif.class.getResource("/sn/objis/proxibanquesi/images/Sans titre 1.png")));
		lblPiedPage.setBounds(10, 504, 677, 21);
		contentPane.add(lblPiedPage);

		JLabel lblFond = new JLabel("");
		lblFond.setIcon(
				new ImageIcon(FenAuthentif.class.getResource("/sn/objis/proxibanquesi/images/imageretaille.png")));
		lblFond.setBounds(0, 0, 700, 525);
		contentPane.add(lblFond);
	}
}
