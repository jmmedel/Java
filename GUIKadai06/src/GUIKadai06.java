import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIKadai06 extends JFrame {

	private JPanel contentPane;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JRadioButton radioButton3;
	private JRadioButton radioButton4;
	private JRadioButton radioButton5;
	private JLabel DispLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKadai06 frame = new GUIKadai06();
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
	public GUIKadai06() {
		setTitle("0H01007 \u52A0\u8CC0\u5C4B\u3000\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB(\u8272\u6587\u5B57\u8868\u793A\uFF09");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DispLabel = new JLabel("\u3053\u3053\u306B\u6587\u5B57\u3092\u8868\u793A\u3057\u307E\u3059");
		DispLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 16));
		DispLabel.setBounds(12, 25, 167, 136);
		contentPane.add(DispLabel);
		
		radioButton1 = new JRadioButton("\u8D64\u5B57");
		radioButton1.setBounds(261, 21, 113, 21);
		contentPane.add(radioButton1);
		
		radioButton2 = new JRadioButton("\u9EC4\u8272");
		radioButton2.setBounds(261, 44, 113, 21);
		contentPane.add(radioButton2);
		
		radioButton3 = new JRadioButton("\u7DD1\u8272");
		radioButton3.setBounds(261, 67, 113, 21);
		contentPane.add(radioButton3);
		
		radioButton4 = new JRadioButton("\u7D2B\u8272");
		radioButton4.setBounds(261, 90, 113, 21);
		contentPane.add(radioButton4);
		
		radioButton5 = new JRadioButton("\u9ED2\u8272");
		radioButton5.setBounds(261, 113, 113, 21);
		contentPane.add(radioButton5);
		
		JButton btnNewButton = new JButton("\u9078\u629E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = "<html>";
				if(radioButton1.isSelected()) {
					s+= "赤色が選択しました　<br>";
					DispLabel.setText(s);
				}if(radioButton2.isSelected()) {
					s+= "黄色が選択しました <br>";
					DispLabel.setText(s);
				}if(radioButton3.isSelected()) {
					s+= "緑色が選択しました <br>";
					DispLabel.setText(s);
				}if(radioButton4.isSelected()) {
					s+= "紫色が選択しました <br>";
					DispLabel.setText(s);
				}if(radioButton5.isSelected()) {
					s+= "黒色が選択しました <br>";
					DispLabel.setText(s);
				}
				
			}
		});
		btnNewButton.setBounds(243, 140, 91, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7D42\u4E86");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(243, 171, 91, 21);
		contentPane.add(btnNewButton_1);
	}
}
