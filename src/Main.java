import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField tableNumber;
	private JTextField countCream;
	private JLabel lblNewLabel_1;
	public JTextPane textPane;
	public String name;
	JCheckBox other;
	JLabel lblNewLabel_3;
	JLabel lblNewLabel_4_1_1_1;
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	int quantity = 1;
	Reciept r = new Reciept();

	
	/**
	 * Create the frame.
	 */
	public Main() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				JOptionPane.showMessageDialog(rootPane, "You have to Complete all fields To make a special order for you");
			}
		});
		
		
		setUndecorated(true);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/img/icon.jpg")));
		setTitle("Cafe Managment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 368);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textPane = new JTextPane();
		textPane.setOpaque(false);
		textPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPane.setForeground(Color.WHITE);
		textPane.setBorder(null);
		textPane.setVisible(false);
		textPane.setEditable(false);
		textPane.setBounds(10, 324, 299, 32);
		contentPane.add(textPane);
		
		//table number
		JLabel lblNewLabel = new JLabel("Table Number");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 75, 103, 20);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel);
		
		//field to write table number
		tableNumber = new JTextField();
		tableNumber.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		tableNumber.setHorizontalAlignment(SwingConstants.CENTER);
		tableNumber.setBounds(113, 75, 128, 20);
		contentPane.add(tableNumber);
		tableNumber.setColumns(10);
		
		//cups coffee
		lblNewLabel_1 = new JLabel("Number of Cups");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(10, 205, 115, 32);
		contentPane.add(lblNewLabel_1);
		
		//number of whipped cream cups
		countCream = new JTextField();
		countCream.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		countCream.setHorizontalAlignment(SwingConstants.CENTER);
		countCream.setVisible(false);
		countCream.setBounds(158, 213, 83, 20);
		contentPane.add(countCream);
		countCream.setColumns(10);
		
		//coffee types
		JLabel lblNewLabel_2 = new JLabel("Coffee Types");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(10, 125, 94, 27);
		contentPane.add(lblNewLabel_2);
		
		//whipped cream Check box
		JCheckBox whipedCream = new JCheckBox("Whipped Cream");
		whipedCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(whipedCream.isSelected()){
					countCream.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else {
					countCream.setVisible(false);
					lblNewLabel_1.setVisible(false);
				}
			}
		});
		
		whipedCream.setBounds(113, 129, 128, 23);
		contentPane.add(whipedCream);
		
		//chocolate check box
		JCheckBox chocolate = new JCheckBox("Chocolate");
		chocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chocolate.isSelected()){
					countCream.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else {
					countCream.setVisible(false);
					lblNewLabel_1.setVisible(false);
				}
			}
		});
		
		chocolate.setBounds(245, 129, 83, 23);
		contentPane.add(chocolate);
		
		//just coffee check box
		JCheckBox justCoffee = new JCheckBox("Just Coffee");
		justCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(justCoffee.isSelected()){
					countCream.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else {
					countCream.setVisible(false);
					lblNewLabel_1.setVisible(false);
				}
			}
			
		});
		justCoffee.setBounds(333, 129, 97, 23);
		contentPane.add(justCoffee);
		
		//order button to appear check
		JButton order = new JButton("Order Now");
		order.setFont(new Font("Castellar", Font.ITALIC, 15));
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int y = Integer.parseInt(countCream.getText());
				
				
				//to get table number
				String tbnum = tableNumber.getText();
				
				
		        //this for clients who want to whipped cream
		        Boolean hasWhippedCream = whipedCream.isSelected();

		        //this for clients who want to chocolate
		        Boolean hasChocolate = chocolate.isSelected();
		        
		        //this for clients who want just coffee
		        Boolean Coffee = justCoffee.isSelected();
		        
		        //this for clients who want other
		        Boolean o = other.isSelected();

		        int price = calculatePrice(hasWhippedCream, hasChocolate, Coffee);
		        int othPrice = otherPrice(o);
		        String priceMessage = createOrderSummary(name, tbnum, price, othPrice, hasWhippedCream, hasChocolate, Coffee);
		        
		        
		        if (tbnum.equals("")) {
		        	JOptionPane.showMessageDialog(rootPane, "What Table you are sit on");
		        }
		       
				int z = Integer.parseInt(tableNumber.getText());

		    
		        if ((z <= 0) || (y <= 0)) {
					JOptionPane.showMessageDialog(rootPane, "Enter a valid number");
					r.setVisible(false);
				} 
		        
		       
		        
		        else if ((hasWhippedCream && Coffee) || (hasChocolate && Coffee)) {
		        	JOptionPane.showMessageDialog(null, "You can't mix between these");
		        	r.setVisible(false);
		        }
		        
		        else {
		        displayMessage(priceMessage);
		        String x = textPane.getText();
		        r.txtArea.setText(x);
		        r.setVisible(true);
		        dispose();
		        }
		               
			}
		});
		order.setBounds(90, 300, 151, 23);
		contentPane.add(order);
		order.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(Main.class.getResource("/img/icons_cancel_32.png")));
		lblNewLabel_5.setBounds(641, 0, 29, 37);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(10, 14, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About abt = new About();
				abt.setVisible(true);
				dispose();
			}
		});
		btnAbout.setForeground(Color.WHITE);
		btnAbout.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		btnAbout.setBackground(Color.LIGHT_GRAY);
		btnAbout.setOpaque(false);
		btnAbout.setBounds(115, 14, 89, 23);
		contentPane.add(btnAbout);
		
		other = new JCheckBox("New check box");
		other.setVisible(false);
		other.setBounds(113, 175, 128, 23);
		contentPane.add(other);
		other.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(other.isSelected()){
				countCream.setVisible(true);
				lblNewLabel_1.setVisible(true);
				//lblNewLabel_4_1_1_1.setVisible(true);
			}
			else {
				countCream.setVisible(false);
				lblNewLabel_1.setVisible(false);
				//lblNewLabel_4_1_1_1.setVisible(false);
			}
		}
		
	});
		
		JLabel lblNewLabel_4 = new JLabel("+5$");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(158, 108, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("+10$");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(263, 108, 46, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("=5$");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setBounds(351, 108, 46, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		lblNewLabel_4_1_1_1 = new JLabel("=7$");
		lblNewLabel_4_1_1_1.setVisible(false);
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1.setBounds(146, 159, 46, 14);
		contentPane.add(lblNewLabel_4_1_1_1);
		
		
		//program background 
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Main.class.getResource("/img/background.jpeg")));
		lblNewLabel_3.setBounds(0, 0, 670, 368);
		contentPane.add(lblNewLabel_3);
	}
	
	//Global Methods
	//1
	private int calculatePrice(boolean addWhippedCream, boolean addChocolate, boolean coffee) {
		quantity = Integer.parseInt(countCream.getText());
        int only_coffe = 5;
        if (addWhippedCream && addChocolate) {
            only_coffe += 15;
        }
        else if (addWhippedCream) {
        	only_coffe += 5;
        }
        else if (addChocolate) {
            only_coffe += 10;
        }
        else if (coffee) {
        	only_coffe = 5;
        }
        else {
        	only_coffe = 0;
        }
        return(quantity * only_coffe);

    }
	
	//2
	private String createOrderSummary(String name, String tableNumber, int t, int p, Boolean whipped, Boolean chocolate, Boolean coffee) {
        String priceMessage = "Table Number: " + tableNumber;
        priceMessage += "\nAdd Whipped Cream?  " +'"'+whipped+'"';
        priceMessage += "\nAdd Chocolate?  " + '"'+chocolate+'"';
        priceMessage += "\nJust Coffee?  " + '"'+coffee+'"';
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal for coffee $: " + t;
        priceMessage += "\nTotal for other Drinks $: " + p;
        priceMessage += "\nTotal price $: " + (t+p);
        priceMessage += "\n\nThanks " + name + "\nWe hope to see u again";
        return priceMessage;
    }
	
	//4
	private int otherPrice (boolean other) {
		quantity = Integer.parseInt(countCream.getText());
		int o_other = 7;
		if (other) {
			o_other = 7;
		}
		else {
			o_other = 0;
		}
		return(quantity * o_other);
	}
	
	//3
	private void displayMessage(String message) {
		textPane.setText(message);
    }
}
