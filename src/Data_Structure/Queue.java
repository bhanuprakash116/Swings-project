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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField result;
	private JTextField size1;
	private int q[];
	private int r=-1;
	private int size;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Queue Data Structure");
		heading.setForeground(new Color(255, 0, 255));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading.setBounds(203, 11, 169, 21);
		contentPane.add(heading);
		
		JLabel heading2 = new JLabel("Enter Queue size");
		heading2.setForeground(new Color(222, 184, 135));
		heading2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		heading2.setBounds(96, 69, 114, 20);
		contentPane.add(heading2);
		
		JLabel heading3 = new JLabel("Enter element ");
		heading3.setForeground(new Color(176, 224, 230));
		heading3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		heading3.setBounds(112, 125, 98, 20);
		contentPane.add(heading3);
		
		element = new JTextField();
		element.setForeground(new Color(128, 0, 128));
		element.setFont(new Font("Times New Roman", Font.BOLD, 15));
		element.setBounds(220, 123, 126, 24);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//logic to insert element into Queue
				try
				{
				size=q.length;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(insert, "queue is full");
				}
				else{
				int elem=Integer.valueOf(element.getText());
				++r;
				q[r]=elem;
				String message="element "+elem+" inserted in Queue";
				JOptionPane.showMessageDialog(insert, message);
				element.setText("");
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(insert, "NumberFormatException: enter number ");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(insert, "NullPointerException: first create queue");
				}
			}
		});
		insert.setFont(new Font("Times New Roman", Font.BOLD, 15));
		insert.setBounds(356, 122, 114, 23);
		contentPane.add(insert);
		
		result = new JTextField();
		result.setForeground(new Color(128, 0, 128));
		result.setFont(new Font("Times New Roman", Font.BOLD, 15));
		result.setColumns(10);
		result.setBounds(158, 288, 220, 24);
		contentPane.add(result);
		
		JButton delete = new JButton("Delete");
		delete.setForeground(new Color(139, 0, 0));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to delete element in queue
				try
				{
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(delete, "queue is empty");
				}
				else
				{
					JOptionPane.showMessageDialog(delete, "element deleted at"+(q[f]));
					++f;
				}
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(delete, "NumberFormatException:create a queue");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(delete, "NullPointerException: first create a queue");
				}
			}
		});
		delete.setBounds(233, 179, 113, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to display Queue
				try
				{
			String msg="";
			if(r==-1||f>r)
			{
				JOptionPane.showMessageDialog(display, "display not possiable");
			}
			else
			{
				for(int i=f;i<=r;i++)
				{
					msg=msg+" "+q[i];
				}
				result.setText(msg+" ");
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
		display.setForeground(new Color(46, 139, 87));
		display.setFont(new Font("Times New Roman", Font.BOLD, 15));
		display.setBounds(233, 233, 113, 23);
		contentPane.add(display);
		
		size1 = new JTextField();
		size1.setForeground(new Color(128, 0, 128));
		size1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		size1.setColumns(10);
		size1.setBounds(220, 67, 126, 24);
		contentPane.add(size1);
		
		JButton create = new JButton("Create Queue");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create Queue
				try
				{
				int len=Integer.valueOf(size1.getText());
				q=new int[len];
				String message="Queue of size "+len+" created";
				JOptionPane.showMessageDialog(create, message);
				}
				catch(NumberFormatException n)
				{
					JOptionPane.showMessageDialog(create, "NumberFormatException: enter number to create queue");
				}
				catch(NullPointerException p)
				{
					JOptionPane.showMessageDialog(create, "NullPointerException: first create queue");
				}
			}
		});
		create.setForeground(new Color(0, 0, 255));
		create.setFont(new Font("Times New Roman", Font.BOLD, 15));
		create.setBounds(356, 69, 146, 27);
		contentPane.add(create);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//logic to open home page
				Data_Structures_Application ds=new Data_Structures_Application();
				ds.show();
				dispose();
			}
		});
		btnHome.setForeground(new Color(139, 0, 0));
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnHome.setBounds(233, 323, 113, 23);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bhanu prakash\\Downloads\\background images\\deep-blue-background.jpg"));
		lblNewLabel.setBounds(0, 0, 657, 380);
		contentPane.add(lblNewLabel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
