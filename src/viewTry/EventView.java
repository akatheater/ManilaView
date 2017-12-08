package viewTry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class EventView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventView frame = new EventView();
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
	public EventView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1498, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel event3 = new JPanel();
		event3.setBounds(0, 0, 1493, 700);
		contentPane.add(event3);
		event3.setLayout(null);
		
		JLabel destroyBoat = new JLabel("");
		destroyBoat.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\boat1Name.PNG"));
		destroyBoat.setBounds(687, 458, 200, 50);
		event3.add(destroyBoat);
		
		JLabel bg3 = new JLabel("");
		bg3.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\event3.png"));
		bg3.setBounds(0, 0, 1493, 700);
		event3.add(bg3);
		
		JPanel event2 = new JPanel();
		event2.setBounds(0, 0, 1493, 700);
		contentPane.add(event2);
		event2.setLayout(null);
		
		JLabel robBoat = new JLabel("");
		robBoat.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\boat1Name.PNG"));
		robBoat.setBounds(779, 486, 200, 50);
		event2.add(robBoat);
		
		JLabel nextBtn2 = new JLabel("");
		nextBtn2.setBounds(951, 551, 46, 42);
		event2.add(nextBtn2);
		
		JLabel bg2 = new JLabel("");
		bg2.setBounds(0, 0, 1493, 700);
		bg2.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\event2.png"));
		event2.add(bg2);
		
		JPanel event1 = new JPanel();
		event1.setBounds(0, 0, 1493, 700);
		contentPane.add(event1);
		event1.setLayout(null);
		
		JLabel onBoat = new JLabel("");
		onBoat.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\boat1Name.PNG"));
		onBoat.setBounds(774, 465, 200, 50);
		event1.add(onBoat);
		
		JLabel nextBtn1 = new JLabel("");
		nextBtn1.setBounds(952, 552, 44, 40);
		event1.add(nextBtn1);
		
		JLabel bg1 = new JLabel("");
		bg1.setBounds(0, 0, 1493, 700);
		bg1.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\event1.png"));
		event1.add(bg1);
		
		JPanel event0 = new JPanel();
		event0.setBounds(0, 0, 1493, 700);
		contentPane.add(event0);
		event0.setLayout(null);
		
		JLabel boat1For = new JLabel("");
		boat1For.setBounds(837, 446, 81, 21);
		event0.add(boat1For);
		
		JLabel boat2For = new JLabel("");
		boat2For.setBounds(836, 481, 81, 21);
		event0.add(boat2For);
		
		JLabel boat3For = new JLabel("");
		boat3For.setBounds(832, 515, 81, 21);
		event0.add(boat3For);
		
		JLabel nextBtn0 = new JLabel("");
		nextBtn0.setBounds(955, 554, 39, 39);
		event0.add(nextBtn0);
		
		JLabel bg0 = new JLabel("");
		bg0.setBounds(0, 0, 1493, 700);
		bg0.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\event0.png"));
		event0.add(bg0);
		
		JLabel bg = new JLabel("");
		bg.setBounds(0, 0, 1493, 700);
		bg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\eventBg.png"));
		contentPane.add(bg);
	}
}
