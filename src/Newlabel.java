import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Newlabel extends JFrame {

	private JPanel contentPane;
	JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newlabel frame = new Newlabel();
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
	public Newlabel() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Label Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 112, 117, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(114, 115, 106, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setAutoscrolls(true);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String y = textField.getText();
				if (y.equals("")) {
					JOptionPane.showMessageDialog(rootPane, "Write New Label You Want To add");
				}
				else {
				String x = textField.getText();
				Main m = new Main();
				m.other.setVisible(true);
				m.other.setText(x);
				m.lblNewLabel_4_1_1_1.setVisible(true);
				m.setVisible(true);
				dispose();
				}
			}
		});
		btnNewButton.setBounds(75, 186, 89, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Newlabel.class.getResource("/img/verified_account_48px.png")));
		lblNewLabel_2.setBounds(31, 27, 46, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Newlabel.class.getResource("/img/male_user_48px.png")));
		lblNewLabel_1.setBounds(0, 0, 46, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome Admin");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(157, 11, 181, 42);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setIcon(new ImageIcon(Newlabel.class.getResource("/img/icons_cancel_32.png")));
		lblNewLabel_4.setBounds(388, 0, 46, 37);
		contentPane.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(248, 0, 186, 261);
		panel_1.setBackground(new Color(186, 79, 84));
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(74, 31, 61));
		panel.setBounds(0, 0, 249, 261);
		contentPane.add(panel);
	}
}
