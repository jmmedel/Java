import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import java.awt.Font;

public class GUIRei09 implements ActionListener {

	private JFrame frmh;
	private JButton TimerButton;
	private JButton EndButton;
	private JLabel DispLabel;
	private Timer ReiTimer = null;
	private boolean timerFlag=false;
	private int NowTime=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei09 window = new GUIRei09();
					window.frmh.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIRei09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmh = new JFrame();
		frmh.setTitle("0H01007 \u52A0\u8CC0\u5C4B\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB");
		frmh.setBounds(100, 100, 286, 189);
		frmh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmh.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 113, 258, 37);
		frmh.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		TimerButton = new JButton("\u958B\u59CB");
		TimerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(timerFlag) {
					ReiTimer.stop();
					timerFlag=false;
					TimerButton.setText("開始");
					TimerButton.setToolTipText("タイマーをスタートします");
				}else {
					NowTime=0;
					DispLabel.setText("00:00");
					timerFlag=true;
					TimerButton.setText("停止");
					TimerButton.setToolTipText("タイマーをストップします");
					ReiTimer.start();
				}
			}
		});
		TimerButton.setToolTipText("\u30BF\u30A4\u30DE\u30FC\u3092\u30B9\u30BF\u30FC\u30C8\u3057\u307E\u3059");
		panel.add(TimerButton);
		
		EndButton = new JButton("\u7D42\u4E86");
		EndButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		EndButton.setToolTipText("\u7D42\u4E86\u3057\u307E\u3059");
		panel.add(EndButton);
		
		DispLabel = new JLabel("00:00");
		DispLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 20));
		DispLabel.setBounds(105, 49, 66, 37);
		frmh.getContentPane().add(DispLabel);
		ReiTimer=new Timer(1000,this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		NowTime++;
		DispLabel.setText(String.format("%02d:%02d ",NowTime/60,NowTime%60));
		
	}

}
