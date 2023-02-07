package Data_Structure;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField size1;
	private JTextField element;
	private JTextField result;
	private int arr[];
	private int  size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading1 = new JLabel("Stack Data Structure");
		heading1.setForeground(new Color(30, 144, 255));
		heading1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading1.setBounds(243, 0, 162, 39);
		contentPane.add(heading1);
		
		JLabel heading2 = new JLabel("ENTER THE  STACK SIZE");
		heading2.setForeground(new Color(240, 128, 128));
		heading2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		heading2.setBounds(87, 63, 189, 20);
		contentPane.add(heading2);
		
		JLabel heading3 = new JLabel("ENTER AN ELEMENT ");
		heading3.setForeground(new Color(255, 215, 0));
		heading3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		heading3.setBounds(122, 170, 136, 17);
		contentPane.add(heading3);
		
		size1 = new JTextField();
		size1.setForeground(new Color(128, 128, 0));
		size1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		size1.setBounds(286, 61, 126, 24);
		contentPane.add(size1);
		size1.setColumns(10);
		
		element = new JTextField();
		element.setForeground(new Color(128, 128, 0));
		element.setFont(new Font("Times New Roman", Font.BOLD, 15));
		element.setColumns(10);
		element.setBounds(268, 166, 126, 24);
		contentPane.add(element);
		
		result = new JTextField();
		result.setForeground(new Color(47, 79, 79));
		result.setFont(new Font("Times New Roman", Font.BOLD, 15));
		result.setColumns(10);
		result.setBounds(161, 317, 333, 24);
		contentPane.add(result);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//logic to create a stack
				try
				{
				int len=Integer.valueOf(size1.getText());
				arr=new int[len];
				
				String message="Stack of size "+len+" created";
				JOptionPane.showMessageDialog(create, message);
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(create, "NumberFormatException:enter number to create stack");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(create, "NullPointerException:first create stack");
				}
			}
		});
		create.setFont(new Font("Times New Roman", Font.BOLD, 15));
		create.setForeground(new Color(0, 0, 205));
		create.setBounds(243, 115, 189, 27);
		contentPane.add(create);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to pop the element in stack
				try
				{
				if(top==-1)
				{
					JOptionPane.showMessageDialog(pop, "stack is empty");
				}
				else
				{
					String message="elemented pop is :"+arr[top];
					JOptionPane.showMessageDialog(pop, message);
					--top;
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(pop, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(pop, "NullPointerException: first create a stack");
				}
				
			}
		});
		pop.setForeground(new Color(255, 0, 0));
		pop.setFont(new Font("Times New Roman", Font.BOLD, 15));
		pop.setBounds(296, 223, 87, 27);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to display the element in stack
				try
				{
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(display, "display not possiable");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg=msg+" "+arr[i];
					}
					result.setText(msg);
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(display, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(display, "NullPointerException: create a stack");
				}
			   }
		});
		display.setForeground(new Color(255, 140, 0));
		display.setFont(new Font("Times New Roman", Font.BOLD, 15));
		display.setBounds(286, 273, 119, 27);
		contentPane.add(display);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//logic to push the element
				try
				{
				size=arr.length;
				if(top==size-1)
				{
				JOptionPane.showMessageDialog(push, "Stack is full");
				}
				else {
				int elem=Integer.valueOf(element.getText());
				++top;
				arr[top]=elem;
				
				String message="push is sucessfull";
				JOptionPane.showMessageDialog(push, message);
				element.setText("");
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(push, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(push, "NullPointerException: create a stack");
				}
			}
		});
		push.setForeground(Color.RED);
		push.setFont(new Font("Times New Roman", Font.BOLD, 15));
		push.setBounds(421, 165, 106, 27);
		contentPane.add(push);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to open home page
				Data_Structures_Application ds=new Data_Structures_Application();
				ds.show();
				dispose();
			}
		});
		btnHome.setForeground(new Color(165, 42, 42));
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnHome.setBounds(286, 363, 119, 27);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bhanu prakash\\Downloads\\background images\\7204636.jpg"));
		lblNewLabel.setBounds(0, 0, 635, 401);
		contentPane.add(lblNewLabel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
