import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add new Lable");
		btnNewButton.setOpaque(false);
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Newlabel nl = new Newlabel();
				nl.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(30, 93, 176, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Clients c = new Clients();
				c.setVisible(true);
				dispose();
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setIcon(new ImageIcon(Admin.class.getResource("/img/icons_cancel_32.png")));
		lblNewLabel.setBounds(404, 0, 46, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Admin.class.getResource("/img/support_60px.png")));
		lblNewLabel_1.setBounds(287, 77, 134, 153);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(2, 93, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("2-");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(2, 170, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnChangeBackground = new JButton("Change Background");
		btnChangeBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m = new Main();
				
				
				
				m.lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
				m.lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				m.lblNewLabel_3.setIcon(new ImageIcon(Main.class.getResource("/img/background2.jpg")));
				
				
					
				m.setVisible(true);
				dispose();
				
			}
		});
		btnChangeBackground.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		btnChangeBackground.setBounds(30, 170, 176, 23);
		contentPane.add(btnChangeBackground);
		
		JLabel lblNewLabel_3 = new JLabel("Options");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_3.setBounds(10, 11, 98, 21);
		contentPane.add(lblNewLabel_3);
	}
}
