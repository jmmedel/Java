import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIRei03 {

	private JFrame frmh;
	private JButton BlueButton;
	private JButton RedButton;
	private JButton Greenbutton;
	private JButton EndButton;
	private JLabel DisLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei03 window = new GUIRei03();
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
	public GUIRei03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmh = new JFrame();
		frmh.setTitle("0H01007 \u52A0\u8CC0\u5C4B\u3000\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB");
		frmh.setBounds(100, 100, 450, 300);
		frmh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BlueButton = new JButton("\u9752");
		BlueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisLabel.setForeground(Color.blue);
				DisLabel.setText("青色が選択しました");
			}
		});
		BlueButton.setForeground(Color.YELLOW);
		BlueButton.setBackground(Color.BLUE);
		frmh.getContentPane().add(BlueButton, BorderLayout.WEST);
		
		Greenbutton = new JButton("\u7DD1");
		Greenbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisLabel.setForeground(Color.green);
				DisLabel.setText("緑色が選択しました");
			}
		});
		Greenbutton.setForeground(Color.YELLOW);
		Greenbutton.setBackground(Color.GREEN);
		frmh.getContentPane().add(Greenbutton, BorderLayout.NORTH);
		
		EndButton = new JButton("\u7D42\u4E86");
		EndButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		EndButton.setForeground(Color.YELLOW);
		EndButton.setBackground(Color.BLACK);
		frmh.getContentPane().add(EndButton, BorderLayout.SOUTH);
		
		RedButton = new JButton("\u8D64");
		RedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisLabel.setForeground(Color.red);
				DisLabel.setText("赤色が選択しました");
			}
		});
		RedButton.setForeground(Color.YELLOW);
		RedButton.setBackground(Color.RED);
		frmh.getContentPane().add(RedButton, BorderLayout.EAST);
		
		DisLabel = new JLabel("\u3053\u3053\u306B\u6A19\u793A");
		DisLabel.setLabelFor(DisLabel);
		DisLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmh.getContentPane().add(DisLabel, BorderLayout.CENTER);
	}

}
