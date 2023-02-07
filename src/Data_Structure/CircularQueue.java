package Data_Structure;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField size1;
	private JTextField element;
	private JTextField result;
	private int cq[];
	private int size;
	private int f=0;
	private int r=-1;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 150, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading1 = new JLabel("CircularQueue Data Structure");
		heading1.setForeground(new Color(255, 215, 0));
		heading1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading1.setBounds(184, 22, 233, 21);
		contentPane.add(heading1);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//logic to insert element 
				try
				{
				size=cq.length;
				if(count==size)
				{
					JOptionPane.showMessageDialog(insert,"insertion is not possiable" );
				}
				else
				{
					
					int elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					++count;
					String message="element inserted is "+cq[r];
					JOptionPane.showMessageDialog(insert, message);
					element.setText("");
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(insert, "NumberFormatException:enter a number to insert");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(insert, "NullPointerException:first create circular Q");
				}
				
			}
		});
		insert.setFont(new Font("Times New Roman", Font.BOLD, 15));
		insert.setBounds(410, 164, 104, 23);
		contentPane.add(insert);
		
		JButton create = new JButton("Create CircularQueue");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create circularQueue
				try
				{
				int len=Integer.valueOf(size1.getText());
				cq=new int[len];
				String message="CircularQueue of size "+len+" created";
				JOptionPane.showMessageDialog(create, message);
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(create, "NumberFormatException:enter number to create circular Q");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(create, "NullPointerException: first create circular Q");
				}
			}
		});
		create.setForeground(new Color(0, 100, 0));
		create.setFont(new Font("Times New Roman", Font.BOLD, 15));
		create.setBounds(201, 114, 216, 27);
		contentPane.add(create);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to delete the element
				try
				{
				if(count==0)
				{
					JOptionPane.showMessageDialog(delete,"CircularQueue is empty" );
				}
				else
				{
					JOptionPane.showMessageDialog(delete, "the element is deleted is "+cq[f]);
					f=(f+1)%size;
					--count;
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(delete, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(delete, "NullPointerException: enter a number");
				}
			}
		});
		delete.setForeground(new Color(184, 134, 11));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		delete.setBounds(276, 198, 89, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display the element
				try
				{
				String msg="";
				if(count==0)
				{
					JOptionPane.showMessageDialog(delete,"CircularQueue is empty" );
				}
				else
				{
					for (int i=1;i<=count;i++)
					{
						
						msg=msg+" "+cq[f];
						f=(f+1)%size;
					}
					result.setText(msg+" ");
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(delete, "NumberFormatException: enter a number");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(delete, "NullPointerException: enter a number");
				}
			}
		});
		display.setForeground(new Color(30, 144, 255));
		display.setFont(new Font("Times New Roman", Font.BOLD, 15));
		display.setBounds(276, 256, 102, 23);
		contentPane.add(display);
		
		JLabel lblEnterCircularqueueSize = new JLabel("Enter circularQueue size");
		lblEnterCircularqueueSize.setForeground(new Color(0, 206, 209));
		lblEnterCircularqueueSize.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnterCircularqueueSize.setBounds(50, 71, 163, 18);
		contentPane.add(lblEnterCircularqueueSize);
		
		size1 = new JTextField();
		size1.setForeground(new Color(154, 205, 50));
		size1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		size1.setBounds(238, 68, 126, 24);
		contentPane.add(size1);
		size1.setColumns(10);
		
		element = new JTextField();
		element.setForeground(new Color(154, 205, 50));
		element.setFont(new Font("Times New Roman", Font.BOLD, 15));
		element.setColumns(10);
		element.setBounds(252, 163, 126, 24);
		contentPane.add(element);
		
		JLabel heading3 = new JLabel("Enter an element");
		heading3.setForeground(new Color(255, 0, 255));
		heading3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		heading3.setBounds(115, 166, 113, 18);
		contentPane.add(heading3);
		
		result = new JTextField();
		result.setForeground(new Color(154, 205, 50));
		result.setFont(new Font("Times New Roman", Font.BOLD, 15));
		result.setColumns(10);
		result.setBounds(179, 304, 274, 24);
		contentPane.add(result);
		
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
		btnHome.setBounds(260, 355, 105, 23);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bhanu prakash\\Downloads\\background images\\modern-gold-background-free-vector.jpg"));
		lblNewLabel.setBounds(0, 0, 655, 396);
		contentPane.add(lblNewLabel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
