package viewTry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class OverView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OverView frame = new OverView();
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
	public OverView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1498, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*游戏结束的弹窗。默认隐藏。*/
		JPanel endPn = new JPanel();
		endPn.setBounds(515, 0, 479, 700);
		contentPane.add(endPn);
		endPn.setLayout(null);
		endPn.setVisible(false);
		
		/*显示胜利者的头像*/
		JLabel winnerIco = new JLabel("");
		winnerIco.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Ico1.png"));
		winnerIco.setBounds(118, 127, 204, 249);
		endPn.add(winnerIco);
		
		/*显示胜利者的名字*/
		JLabel winnerName = new JLabel("");
		winnerName.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Name.PNG"));
		winnerName.setBounds(244, 388, 80, 50);
		endPn.add(winnerName);
		
		/*结束框的背景*/
		JLabel endBg = new JLabel("");
		endBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\endBg.png"));
		endBg.setBounds(0, 0, 447, 534);
		endPn.add(endBg);
		
		JLabel endPnBg = new JLabel("");
		endPnBg.setBounds(0, 0, 479, 700);
		endPnBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\rerultJpBg.png"));
		endPn.add(endPnBg);
		
		/*下一步按钮。根据情况判断是前往下一个航程还是结束游戏。*/
		JLabel nextBtn = new JLabel("");
		nextBtn.setEnabled(false);
		nextBtn.setBounds(1084, 557, 106, 43);
		contentPane.add(nextBtn);
		
		/*玩家一的利润统计*/
		/*同伙一获得的利润*/
		JLabel player1Part1 = new JLabel("");
		player1Part1.setBounds(409, 289, 81, 21);
		contentPane.add(player1Part1);
		
		/*同伙二获得的利润*/
		JLabel player1Part2 = new JLabel("");
		player1Part2.setBounds(409, 344, 81, 21);
		contentPane.add(player1Part2);
		
		/*同伙三获得的利润*/
		JLabel player1Part3 = new JLabel("");
		player1Part3.setBounds(409, 392, 81, 21);
		contentPane.add(player1Part3);
		
		/*玩家一获得的总利润*/
		JLabel player1Profit = new JLabel("");
		player1Profit.setBounds(409, 438, 81, 21);
		contentPane.add(player1Profit);
		
		/*玩家一当前资产*/
		JLabel player1Mon = new JLabel("");
		player1Mon.setBounds(409, 487, 81, 21);
		contentPane.add(player1Mon);
		
		/*玩家二的利润统计*/
		JLabel player2Part1 = new JLabel("");
		player2Part1.setBounds(631, 292, 81, 21);
		contentPane.add(player2Part1);
		
		JLabel player2Part2 = new JLabel("");
		player2Part2.setBounds(631, 345, 81, 21);
		contentPane.add(player2Part2);
		
		JLabel player2Part3 = new JLabel("");
		player2Part3.setBounds(631, 392, 81, 21);
		contentPane.add(player2Part3);
		
		JLabel player2Profit = new JLabel("");
		player2Profit.setBounds(631, 443, 81, 21);
		contentPane.add(player2Profit);
		
		JLabel player2Mon = new JLabel("");
		player2Mon.setBounds(631, 491, 81, 21);
		contentPane.add(player2Mon);
		
		/*玩家三的利润统计*/
		JLabel player3Part1 = new JLabel("");
		player3Part1.setBounds(859, 297, 81, 21);
		contentPane.add(player3Part1);
		
		JLabel player3Part2 = new JLabel("");
		player3Part2.setBounds(859, 350, 81, 21);
		contentPane.add(player3Part2);
		
		JLabel player3Part3 = new JLabel("");
		player3Part3.setBounds(859, 400, 81, 21);
		contentPane.add(player3Part3);
		
		JLabel player3Profit = new JLabel("");
		player3Profit.setBounds(859, 448, 81, 21);
		contentPane.add(player3Profit);
		
		JLabel player3Mon = new JLabel("");
		player3Mon.setBounds(859, 495, 81, 21);
		contentPane.add(player3Mon);
		
		/*玩家四的利润统计*/
		JLabel player4Part1 = new JLabel("");
		player4Part1.setBounds(1076, 302, 81, 21);
		contentPane.add(player4Part1);
		
		JLabel player4Part2 = new JLabel("");
		player4Part2.setBounds(1076, 350, 81, 21);
		contentPane.add(player4Part2);
		
		JLabel player4Part3 = new JLabel("");
		player4Part3.setBounds(1076, 400, 81, 21);
		contentPane.add(player4Part3);
		
		JLabel player4Profit = new JLabel("");
		player4Profit.setBounds(1076, 450, 81, 21);
		contentPane.add(player4Profit);
		
		JLabel player4Mon = new JLabel("");
		player4Mon.setBounds(1076, 500, 81, 21);
		contentPane.add(player4Mon);
		
		/*背景*/
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\overBg.png"));
		bg.setBounds(0, 0, 1493, 700);
		contentPane.add(bg);
	}

}
