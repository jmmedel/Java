import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GUIKadai02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKadai02 frame = new GUIKadai02();
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
	public GUIKadai02() {
		setTitle("0H01007 \u52A0\u8CC0\u5C4B\u3000\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB\uFF08\u5FC5\u8981\u79D1\u76EE\u8868\u793A\uFF09");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\u5FC5\u8981\u79D1\u76EE\u3092\u8868\u793A\u3057\u307E\u3059");
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Linux II");
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("\u30C7\u30FC\u30BF\u30D9\u30FC\u30B9\u6280\u8853");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("JAVA");
		contentPane.add(lblNewLabel_2, BorderLayout.EAST);
		
		JLabel lblNewLabel_3 = new JLabel("\u30AD\u30E3\u30EA\u30A2\u30C7\u30B6\u30A4\u30F3");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3, BorderLayout.SOUTH);
	}

}
