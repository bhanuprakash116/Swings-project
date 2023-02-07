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

public class SinglyLinkedlist extends JFrame {

	private JPanel contentPane;
	private JTextField elementfront;
	private JTextField elementrear;
	private JTextField displaybox;
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedlist frame = new SinglyLinkedlist();
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
	class Node
	{
		 int data;
		 Node link;
	}
	public SinglyLinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 391);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Singly Linkedlist Data Structure");
		heading.setForeground(new Color(255, 192, 203));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 16));
		heading.setBounds(184, 11, 215, 20);
		contentPane.add(heading);
		
		JLabel heading2 = new JLabel("Enter an Element ");
		heading2.setForeground(new Color(255, 215, 0));
		heading2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		heading2.setBounds(54, 46, 119, 18);
		contentPane.add(heading2);
		
		JLabel heading3 = new JLabel("Enter an Element ");
		heading3.setForeground(new Color(175, 238, 238));
		heading3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		heading3.setBounds(54, 97, 119, 18);
		contentPane.add(heading3);
		
		elementfront = new JTextField();
		elementfront.setForeground(new Color(165, 42, 42));
		elementfront.setFont(new Font("Times New Roman", Font.BOLD, 15));
		elementfront.setBounds(215, 43, 126, 24);
		contentPane.add(elementfront);
		elementfront.setColumns(10);
		
		elementrear = new JTextField();
		elementrear.setForeground(new Color(165, 42, 42));
		elementrear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		elementrear.setColumns(10);
		elementrear.setBounds(215, 94, 126, 24);
		contentPane.add(elementrear);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(255, 0, 0));
		displaybox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		displaybox.setColumns(10);
		displaybox.setBounds(113, 252, 345, 24);
		contentPane.add(displaybox);
		
		JButton insertfront = new JButton("Insert Front");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to insert in front end
				try
				{
				int elem=Integer.valueOf(elementfront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
				first=newnode;
				JOptionPane.showMessageDialog(insertfront, "element inserted at front "+first.data);
					elementfront.setText("");
				}
				else
				{
					newnode.link=first;
					first=newnode;
					JOptionPane.showMessageDialog(insertfront, "element inserted at front "+first.data);
					elementfront.setText("");
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(insertfront, "NumberFormatException:enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(insertfront, "NullPointerException: give a number");
				}
				
			}
		});
		insertfront.setFont(new Font("Times New Roman", Font.BOLD, 15));
		insertfront.setForeground(new Color(0, 0, 139));
		insertfront.setBounds(378, 42, 132, 27);
		contentPane.add(insertfront);
		
		JButton insertrear = new JButton("Insert Rear");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to insert at rear end
				try
				{
				Node temp;
				int elem=Integer.valueOf(elementrear.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
				first=newnode;
				JOptionPane.showMessageDialog(insertrear, "element inserted at rear "+first.data);
				elementrear.setText("");
				}
				else
				{
					temp=first;
				while(temp.link!=null)
				{
					temp=temp.link;
				}
				temp.link=newnode;
				JOptionPane.showMessageDialog(insertrear, "element inserted at rear is sucessful");				
				elementrear.setText("");
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(insertrear, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(insertrear, "NullPointerException: enter a number");
				}
				
			}
		});
		insertrear.setForeground(new Color(255, 165, 0));
		insertrear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		insertrear.setBounds(378, 96, 132, 27);
		contentPane.add(insertrear);
		
		JButton deletefront = new JButton("Delete Front");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to delete at front end
				try
				{
				if(first==null)
				{
					JOptionPane.showMessageDialog(deletefront, "deletion not possiable");
				}
			 else if(first.link==null)
			{
				 JOptionPane.showMessageDialog(deletefront, "deleted element is"+(first.data));
				first=null;
			}
			else
				{
				JOptionPane.showMessageDialog(deletefront, "deleted element is"+(first.data));
					first=first.link;
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(deletefront, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(deletefront, "NullPointerException: enter a number");
				}
			}
		});
		deletefront.setForeground(new Color(0, 0, 139));
		deletefront.setFont(new Font("Times New Roman", Font.BOLD, 15));
		deletefront.setBounds(228, 129, 132, 27);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("Delete Rear");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to delete at rear end
				try
				{
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(deleterear,"deletion not possiable");
				}
			 else if(first.link==null)
			{
				 JOptionPane.showMessageDialog(deleterear, "deleted element is"+(first.data));
				first=null;
			}
			 else
			 {
				 temp=first;
				 while(temp.link.link!=null)
				 {
					 temp=temp.link;
				 }
				JOptionPane.showMessageDialog(deleterear,"deletion of element is "+(temp.link.data));
				 temp.link=null;
			 }
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(deleterear, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(deleterear, "NullPointerException: enter a number");
				}
			}
		});
		deleterear.setForeground(new Color(255, 69, 0));
		deleterear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		deleterear.setBounds(228, 163, 132, 27);
		contentPane.add(deleterear);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to display 
				try
				{
				String result="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(display, "display not possiable");
				}
			 else if(first.link==null)
			{
				 result=result+" "+String.valueOf(first.data);
				 displaybox.setText(result+" ");
			}
			 else
			 {
				 temp=first;
				 while(temp!=null)
				 {
					 result=result+" "+(String.valueOf(temp.data));
					 displaybox.setText(result+" ");
					 temp=temp.link;
				 }
				 
			 }
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(display, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(display, "NullPointerException: enter a number");
				}
			}
		});
		display.setForeground(new Color(0, 100, 0));
		display.setFont(new Font("Times New Roman", Font.BOLD, 15));
		display.setBounds(249, 213, 92, 27);
		contentPane.add(display);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to open home page
				Data_Structures_Application ds=new Data_Structures_Application();
				ds.show();
				dispose();
			}
		});
		btnHome.setForeground(new Color(139, 0, 0));
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnHome.setBounds(249, 287, 92, 27);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bhanu prakash\\Downloads\\background images\\istockphoto-1333612025-640x640.jpg"));
		lblNewLabel.setBounds(0, -13, 640, 373);
		contentPane.add(lblNewLabel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
