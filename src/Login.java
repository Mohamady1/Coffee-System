import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Component;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userTextField;
	private JPasswordField passwordField;
	private JLabel message;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	
	public Login() {
		
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/icons8_user_male_32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/img/system_administrator_male_100px.png")));
		lblNewLabel_1.setBounds(10, 67, 107, 134);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("For Admins Only");
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 53, 157, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/img/icons_cancel_32.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(367, 0, 46, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("UserName");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setBounds(175, 161, 85, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4_1.setBounds(175, 217, 85, 22);
		contentPane.add(lblNewLabel_4_1);
		
		userTextField = new JTextField();
		userTextField.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		userTextField.setHorizontalAlignment(SwingConstants.CENTER);
		userTextField.setForeground(new Color(0, 0, 0));
		userTextField.setBounds(270, 161, 123, 20);
		if(userTextField.equals(null)) {
			userTextField.setText("type Your Name");
			userTextField.setForeground(new Color(169,169,169));
		}
		contentPane.add(userTextField);
		userTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(270, 217, 123, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(280, 247, 60, 41);
		btnNewButton.setBackground(null);
		contentPane.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/img/icons_login_32.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userTextField.getText();
				loginEncapsulation log = new loginEncapsulation();
				log.set(passwordField.getText());
				Admin m = new Admin();
				try {
				if (log.get().equals("omar.ali") && user.equals("admin")) {
					m.setVisible(true);
					dispose();
				}
				else if (user.equals("") || log.get().equals("")) {
					JOptionPane.showMessageDialog(rootPane, "Field is Empty");
				}
				else if (!log.get().equals("omar.ali")) {
					JOptionPane.showMessageDialog(passwordField, "Password is Incorrect");
				}
				else if (!user.equals("admin")) {
					JOptionPane.showMessageDialog(userTextField, "Username is Incorrect");
				}
				
				}
				catch (Exception error) {
					message.setText("Error is: " + error);
				}
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(171, 139, 242, 164);
		panel.setBackground(new Color(0, 0, 0, 150));
		contentPane.add(panel);
		
		JLabel message = new JLabel("");
		message.setFont(new Font("Tahoma", Font.BOLD, 14));
		message.setForeground(Color.BLACK);
		message.setBounds(243, 33, 97, 41);
		contentPane.add(message);
		
		JLabel lblNewLabel = new JLabel("Login as Client");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Clients cl = new Clients();
				cl.setVisible(true);
				dispose();
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/img/arrow_pointing_left_64px.png")));
		lblNewLabel.setBounds(243, 33, 170, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setAlignmentY(Component.TOP_ALIGNMENT);
	
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon(Login.class.getResource("/img/pexels-photo-3661973.jpg")));
		lblNewLabel_5.setBounds(0, 0, 413, 360);
		contentPane.add(lblNewLabel_5);
	}
}
