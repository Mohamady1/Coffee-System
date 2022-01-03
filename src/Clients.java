import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class Clients extends JFrame {

	private JPanel contentPane;
	JTextField txtHh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clients frame = new Clients();
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
	public Clients() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Clients.class.getResource("/img/system_administrator_male_100px.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What's your name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 68, 192, 62);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = txtHh.getText();
				
				if (x.equals("")) {
					JOptionPane.showMessageDialog(rootPane, "You have to write your name");
				}
				else {
				Main m = new Main();
				m.setVisible(true);
				m.name = x;
				dispose();
				}
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(190, 140, 89, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Clients.class.getResource("/img/icons_cancel_32.png")));
		lblNewLabel_1.setBounds(491, 0, 43, 35);
		contentPane.add(lblNewLabel_1);
		
		txtHh = new JTextField();
		txtHh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtHh.setHorizontalAlignment(SwingConstants.CENTER);
		txtHh.setBounds(10, 141, 170, 28);
		contentPane.add(txtHh);
		txtHh.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hello New User");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(0, 0, 170, 35);
		contentPane.add(lblNewLabel_2);
		
		JButton btnLoginAsAdmin = new JButton("Login As Admin");
		btnLoginAsAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log= new Login();
				log.setVisible(true);
				dispose();
			}
		});
		btnLoginAsAdmin.setOpaque(false);
		btnLoginAsAdmin.setForeground(Color.WHITE);
		btnLoginAsAdmin.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 18));
		btnLoginAsAdmin.setBackground(Color.WHITE);
		btnLoginAsAdmin.setBounds(35, 207, 202, 35);
		contentPane.add(btnLoginAsAdmin);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 46, 279, 223);
		panel.setBackground(new Color(0,0,0,150));
		contentPane.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setIcon(new ImageIcon(Clients.class.getResource("/img/icon.jpg")));
		lblNewLabel_3.setBackground(Color.ORANGE);
		lblNewLabel_3.setBounds(0, 0, 534, 300);
		contentPane.add(lblNewLabel_3);
	}
}
