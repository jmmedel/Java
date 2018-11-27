import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUIRei07 {

	private JFrame frmh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei07 window = new GUIRei07();
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
	public GUIRei07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmh = new JFrame();
		frmh.setTitle("0H01007 \u52A0\u8CC0\u5C4B\u3000\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB");
		frmh.setBounds(100, 100, 253, 154);
		frmh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmh.getContentPane().setLayout(null);
		
		JLabel DispLabel = new JLabel("\uFF21\uFF22\uFF23");
		DispLabel.setBounds(22, 27, 76, 27);
		frmh.getContentPane().add(DispLabel);
		
		JButton ChangeButton = new JButton("\u5909\u4F7F");
		ChangeButton.setBounds(22, 64, 91, 21);
		frmh.getContentPane().add(ChangeButton);
		
		JButton EndButton = new JButton("\u7D42\u4E86");
		EndButton.setBounds(134, 64, 91, 21);
		frmh.getContentPane().add(EndButton);
	}
}
