import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GUIRei11 {

	private JFrame frmh;
	private ImageIcon img=new ImageIcon("C:\\Users\\kagaya john\\Desktop\\Git_Java\\GUIRei11\\src\\yuru05.jpg");
	private JLabel DispLabel;
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
		frmh.setBounds(100, 100, 393, 242);
		frmh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmh.getContentPane().setLayout(null);
		DispLabel = new JLabel(img);
		DispLabel.setBounds(50,25,151,115);
		frmh.getContentPane().add(DispLabel);
		
		JLabel lblNewLabel = new JLabel("\u30E6\u30FC\u30B9\u30B1\u30FC\u30B9\u56F3\u306E\u30A2\u30AF\u30BF\u30FC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel.setBounds(221, 63, 126, 13);
		frmh.getContentPane().add(lblNewLabel);
		
	}

}
