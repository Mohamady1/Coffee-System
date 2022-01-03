import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Feedback extends JFrame {

	private JPanel contentPane;
	private JTextField txtHhh;
	private JTextField txtHh;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedback frame = new Feedback();
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
	public Feedback() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Feedback.class.getResource("/img/hh.jpg")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHhh = new JTextField();
		txtHhh.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		txtHhh.setHorizontalAlignment(SwingConstants.LEFT);
		txtHhh.setBounds(52, 117, 291, 92);
		contentPane.add(txtHhh);
		txtHhh.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Type Your PC Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 56, 176, 14);
		contentPane.add(lblNewLabel);
		
		txtHh = new JTextField();
		txtHh.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		txtHh.setHorizontalAlignment(SwingConstants.CENTER);
		txtHh.setBounds(161, 55, 104, 20);
		contentPane.add(txtHh);
		txtHh.setColumns(10);
		
		lblNewLabel_1 = new JLabel("(Required)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(275, 50, 90, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String feedback = txtHhh.getText();
				String pcName = txtHh.getText();
				
				if (pcName.equals("")) {
					JOptionPane.showMessageDialog(rootPane, "This is an important Field\nWrite your PC name Please");
				}
				else if (feedback.equals("")) {
					JOptionPane.showMessageDialog(rootPane, "We hope to see your opinion Type a feedback to offer best quality");
				}
				else {
				Writer writer = null;

				  try {
				      writer = new BufferedWriter(new OutputStreamWriter(
				            new FileOutputStream("C:\\Users\\" + pcName + "\\Desktop\\FeedBack.txt"), "utf-8"));
				      writer.write(feedback);
				  } catch (IOException ex) {
				      // Report
				  } finally {
				     try {writer.close();} catch (Exception ex) {/*ignore*/}
				  }
				  JOptionPane.showMessageDialog(rootPane, "Sent Successfully");
				  txtHhh.setText("");
			}
			}
		});
		btnSend.setOpaque(false);
		btnSend.setForeground(Color.WHITE);
		btnSend.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 18));
		btnSend.setBackground(Color.WHITE);
		btnSend.setBounds(161, 231, 89, 35);
		contentPane.add(btnSend);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				if (JOptionPane.showConfirmDialog(rootPane, "Do you Want to order new order","Question",
			            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					Clients cl = new Clients();
					cl.setVisible(true);
					dispose();
				}
				else {
					System.exit(0);
				}
			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setIcon(new ImageIcon(Feedback.class.getResource("/img/icons_cancel_32.png")));
		lblNewLabel_3.setBounds(319, 0, 46, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setIcon(new ImageIcon(Feedback.class.getResource("/img/hh.jpg")));
		lblNewLabel_2.setBounds(0, 0, 372, 392);
		contentPane.add(lblNewLabel_2);
	}
}
