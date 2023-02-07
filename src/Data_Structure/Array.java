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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField tflength;
	
	private JTextField tfelement;
	private JTextField tfposition;
	private JTextField tfdelete;
	private JTextField tfdisplay;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Array_Data_Structures");
		lblNewLabel.setForeground(new Color(173, 255, 47));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(207, 28, 179, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lebelLength = new JLabel("Enter Array Length");
		lebelLength.setForeground(new Color(0, 255, 255));
		lebelLength.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lebelLength.setBounds(85, 81, 122, 17);
		contentPane.add(lebelLength);
		
		tflength = new JTextField();
		tflength.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tflength.setForeground(new Color(128, 0, 128));
		tflength.setBounds(232, 78, 126, 23);
		contentPane.add(tflength);
		tflength.setColumns(10);
		
		JButton bcreatearray = new JButton("Create Array");
		bcreatearray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
				//logic to create the array
			int len=Integer.valueOf(tflength.getText());
				arr=new int[len];
				String message="Array of length "+len+" created";
				JOptionPane.showMessageDialog(bcreatearray, message);
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(bcreatearray, "NumberFormatException: enter size of array");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(bcreatearray, "NullPointerException: give values to create array");
				}
				
			}
		});
		bcreatearray.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bcreatearray.setForeground(new Color(255, 69, 0));
		bcreatearray.setBounds(228, 112, 130, 25);
		contentPane.add(bcreatearray);
		
		JLabel labelInsert = new JLabel("Enter a Number to Insert");
		labelInsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		labelInsert.setForeground(new Color(255, 255, 0));
		labelInsert.setBounds(51, 169, 156, 17);
		contentPane.add(labelInsert);
		
		tfelement = new JTextField();
		tfelement.setForeground(new Color(128, 0, 128));
		tfelement.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tfelement.setBounds(228, 166, 115, 23);
		contentPane.add(tfelement);
		tfelement.setColumns(10);
		
		JLabel labelposition = new JLabel("Position");
		labelposition.setForeground(new Color(255, 255, 0));
		labelposition.setFont(new Font("Times New Roman", Font.BOLD, 16));
		labelposition.setBounds(355, 169, 53, 20);
		contentPane.add(labelposition);
		
		tfposition = new JTextField();
		tfposition.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tfposition.setForeground(new Color(139, 69, 19));
		tfposition.setBounds(414, 166, 75, 23);
		contentPane.add(tfposition);
		tfposition.setColumns(10);
		
		JButton bInsert = new JButton("Insert");
		bInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to insert the element into array
				try 
				{
				int size=arr.length;
                int pos=Integer.valueOf(tfposition.getText());
                int elem=Integer.valueOf(tfelement.getText());
                if(pos>size-1)
                {
                	String message1=" position you enter is out of bounds ";
    				JOptionPane.showMessageDialog(bInsert, message1);
                }
                else {
				arr[pos]=elem;
				String message1="Element "+elem+" is inserted in "+pos+" position";
				JOptionPane.showMessageDialog(bInsert, message1);
                }
				tfposition.setText("");
				tfelement.setText("");
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(bInsert, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(bInsert, "NullPointerException: first create array");
				}
				
			}
		});
		bInsert.setForeground(new Color(210, 105, 30));
		bInsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bInsert.setBounds(499, 165, 93, 25);
		contentPane.add(bInsert);
		
		JLabel lableDelete = new JLabel("Enter the position to delete");
		lableDelete.setForeground(new Color(102, 205, 170));
		lableDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lableDelete.setBounds(40, 209, 167, 17);
		contentPane.add(lableDelete);
		
		tfdelete = new JTextField();
		tfdelete.setForeground(new Color(255, 215, 0));
		tfdelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tfdelete.setBounds(217, 206, 126, 23);
		contentPane.add(tfdelete);
		tfdelete.setColumns(10);
		
		JButton bdelete = new JButton("Delete");
		bdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to delete the array position
				try
				{
				 int pos1=Integer.valueOf(tfdelete.getText());
					
					arr[pos1]=0;
					String message2="Element position "+pos1+" is deleted";
					JOptionPane.showMessageDialog(bdelete, message2);
					tfdelete.setText("");
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(bdelete, "NumberFormatException: enter position number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(bdelete, "NullPointerException: first create array");
				}
				
			}
		});
		bdelete.setForeground(new Color(138, 43, 226));
		bdelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bdelete.setBounds(351, 205, 93, 25);
		contentPane.add(bdelete);
		
		JButton bdispllay = new JButton("Display");
		bdispllay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to display of array
				try
				{
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				tfdisplay.setText(msg);
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(bInsert, "NumberFormatException: first create array");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(bInsert, "NullPointerException: first create array");
				}
			}
		});
		bdispllay.setForeground(new Color(255, 0, 255));
		bdispllay.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bdispllay.setBounds(266, 268, 109, 25);
		contentPane.add(bdispllay);
		
		tfdisplay = new JTextField();
		tfdisplay.setForeground(new Color(30, 144, 255));
		tfdisplay.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tfdisplay.setBounds(173, 304, 233, 23);
		contentPane.add(tfdisplay);
		tfdisplay.setColumns(10);  
		
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
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnHome.setBounds(266, 353, 92, 25);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\bhanu prakash\\Downloads\\background images\\1256144.jpg"));
		lblNewLabel_1.setBounds(0, 0, 643, 389);
		contentPane.add(lblNewLabel_1);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
