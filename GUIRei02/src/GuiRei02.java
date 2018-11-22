import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiRei02 {

	private JFrame frmh;
	private JButton btnNewButton;
	private JLabel DisLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiRei02 window = new GuiRei02();
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
	public GuiRei02() {
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
		
		btnNewButton = new JButton("\u81EA\u5DF1\u7D39\u4ECB\u3057\u307E\u3059");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisLabel.setText("2年の神戸電子です。");
			}
		});
		frmh.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		DisLabel = new JLabel("\u3053\u3053\u3067\u81EA\u5DF1\u7D39\u4ECB\u3092\u8868\u793A\u3055\u308C\u307E\u3059");
		frmh.getContentPane().add(DisLabel, BorderLayout.WEST);
	}

}
