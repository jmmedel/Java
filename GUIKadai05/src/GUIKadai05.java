import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIKadai05 extends JFrame {

	private JPanel contentPane;
	private JCheckBox checkbox5;
	private JLabel DispLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKadai05 frame = new GUIKadai05();
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
	public GUIKadai05() {
		setTitle("0H01007\u3000\u52A0\u8CC0\u5C4B\u3000\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB(\u9078\u629E\u79D1\u76EE\u8868\u793A)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DispLabel = new JLabel("\u3053\u3053\u306B\u9078\u629E\u3057\u305F\u79D1\u76EE\u3092\u8868\u793A\u3057\u307E\u3059");
		DispLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 13));
		DispLabel.setBounds(0, 47, 198, 63);
		contentPane.add(DispLabel);
		
		JCheckBox checkbox1 = new JCheckBox("\uFF23\u8A00\u8A9E\u8CC7\u683C\u5BFE\u7B56");
		checkbox1.setBounds(184, 47, 117, 21);
		contentPane.add(checkbox1);
		
		JCheckBox checkbox2 = new JCheckBox("ORACLE");
		checkbox2.setBounds(184, 66, 125, 21);
		contentPane.add(checkbox2);
		
		JCheckBox checkbox3 = new JCheckBox("VB");
		checkbox3.setBounds(184, 89, 125, 21);
		contentPane.add(checkbox3);
		
		JCheckBox checkbox4 = new JCheckBox("\u60C5\u5831\u30EA\u30C6\u30E9\u30B7\u30FC\u5FDC\u7528");
		checkbox4.setBounds(184, 112, 125, 21);
		contentPane.add(checkbox4);
		
		JButton btnNewButton = new JButton("\u9078\u629E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s = "<html> 選択した科目は　<br>";
				if(checkbox1.isSelected()) {
					s+= "C言語資格対策　<br>";
					DispLabel.setText(s);
				}if(checkbox2.isSelected()) {
					s+= "ORACLE　<br>";
					DispLabel.setText(s);
				}if(checkbox3.isSelected()) {
					s+= "VB　<br>";
					DispLabel.setText(s);
				}if(checkbox4.isSelected()) {
					s+= "情報リテラシー応用　<br>";
					DispLabel.setText(s);
				}if(checkbox5.isSelected()) {
					s+= "国家試験資格対策　<br>";
					DispLabel.setText(s);
				}
				
			}
		});
		btnNewButton.setBounds(184, 161, 91, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7D42\u4E86");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(184, 192, 91, 21);
		contentPane.add(btnNewButton_1);
		
		checkbox5 = new JCheckBox("\u56FD\u5BB6\u8A66\u9A13\u8CC7\u683C\u5BFE\u7B56");
		checkbox5.setBounds(184, 135, 145, 21);
		contentPane.add(checkbox5);
	}
}
