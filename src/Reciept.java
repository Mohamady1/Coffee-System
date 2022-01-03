import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Reciept extends JFrame {

	private JPanel contentPane;
	JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reciept frame = new Reciept();
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
	public Reciept() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Reciept.class.getResource("/img/document_200px.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtArea = new JTextArea();
		txtArea.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 18));
		txtArea.setForeground(Color.WHITE);
		txtArea.setOpaque(false);
		txtArea.setEditable(false);
		txtArea.setBounds(10, 27, 314, 270);
		contentPane.add(txtArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Reciept.class.getResource("/img/document_200px.png")));
		lblNewLabel_1.setBounds(334, 67, 145, 161);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setIcon(new ImageIcon(Reciept.class.getResource("/img/icons_cancel_32.png")));
		lblNewLabel_2.setBounds(459, 0, 46, 28);
		contentPane.add(lblNewLabel_2);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						 if (JOptionPane.showConfirmDialog(btnDone, "Do you Want to send a feedback to us","FeedBack",
						            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
						            Feedback fd = new Feedback();
						            fd.setVisible(true);
						            dispose();
						 }
						 else {
							 System.exit(0);
						 }
			}
		});
		btnDone.setOpaque(false);
		btnDone.setForeground(Color.WHITE);
		btnDone.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 18));
		btnDone.setBackground(Color.WHITE);
		btnDone.setBounds(104, 308, 89, 35);
		contentPane.add(btnDone);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Reciept.class.getResource("/img/waMpJw.default.png")));
		lblNewLabel.setBounds(0, 0, 505, 366);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
