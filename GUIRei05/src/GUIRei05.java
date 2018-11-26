import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class GUIRei05 {

	private JFrame frmh;
	private JRadioButton ARadioButton;
	private JRadioButton BRadioButton;
	private JRadioButton ORadioButton;
	private JRadioButton ABRadioButton;
	private JLabel DispLabel;
	private JButton ReadButton;
	private JButton EndButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei05 window = new GUIRei05();
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
	public GUIRei05() {
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
		
		JPanel BloodPanel = new JPanel();
		BloodPanel.setBorder(new TitledBorder(null, "\u8840\u6DB2\u578B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frmh.getContentPane().add(BloodPanel, BorderLayout.NORTH);
		BloodPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		ARadioButton = new JRadioButton("A\u578B");
		ARadioButton.setSelected(true);
		BloodPanel.add(ARadioButton);
		
		ORadioButton = new JRadioButton("O\u578B");
		BloodPanel.add(ORadioButton);
		
		ABRadioButton = new JRadioButton("AB\u578B");
		BloodPanel.add(ABRadioButton);
		
		BRadioButton = new JRadioButton("B\u578B");
		BloodPanel.add(BRadioButton);
		
		JPanel ButtonPanel = new JPanel();
		frmh.getContentPane().add(ButtonPanel, BorderLayout.SOUTH);
		ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.X_AXIS));
		
		ReadButton = new JButton("\u5360\u3044");
		ReadButton.setToolTipText("\u30AF\u30EA\u30C3\u30AF\u3059\u308B\u3068\u5360\u3044");
		ButtonPanel.add(ReadButton);
		
		EndButton = new JButton("\u7D42\u4E86");
		EndButton.setToolTipText("\u30AF\u30EA\u30C3\u30AF\u3059\u308B\u3068\u7D42\u4E86\u3057\u307E\u3059");
		ButtonPanel.add(EndButton);
		
		DispLabel = new JLabel("\u3053\u3053\u306B\u5360\u3044\u7D50\u679C\u3092\u8868\u793A\u3057\u307E\u3059");
		DispLabel.setOpaque(true);
		DispLabel.setBackground(Color.YELLOW);
		frmh.getContentPane().add(DispLabel, BorderLayout.WEST);
	}

}
