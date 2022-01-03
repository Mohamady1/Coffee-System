import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class About extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/img/icons8_info_32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 330);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main mn = new Main();
				mn.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setOpaque(false);
		btnAbout.setBackground(Color.LIGHT_GRAY);
		btnAbout.setForeground(Color.WHITE);
		btnAbout.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		btnAbout.setBounds(106, 11, 89, 23);
		contentPane.add(btnAbout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(About.class.getResource("/img/info_80px.png")));
		lblNewLabel.setBounds(377, 67, 89, 135);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpn = new JTextPane();
		txtpn.setForeground(Color.WHITE);
		txtpn.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		txtpn.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtpn.setOpaque(false);
		txtpn.setEditable(false);
		txtpn.setText("Author [ Omar Ahmed Mohamady ]\r\rthis programe for a cafe to make an easy order between clients\r\r"
				+ "Write your table number, type of coffee you want and quantity, then take your receipt");
		txtpn.setBounds(10, 67, 357, 218);
		contentPane.add(txtpn);
		
		JLabel lblNewLabel_2 = new JLabel("By Omar Ahmed Mohamady, Ali ElDin Mohamed");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 286, 419, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(About.class.getResource("/img/icons_cancel_32.png")));
		lblNewLabel_3.setBounds(429, 0, 46, 34);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 67, 357, 218);
		panel.setBackground(new Color(0,0,0,150));
		contentPane.add(panel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(About.class.getResource("/img/pexels-kevin-villaruz-1660603.jpg")));
		lblNewLabel_1.setBounds(0, 0, 475, 330);
		contentPane.add(lblNewLabel_1);
	}
}
