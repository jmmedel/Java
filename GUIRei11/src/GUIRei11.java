import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIRei11 {

	private JFrame frmh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei11 window = new GUIRei11();
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
	public GUIRei11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmh = new JFrame();
		frmh.setTitle("0H01007 \u52A0\u8CC0\u5C4B\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB");
		frmh.setBounds(100, 100, 296, 207);
		frmh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmh.getContentPane().setLayout(null);
		
		JLabel DispLabel = new JLabel("");
		DispLabel.setBounds(75, 30, 120, 110);
		frmh.getContentPane().add(DispLabel);
	}

}
