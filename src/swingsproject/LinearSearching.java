package swingsproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LinearSearching extends JFrame {

	private JPanel contentPane;
	private JTextField ta1;
	private JTextField ta2;
	private JTextField ta3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearching frame = new LinearSearching();
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
	public LinearSearching() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(25, 25, 112));
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Labelheading = new JLabel("LinearSearch");
		Labelheading.setForeground(new Color(0, 0, 205));
		Labelheading.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Labelheading.setBounds(166, 11, 87, 18);
		contentPane.add(Labelheading);
		
		JLabel Labela = new JLabel("Enter sum numbers ");
		Labela.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Labela.setForeground(new Color(128, 0, 0));
		Labela.setBounds(37, 62, 157, 16);
		contentPane.add(Labela);
		
		JLabel Labelb = new JLabel("Enter a number to search");
		Labelb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Labelb.setForeground(new Color(128, 0, 128));
		Labelb.setBounds(37, 110, 157, 17);
		contentPane.add(Labelb);
		
		ta1 = new JTextField();
		ta1.setForeground(new Color(178, 34, 34));
		ta1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		ta1.setBounds(232, 61, 159, 23);
		contentPane.add(ta1);
		ta1.setColumns(10);
		
		ta2 = new JTextField();
		ta2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		ta2.setForeground(new Color(255, 69, 0));
		ta2.setBounds(232, 109, 159, 23);
		contentPane.add(ta2);
		ta2.setColumns(10);
		
		JLabel Labelr = new JLabel("Result");
		Labelr.setForeground(new Color(255, 0, 0));
		Labelr.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Labelr.setBounds(148, 160, 40, 17);
		contentPane.add(Labelr);
		
		ta3 = new JTextField();
		ta3.setForeground(new Color(46, 139, 87));
		ta3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		ta3.setBounds(234, 159, 157, 20);
		contentPane.add(ta3);
		ta3.setColumns(10);
		
		JButton Buttonr = new JButton("Search");
		Buttonr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Linear Searching logic
				
			}
		});
		Buttonr.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Buttonr.setForeground(new Color(154, 205, 50));
		Buttonr.setBounds(166, 210, 77, 27);
		contentPane.add(Buttonr);
	}

}
