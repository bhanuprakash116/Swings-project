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

public class bubbleSorting extends JFrame {

	private JPanel contentPane;
	private JTextField ta1;
	private JTextField ta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bubbleSorting frame = new bubbleSorting();
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
	public bubbleSorting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lableheading = new JLabel("Bubble Sorting");
		lableheading.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lableheading.setForeground(new Color(0, 0, 255));
		lableheading.setBounds(167, 11, 105, 18);
		contentPane.add(lableheading);
		
		JLabel lablea = new JLabel("Enter numbers to sort");
		lablea.setForeground(new Color(128, 0, 128));
		lablea.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lablea.setBounds(23, 66, 136, 17);
		contentPane.add(lablea);
		
		JLabel Labelb = new JLabel("Numbers after Sorting");
		Labelb.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Labelb.setForeground(new Color(199, 21, 133));
		Labelb.setBounds(23, 113, 124, 16);
		contentPane.add(Labelb);
		
		ta1 = new JTextField();
		ta1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ta1.setForeground(new Color(255, 0, 0));
		ta1.setBounds(186, 65, 178, 22);
		contentPane.add(ta1);
		ta1.setColumns(10);
		
		ta2 = new JTextField();
		ta2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ta2.setForeground(new Color(50, 205, 50));
		ta2.setBounds(186, 111, 178, 20);
		contentPane.add(ta2);
		ta2.setColumns(10);
		
		JButton bt1 = new JButton("Sorting");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//sorting logic
				String sentance=ta1.getText();
				String arr[]=sentance.split(" ");
				String help;
				
				for(int i=0;i<=arr.length-2;i++)
				{
					for(int j=0;j<=arr.length-2-i;j++)
					{
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1]))
						{
							help=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=help;
						}
						
					}
				}
				String result="";
				for(int i=0;i<=arr.length-1;i++)
				{
					result=result+arr[i]+" ";
				}
				ta2.setText(result);
				}
			
		});
		bt1.setForeground(new Color(160, 82, 45));
		bt1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		bt1.setBounds(183, 181, 105, 27);
		contentPane.add(bt1);
	}
}
