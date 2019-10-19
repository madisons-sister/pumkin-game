package helloWorld;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.ImageIcon;

public class example {
	
	public int score = 0;
	
	public static void gameMechanics () {
		
		int grid_Layout[];
		grid_Layout = new int[20];
	}
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					example window = new example();
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
	public example() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblScore = new JLabel("Score One:");
		lblScore.setBounds(15, 16, 94, 20);
		frame.getContentPane().add(lblScore);
		
		JButton btnButton = new JButton("Button");
		btnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.print("Button clicked!");
			}
		});
		btnButton.setBackground(Color.BLACK);
		btnButton.setForeground(Color.GREEN);
		btnButton.setBounds(298, 12, 115, 29);
		frame.getContentPane().add(btnButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(56, 265, 69, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel(Integer.toString(score));
		label_1.setBounds(124, 16, 69, 20);
		frame.getContentPane().add(label_1);
				
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				label_1.setText(Integer.toString(score));
				
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
			
		});
		label.setIcon(new ImageIcon("C:\\Users\\Audrey Hill\\eclipse-workspace\\helloWorld\\5-2-pumpkin-picture-thumb.png"));
		label.setBounds(90, 147, 202, 199);
		frame.getContentPane().add(label);
		
		
	}
}
