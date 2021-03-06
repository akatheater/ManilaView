package viewTry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class StartView extends JFrame {

	private JPanel contentPane;
	private static ElectView ev;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartView frame = new StartView();
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
	public StartView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1498, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel startBtn = new JLabel("");
		startBtn.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\startBtn.png"));
		startBtn.setBounds(590, 415, 244, 76);
		startBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				ev=new ElectView();
				ev.setVisible(true);				
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
		contentPane.add(startBtn);
		
		JLabel exitBtn = new JLabel("");
		exitBtn.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\exitBtn.png"));
		exitBtn.setBounds(893, 434, 233, 57);
		contentPane.add(exitBtn);
		
		JLabel bgLabel = new JLabel("");
		bgLabel.setBounds(0, 0, 1493, 700);
		bgLabel.setIcon(new ImageIcon("D:\\eclipse\\eclipse-workspace\\ManilaView\\images\\startBg.png"));
		contentPane.add(bgLabel);
	}
}
