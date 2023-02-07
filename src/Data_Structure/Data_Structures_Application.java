package Data_Structure;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Data_Structures_Application extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data_Structures_Application frame = new Data_Structures_Application();
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
	public Data_Structures_Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Heading = new JLabel("Data_Structures_Application");
		Heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Heading.setForeground(new Color(139, 0, 0));
		Heading.setBounds(114, 11, 225, 21);
		contentPane.add(Heading);
		
		JButton array = new JButton("Array");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//logic for array function
			new Array().setVisible(true);
			dispose();	
			}
		});
		array.setForeground(new Color(0, 100, 0));
		array.setFont(new Font("Times New Roman", Font.BOLD, 14));
		array.setBounds(197, 43, 91, 25);
		contentPane.add(array);
		
		JButton stack = new JButton("Stack");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for stack function
				new Stack().setVisible(true);
				dispose();
			}
		});
		stack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		stack.setForeground(new Color(25, 25, 112));
		stack.setBounds(103, 84, 91, 25);
		contentPane.add(stack);
		
		JButton queue = new JButton("Queue");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for queue function
				new Queue().setVisible(true);
				dispose();
			}
		});
		queue.setForeground(new Color(75, 0, 130));
		queue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		queue.setBounds(266, 84, 101, 25);
		contentPane.add(queue);
		
		JButton singlylinkedlist = new JButton("SinglyLinkedlist");
		singlylinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for singly linked list function
				new SinglyLinkedlist().setVisible(true);
				dispose();
			}
		});
		singlylinkedlist.setFont(new Font("Times New Roman", Font.BOLD, 14));
		singlylinkedlist.setForeground(new Color(165, 42, 42));
		singlylinkedlist.setBounds(10, 137, 184, 25);
		contentPane.add(singlylinkedlist);
		
		JButton double_linkedlist = new JButton("Double_Linkedlist");
		double_linkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for double linked list function
				new DoublyLinkedlist().setVisible(true);
				dispose();
			}
			
		});
		double_linkedlist.setFont(new Font("Times New Roman", Font.BOLD, 14));
		double_linkedlist.setForeground(new Color(255, 0, 0));
		double_linkedlist.setBounds(266, 137, 209, 25);
		contentPane.add(double_linkedlist);
		
		JButton circularQueue = new JButton("Circular_Queue");
		circularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for circular queue function
				new CircularQueue().setVisible(true);
				dispose();
			}
		});
		circularQueue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		circularQueue.setForeground(new Color(255, 20, 147));
		circularQueue.setBounds(147, 205, 171, 25);
		contentPane.add(circularQueue);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bhanu prakash\\Downloads\\background images\\istockphoto-1353553203-170667a.jpg"));
		lblNewLabel.setBounds(0, 0, 506, 342);
		contentPane.add(lblNewLabel);
	}
}
