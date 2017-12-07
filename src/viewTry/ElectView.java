package viewTry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JComboBox;

public class ElectView extends JFrame {

	private JPanel mainJp;
	private JTextField electMoney;
	private static BossView bv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElectView frame = new ElectView();
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
	public ElectView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1498, 740);
		mainJp = new JPanel();
		mainJp.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(mainJp);
		mainJp.setLayout(null);
		
		JPanel resultPn = new JPanel();
		resultPn.setBorder(new EmptyBorder(0, 0, 0, 0));
		resultPn.setBounds(514, 0, 479, 700);
		mainJp.add(resultPn);
		resultPn.setLayout(null);
		/*竞价结束后，此弹窗可见*/
		//resultPn.setVisible(false);
		
		JLabel nextPage = new JLabel("");
		nextPage.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\next2.png"));
		nextPage.setBounds(416, 450, 48, 54);
		resultPn.add(nextPage);
		nextPage.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				bv=new BossView();
				bv.setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		JLabel boss = new JLabel("");
		boss.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Ico1.png"));
		boss.setBounds(130, 141, 204, 150);
		resultPn.add(boss);
		
		JLabel bossLb = new JLabel("");
		bossLb.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Name.PNG"));
		bossLb.setBounds(96, 303, 80, 50);
		resultPn.add(bossLb);
		
		JComboBox bossBuyCombo = new JComboBox();
		bossBuyCombo.setBackground(SystemColor.info);
		bossBuyCombo.setBounds(180, 406, 106, 27);
		bossBuyCombo.addItem("不购买");
		bossBuyCombo.addItem("买肉豆蔻");
		bossBuyCombo.addItem("买丝绸");
		bossBuyCombo.addItem("买玉");
		bossBuyCombo.addItem("买人参");
		resultPn.add(bossBuyCombo);
		
		
		JLabel resultBg = new JLabel("");
		resultBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\resultPn.png"));
		resultBg.setBounds(19, 0, 445, 521);
		resultPn.add(resultBg);
		
		JLabel resultPnBg = new JLabel("");
		resultPnBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\rerultJpBg.png"));
		resultPnBg.setBounds(0, 0, 479, 700);
		resultPn.add(resultPnBg);
		/*点击竞价按钮后，此弹窗可见*/
		/*如果金额不够，此标签可见*/
		
		JPanel electPn = new JPanel();
		electPn.setBounds(514, 119, 480, 314);
		mainJp.add(electPn);
		electPn.setLayout(null);
		electPn.setVisible(false);
		
		JLabel closeBtn = new JLabel("");
		closeBtn.setBounds(435, 0, 45, 45);
		closeBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				electPn.setVisible(false);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		electPn.add(closeBtn);
		
		JLabel electOk = new JLabel("");
		electOk.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\nextBtn1.png"));
		electOk.setBounds(327, 220, 24, 24);
		electPn.add(electOk);
		
		electMoney = new JTextField();
		electMoney.setBounds(179, 217, 127, 27);
		electPn.add(electMoney);
		electMoney.setColumns(10);
		
		JLabel poorLb = new JLabel("");
		poorLb.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\poorLb.png"));
		poorLb.setBounds(212, 265, 81, 21);
		electPn.add(poorLb);
		//poorLb.setVisible(false);
		
		JLabel electBg = new JLabel("");
		electBg.setBounds(15, 0, 473, 323);
		electBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\electPn.png"));
		electPn.add(electBg);
		
		JLabel electPnBg = new JLabel("");
		electPnBg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\electJpBg.png"));
		electPnBg.setBounds(0, 0, 480, 314);
		electPn.add(electPnBg);
		
		JLabel player1 = new JLabel("");
		player1.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player1Ico0.png"));
		player1.setBounds(295, 96, 204, 249);
		mainJp.add(player1);
		
		JLabel player2 = new JLabel("");
		player2.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player2Ico0.png"));
		player2.setBounds(1012, 96, 204, 249);
		mainJp.add(player2);
		
		JLabel player3 = new JLabel("");
		player3.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player3Ico0.png"));
		player3.setBounds(295, 347, 204, 249);
		mainJp.add(player3);
		
		JLabel player4 = new JLabel("");
		player4.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\player4Ico0.png"));
		player4.setBounds(1012, 347, 204, 249);
		mainJp.add(player4);
		
		JLabel electBtn = new JLabel("");
		electBtn.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\electBtn.png"));
		electBtn.setBounds(559, 347, 152, 77);
		electBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				electPn.setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		mainJp.add(electBtn);
		
		JLabel abandonBtn = new JLabel("");
		abandonBtn.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\abandonBtn.png"));
		abandonBtn.setBounds(776, 347, 152, 77);
		mainJp.add(abandonBtn);
		
		JLabel bgLb = new JLabel("");
		bgLb.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\electBg.png"));
		bgLb.setBounds(0, 0, 1493, 700);
		mainJp.add(bgLb);
		
		JLabel electbg = new JLabel("");
		electbg.setBounds(87, 261, 473, 323);
		mainJp.add(electbg);
		electbg.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\electPn.png"));
	}
}
