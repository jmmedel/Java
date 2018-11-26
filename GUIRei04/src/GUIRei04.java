import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIRei04 {

	private JFrame frmh;
	private JCheckBox CCheckBox;
	private JCheckBox CaslCheckBox;
	private JCheckBox JavaCheckBox;
	private JCheckBox VBCheckBox;
	private JButton DispButton;
	private JButton EndButton;
	private JLabel DispLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei04 window = new GUIRei04();
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
	public GUIRei04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmh = new JFrame();
		frmh.setTitle("0H01007 \u52A0\u8CC0\u5C4B\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB");
		frmh.setBounds(100, 100, 450, 300);
		frmh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmh.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		CCheckBox = new JCheckBox("C\u8A00\u8A9E");
		panel.add(CCheckBox);
		
		CaslCheckBox = new JCheckBox("\uFF23\uFF21\uFF33\uFF2C");
		panel.add(CaslCheckBox);
		
		JavaCheckBox = new JCheckBox("Java");
		panel.add(JavaCheckBox);
		
		VBCheckBox = new JCheckBox("VB");
		panel.add(VBCheckBox);
		
		DispButton = new JButton("\u8868\u793A");
		DispButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = "<html>“¾ˆÓ‚È‰È–Ú‚Í<br>";
				
				if(CCheckBox.isSelected()) {
					
					s += "C Œ¾Œê<br>";
				}if(CaslCheckBox.isSelected()) {
					
					s += "CASL<br>";
				}if(JavaCheckBox.isSelected()) {
					
					s += "JAVA<br>";
				}if(VBCheckBox.isSelected()) {
					
					s += "VB<br>";
				}
				
				s+="‚Å‚·</html>";
				DispLabel.setText(s);
				
				 
				
				
			}
		});
		panel.add(DispButton);
		
		EndButton = new JButton("\u7D42\u4E86");
		panel.add(EndButton);
		
		DispLabel = new JLabel("\u3053\u3053\u306B\u5F97\u610F\u79D1\u76EE\u3092\u8868\u793A\u3057\u307E\u3059\u3002");
		DispLabel.setVerticalAlignment(SwingConstants.TOP);
		frmh.getContentPane().add(DispLabel, BorderLayout.CENTER);
	}

}
