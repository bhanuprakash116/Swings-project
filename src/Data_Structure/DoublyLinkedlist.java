package Data_Structure;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class DoublyLinkedlist extends JFrame {
	
	private JPanel contentPane;
	private JTextField elementfront;
	private JTextField elementrear;
	private JTextField displaybox;
	private JButton insertrear;
	private JButton deletefront;
	private JButton deleterear;
	private JButton displayforward;
	private JButton displaybackward;
	private	Node first;
	private JLabel lblNewLabel;
	


	/**
	 * Launch the application.
	 */
	class Node
	{
		int data;
		Node prelink;
	    Node nextlink;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedlist frame = new DoublyLinkedlist();
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
	public DoublyLinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 369);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading1 = new JLabel("Doubly linkedlist Data Structure");
		heading1.setForeground(new Color(255, 0, 255));
		heading1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		heading1.setBackground(new Color(255, 222, 173));
		heading1.setBounds(155, 11, 216, 20);
		contentPane.add(heading1);
		
		JLabel heading2 = new JLabel("Enter an Element");
		heading2.setForeground(new Color(244, 164, 96));
		heading2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		heading2.setBackground(new Color(255, 222, 173));
		heading2.setBounds(10, 62, 116, 20);
		contentPane.add(heading2);
		
		JLabel heading3 = new JLabel("Enter an Element");
		heading3.setForeground(new Color(255, 165, 0));
		heading3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		heading3.setBackground(new Color(255, 222, 173));
		heading3.setBounds(10, 107, 116, 20);
		contentPane.add(heading3);
		
		elementfront = new JTextField();
		elementfront.setFont(new Font("Times New Roman", Font.BOLD, 15));
		elementfront.setForeground(new Color(138, 43, 226));
		elementfront.setBounds(155, 60, 126, 24);
		contentPane.add(elementfront);
		elementfront.setColumns(10);
		
		elementrear = new JTextField();
		elementrear.setForeground(new Color(138, 43, 226));
		elementrear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		elementrear.setColumns(10);
		elementrear.setBounds(155, 108, 126, 24);
		contentPane.add(elementrear);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(255, 0, 0));
		displaybox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		displaybox.setColumns(10);
		displaybox.setBounds(125, 267, 277, 24);
		contentPane.add(displaybox);
		
		JButton insertfront = new JButton("Insert Front");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to insert front end
				 try
				 {
				int elem=Integer.valueOf(elementfront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(elementfront, "elemnt inserted in front is sucessful ");
					elementfront.setText("");
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(elementfront, "elemnt inserted in front is sucessful ");
					elementfront.setText("");
				}
				 }
				 catch(NumberFormatException n)
					{
						JOptionPane.showMessageDialog(elementfront, "NumberFormatException: entera  number");
					}
					catch(NullPointerException p)
					{
						JOptionPane.showMessageDialog(elementfront, "NullPointerException: enter a number");
					}
			}
		});
		insertfront.setForeground(new Color(0, 0, 139));
		insertfront.setFont(new Font("Times New Roman", Font.BOLD, 15));
		insertfront.setBounds(333, 62, 127, 27);
		contentPane.add(insertfront);
		
		insertrear = new JButton("Insert Rear");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to insert in rear end
				try
				{
				Node temp;
				int elem=Integer.valueOf(elementrear.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(insertrear, "element inserted at rear is sucessfull");
					elementrear.setText("");
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(insertrear, "element inserted at rear is sucessfull");
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
		insertrear.setForeground(new Color(255, 0, 0));
		insertrear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		insertrear.setBounds(333, 107, 127, 27);
		contentPane.add(insertrear);
		
		deletefront = new JButton("Delete Front");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to delete front end
				try
				{
				if(first==null)
				{
					JOptionPane.showMessageDialog(deletefront, "deletion not possiable");
				}
				else if(first.nextlink==null)
				{
				JOptionPane.showMessageDialog(deletefront, "deleted element is"+(first.data));
					first=null;
				}
				else
				{
					first=first.nextlink;
					first.prelink=null;
					JOptionPane.showMessageDialog(deletefront, "element deleted at front");
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
		deletefront.setBounds(191, 143, 126, 27);
		contentPane.add(deletefront);
		
		deleterear = new JButton("Delete Rear");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to delete rear end
				try
				{
				 Node temp;	
					if(first==null)
					{
						JOptionPane.showMessageDialog(deleterear, "deletion not possiable");
					}
					else if(first.nextlink==null)
					{
						JOptionPane.showMessageDialog(deleterear, "deleted element is"+(first.data));
						first=null;
					}
					else
					{	
						temp=first;
						while(temp.nextlink.nextlink!=null)
						{
							temp=temp.nextlink;
						}
						JOptionPane.showMessageDialog(deleterear, "deleted element is "+(temp.nextlink.data));
						temp.nextlink=null;
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
		deleterear.setForeground(new Color(255, 0, 0));
		deleterear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		deleterear.setBounds(191, 181, 126, 27);
		contentPane.add(deleterear);
		
		displayforward = new JButton("Display Forward");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to display forward 
				try
				{
				String result="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(displayforward ,"display not possiable");
				}
				else if(first.nextlink==null)
				{
					
					result=result+" "+String.valueOf(first.data);
					displaybox.setText(result);
				}
				else
				{	
					temp=first;
					while(temp!=null)
					{
						result=result+" "+String.valueOf(temp.data);
						displaybox.setText(result+" ");
						temp=temp.nextlink;
					}
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(displayforward, "NumberFormatException: give number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(displayforward, "NullPointerException: give values to create array");
				}
			}
		});
		displayforward.setForeground(new Color(0, 0, 139));
		displayforward.setFont(new Font("Times New Roman", Font.BOLD, 15));
		displayforward.setBounds(59, 229, 162, 27);
		contentPane.add(displayforward);
		
		displaybackward = new JButton("Display BackWard");
		displaybackward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to display backward
				try
				{
				String result="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(displaybackward ,"display not possiable");
				}
				else if(first.nextlink==null)
				{
					result=result+" "+String.valueOf(first.data);
					displaybox.setText(result+" ");
				
				}
				else
				{	
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
						
					}
					
					while(temp!=null)
					{
						
						result=result+" "+String.valueOf(temp.data+" ");
						displaybox.setText(result+" ");	
						temp=temp.prelink;
					}
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(displaybackward, "NumberFormatException: give number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(displaybackward, "NullPointerException: give values to create array");
				}
			}
		});
		displaybackward.setForeground(new Color(255, 0, 0));
		displaybackward.setFont(new Font("Times New Roman", Font.BOLD, 15));
		displaybackward.setBounds(307, 229, 175, 27);
		contentPane.add(displaybackward);
		
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
		btnHome.setBounds(195, 302, 122, 27);
		contentPane.add(btnHome);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bhanu prakash\\Downloads\\background images\\v1016-c-02-ksh6qkug.jpg"));
		lblNewLabel.setBounds(0, 0, 539, 329);
		contentPane.add(lblNewLabel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
