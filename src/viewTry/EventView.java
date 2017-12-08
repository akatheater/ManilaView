package viewTry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

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
		
		JPanel event6 = new JPanel();
		event6.setBounds(0, 0, 1493, 700);
		contentPane.add(event6);
		event6.setLayout(null);
		
		JLabel movePlayer = new JLabel("");
		movePlayer.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Name.PNG"));
		movePlayer.setBounds(655, 174, 80, 50);
		event6.add(movePlayer);
		
		JComboBox moveBoat1 = new JComboBox();
		moveBoat1.setBounds(820, 280, 100, 27);
		event6.add(moveBoat1);
		moveBoat1.addItem("不移动");
		moveBoat1.addItem("向前移动1");
		moveBoat1.addItem("向前移动2");
		moveBoat1.addItem("向后移动1");
		moveBoat1.addItem("向后移动2");
		
		JComboBox moveBoat2 = new JComboBox();
		moveBoat2.setBounds(820, 346, 100, 27);
		event6.add(moveBoat2);
		moveBoat2.addItem("不移动");
		moveBoat2.addItem("向前移动1");
		moveBoat2.addItem("向前移动2");
		moveBoat2.addItem("向后移动1");
		moveBoat2.addItem("向后移动2");
		
		JComboBox moveBoat3 = new JComboBox();
		moveBoat3.setBounds(820, 416, 100, 27);
		event6.add(moveBoat3);
		moveBoat3.addItem("不移动");
		moveBoat3.addItem("向前移动1");
		moveBoat3.addItem("向前移动2");
		moveBoat3.addItem("向后移动1");
		moveBoat3.addItem("向后移动2");
		
		JLabel nextBtn6 = new JLabel("");
		nextBtn6.setBounds(951, 551, 46, 42);
		event6.add(nextBtn6);
		
		JLabel bg6 = new JLabel("");
		bg6.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\event6.png"));
		bg6.setBounds(0, 0, 1493, 700);
		event6.add(bg6);
		
		JPanel event5 = new JPanel();
		event5.setBounds(0, 0, 1493, 700);
		contentPane.add(event5);
		event5.setLayout(null);
		
		JLabel robPlayer = new JLabel("");
		robPlayer.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Name.PNG"));
		robPlayer.setBounds(658, 150, 80, 50);
		event5.add(robPlayer);
		
		JLabel robBoat1 = new JLabel("");
		robBoat1.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\robBoat1.png"));
		robBoat1.setBounds(592, 198, 375, 76);
		event5.add(robBoat1);
		
		JLabel robBoat2 = new JLabel("");
		robBoat2.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\robBoat2.png"));
		robBoat2.setBounds(592, 263, 375, 76);
		event5.add(robBoat2);
		
		JLabel robBoat3 = new JLabel("");
		robBoat3.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\robBoat3.png"));
		robBoat3.setBounds(592, 328, 375, 76);
		event5.add(robBoat3);
		
		JLabel stop1 = new JLabel("");
		stop1.setBounds(678, 463, 81, 31);
		event5.add(stop1);
		
		JLabel stop2 = new JLabel("");
		stop2.setBounds(806, 466, 81, 26);
		event5.add(stop2);
		
		JLabel stop3 = new JLabel("");
		stop3.setBounds(674, 503, 81, 28);
		event5.add(stop3);
		
		JLabel stop4 = new JLabel("");
		stop4.setBounds(808, 501, 81, 32);
		event5.add(stop4);
		
		JLabel stopBg = new JLabel("");
		stopBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\stopBg.png"));
		stopBg.setBounds(626, 405, 315, 141);
		event5.add(stopBg);
		
		JLabel nextBtn5 = new JLabel("");
		nextBtn5.setBounds(951, 551, 46, 42);
		event5.add(nextBtn5);
		
		JLabel bg5 = new JLabel("");
		bg5.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\event5.png"));
		bg5.setBounds(0, 0, 1493, 700);
		event5.add(bg5);
		
		JPanel event4 = new JPanel();
		event4.setBounds(0, 0, 1493, 700);
		contentPane.add(event4);
		event4.setLayout(null);
		
		JLabel onPlayer = new JLabel("");
		onPlayer.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Name.PNG"));
		onPlayer.setBounds(667, 150, 80, 50);
		event4.add(onPlayer);
		
		JLabel onBoat1 = new JLabel("");
		onBoat1.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\onBoat1.png"));
		onBoat1.setBounds(592, 198, 389, 85);
		event4.add(onBoat1);
		
		JLabel onBoat2 = new JLabel("");
		onBoat2.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\onBoat2.png"));
		onBoat2.setBounds(592, 263, 389, 85);
		event4.add(onBoat2);
		
		JLabel onBoat3 = new JLabel("");
		onBoat3.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\onBoat3.png"));
		onBoat3.setBounds(592, 328, 389, 85);
		event4.add(onBoat3);
		
		JLabel drive1 = new JLabel("");
		drive1.setBounds(682, 462, 91, 39);
		event4.add(drive1);
		
		JLabel drive2 = new JLabel("");
		drive2.setBounds(798, 464, 85, 39);
		event4.add(drive2);
		
		JLabel drive3 = new JLabel("");
		drive3.setBounds(688, 514, 77, 29);
		event4.add(drive3);
		
		JLabel drive4 = new JLabel("");
		drive4.setBounds(804, 510, 76, 28);
		event4.add(drive4);
		
		JLabel driveBg = new JLabel("");
		driveBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\drive.png"));
		driveBg.setBounds(640, 422, 297, 127);
		event4.add(driveBg);
		
		JLabel nextBtn4 = new JLabel("");
		nextBtn4.setBounds(951, 551, 46, 42);
		event4.add(nextBtn4);
		
		JLabel bg4 = new JLabel("");
		bg4.setBounds(0, 0, 1493, 700);
		bg4.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\event4.png"));
		event4.add(bg4);
		
		JPanel event3 = new JPanel();
		event3.setBounds(0, 0, 1493, 700);
		contentPane.add(event3);
		event3.setLayout(null);
		
		JLabel destroyBoat = new JLabel("");
		destroyBoat.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\boat1Name.PNG"));
		destroyBoat.setBounds(687, 458, 200, 50);
		event3.add(destroyBoat);
		
		JLabel nextBtn3 = new JLabel("");
		nextBtn3.setBounds(951, 551, 46, 42);
		event3.add(nextBtn3);
		
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
