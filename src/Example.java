import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class Example {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example window = new Example();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Example() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 102));
		frame.setBounds(100, 100, 735, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblScore = new JLabel("SCORE 1");
		lblScore.setForeground(Color.WHITE);
		lblScore.setBounds(10, 11, 66, 24);
		frame.getContentPane().add(lblScore);
		
		JLabel lblScore_1 = new JLabel("SCORE 2");
		lblScore_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblScore_1.setForeground(Color.WHITE);
		lblScore_1.setBounds(358, 11, 66, 24);
		frame.getContentPane().add(lblScore_1);
		
		JButton btnStart = new JButton("START");
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("The game has started");
			}
		});
		btnStart.setBackground(Color.GRAY);
		btnStart.setForeground(Color.WHITE);
		btnStart.setBounds(131, 11, 155, 41);
		frame.getContentPane().add(btnStart);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(0, 0, 153));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println();
			}
		});
		label.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label.setBounds(10, 391, 54, 54);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(new Color(0, 0, 102));
		label_1.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_1.setBounds(74, 391, 54, 54);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_2.setBounds(138, 391, 54, 54);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_3.setBounds(202, 391, 54, 54);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_4.setBounds(267, 391, 54, 54);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_5.setBounds(331, 391, 54, 54);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_6.setBounds(10, 326, 54, 54);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_7.setBounds(652, 391, 54, 54);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_8.setBounds(588, 391, 54, 54);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_9.setBounds(524, 391, 54, 54);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_10.setBounds(460, 391, 54, 54);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_11.setBounds(396, 391, 54, 54);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_12.setBounds(74, 326, 54, 54);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_13.setBounds(138, 326, 54, 54);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_14.setBounds(202, 326, 54, 54);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_15.setBounds(267, 326, 54, 54);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_16.setBounds(331, 326, 54, 54);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_17.setBounds(396, 326, 54, 54);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_18.setBounds(460, 326, 54, 54);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_19.setBounds(524, 326, 54, 54);
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_20.setBounds(588, 326, 54, 54);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\Folder\\pumkin.png"));
		label_21.setBounds(652, 326, 54, 54);
		frame.getContentPane().add(label_21);
	}
}
