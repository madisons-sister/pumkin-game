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

	public int score = 0;
	public boolean clicked = false;

	
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
		
		JLabel scoreVar = new JLabel("");
		scoreVar.setForeground(Color.WHITE);
		scoreVar.setBounds(74, 13, 69, 20);
		frame.getContentPane().add(scoreVar);
		
		JLabel lblScore = new JLabel("SCORE: ");
		lblScore.setForeground(Color.WHITE);
		lblScore.setBounds(10, 11, 66, 24);
		frame.getContentPane().add(lblScore);
		
		JButton btnStart = new JButton("START");
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("The game has started");
			}
		});
		btnStart.setBackground(Color.GRAY);
		btnStart.setForeground(Color.RED);
		btnStart.setBounds(295, 11, 155, 41);
		frame.getContentPane().add(btnStart);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("pumkin.png"));
		label_2.setBounds(138, 391, 60, 54);
		frame.getContentPane().add(label_2);
		
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_2.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("pumkin.png"));
		label_3.setBounds(202, 391, 60, 54);
		frame.getContentPane().add(label_3);
		
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_3.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("pumkin.png"));
		label_5.setBounds(331, 391, 60, 54);
		frame.getContentPane().add(label_5);
		
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_5.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("pumkin.png"));
		label_6.setBounds(10, 326, 60, 54);
		frame.getContentPane().add(label_6);
		
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_6.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("pumkin.png"));
		label_7.setBounds(652, 391, 60, 54);
		frame.getContentPane().add(label_7);
		
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_7.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("pumkin.png"));
		label_8.setBounds(588, 391, 60, 54);
		frame.getContentPane().add(label_8);
		
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_8.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("pumkin.png"));
		label_9.setBounds(524, 391, 60, 54);
		frame.getContentPane().add(label_9);
		
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_9.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("pumkin.png"));
		label_11.setBounds(396, 391, 60, 54);
		frame.getContentPane().add(label_11);
		
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_11.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("pumkin.png"));
		label_12.setBounds(74, 326, 60, 54);
		frame.getContentPane().add(label_12);
		
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_12.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("pumkin.png"));
		label_15.setBounds(267, 326, 60, 54);
		frame.getContentPane().add(label_15);
		
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_15.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("pumkin.png"));
		label_17.setBounds(396, 326, 60, 54);
		frame.getContentPane().add(label_17);
		
		label_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_17.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("pumkin.png"));
		label_20.setBounds(10, 391, 60, 54);
		frame.getContentPane().add(label_20);
		
		label_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));				
				label_20.setIcon(new ImageIcon("dead pumkin.png"));

				
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("pumkin.png"));
		label_22.setBounds(10, 261, 60, 54);
		frame.getContentPane().add(label_22);
		
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_22.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
			}
		});
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("pumkin.png"));
		label_24.setBounds(138, 261, 60, 54);
		frame.getContentPane().add(label_24);
		
		label_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				score++;
				
				scoreVar.setText(Integer.toString(score));
				label_24.setIcon(new ImageIcon("dead pumkin.png"));

				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("spooky_tree.jpg"));
		label.setBounds(466, 76, 240, 304);
		frame.getContentPane().add(label);
		
	}
}

