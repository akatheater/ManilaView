package viewTry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
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
	public MainView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1498, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel sitPn = new JPanel();
		sitPn.setBounds(542, 166, 507, 359);
		contentPane.add(sitPn);
		sitPn.setLayout(null);
		
		JLabel close = new JLabel("");
		close.setBounds(458, 11, 41, 38);
		sitPn.add(close);
		
		JLabel placeName = new JLabel("");
		placeName.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\placeName0.PNG"));
		placeName.setBounds(199, 40, 81, 44);
		sitPn.add(placeName);
		
		JLabel sitPlace1 = new JLabel("");
		sitPlace1.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\sitPlace1.png"));
		sitPlace1.setBounds(37, 88, 409, 68);
		sitPn.add(sitPlace1);
		
		JLabel sitPlace2 = new JLabel("");
		sitPlace2.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\sitPlace2.png"));
		sitPlace2.setBounds(37, 137, 409, 68);
		sitPn.add(sitPlace2);
		
		JLabel sitPlace3 = new JLabel("");
		sitPlace3.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\sitPlace3.png"));
		sitPlace3.setBounds(37, 186, 409, 68);
		sitPn.add(sitPlace3);
		
		JLabel sitPlace4 = new JLabel("");
		sitPlace4.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\sitPlace4.png"));
		sitPlace4.setBounds(37, 235, 409, 68);
		sitPn.add(sitPlace4);
		
		JLabel sitPar1 = new JLabel("");
		sitPar1.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Par.PNG"));
		sitPar1.setBounds(271, 99, 200, 50);
		sitPn.add(sitPar1);
		
		JLabel sitPar2 = new JLabel("");
		sitPar2.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player2Par.PNG"));
		sitPar2.setBounds(271, 150, 200, 50);
		sitPn.add(sitPar2);
		
		JLabel sitPar3 = new JLabel("");
		sitPar3.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player3Par.PNG"));
		sitPar3.setBounds(271, 196, 200, 50);
		sitPn.add(sitPar3);
		
		JLabel sitPar4 = new JLabel("");
		sitPar4.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player4Par.PNG"));
		sitPar4.setBounds(271, 245, 200, 50);
		sitPn.add(sitPar4);
		
		JLabel sitBg = new JLabel("");
		sitBg.setBounds(0, 11, 499, 348);
		sitBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\sitBg.png"));
		sitPn.add(sitBg);
		
		JLabel sitPnBg = new JLabel("");
		sitPnBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\sitJpBg.png"));
		sitPnBg.setBounds(0, 0, 512, 359);
		sitPn.add(sitPnBg);
		
		JLabel partBtn = new JLabel("");
		partBtn.setBounds(1335, 325, 116, 45);
		contentPane.add(partBtn);
		
		JLabel moneyBtn = new JLabel("");
		moneyBtn.setBounds(1335, 394, 116, 45);
		contentPane.add(moneyBtn);
		
		JLabel dialogBtn = new JLabel("");
		dialogBtn.setBounds(1337, 464, 114, 45);
		contentPane.add(dialogBtn);
		
		JLabel darkBtn = new JLabel("");
		darkBtn.setBounds(1335, 535, 116, 45);
		contentPane.add(darkBtn);
		
		JLabel playerIco = new JLabel("");
		playerIco.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Ico2.png"));
		playerIco.setBounds(1335, 72, 116, 116);
		contentPane.add(playerIco);
		
		JLabel playerName = new JLabel("");
		playerName.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\palyer1Name2.PNG"));
		playerName.setBounds(1348, 269, 93, 28);
		contentPane.add(playerName);
		
		JLabel boat1 = new JLabel("");
		boat1.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\boat1.png"));
		boat1.setBounds(1176, 150, 69, 71);
		contentPane.add(boat1);
		
		JLabel boat2 = new JLabel("");
		boat2.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\boat2.png"));
		boat2.setBounds(1187, 274, 65, 71);
		contentPane.add(boat2);
		
		JLabel boat3 = new JLabel("");
		boat3.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\boat3.png"));
		boat3.setBounds(1139, 425, 62, 65);
		contentPane.add(boat3);
		
		JLabel mainBg = new JLabel("");
		mainBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\mainBg.png"));
		mainBg.setBounds(0, 0, 1493, 700);
		contentPane.add(mainBg);
	}
}
