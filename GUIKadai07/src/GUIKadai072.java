import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIKadai072 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private GUIKadai07 shimei;
	private GUIKadai072 frames;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKadai072 frames = new GUIKadai072();
					frames.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIKadai072() {
		setTitle("0H01007 \u52A0\u8CC0\u5C4B\u3000\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB\uFF08\u6C0F\u540D\u5165\u529B");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel DispLabel = new JLabel("\u6C0F\u540D\u3092\u5165\u529B\u3057\u3066\u304F\u3060\u3055\u3044");
		DispLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 18));
		DispLabel.setBounds(29, 34, 250, 35);
		contentPane.add(DispLabel);
		
		textField = new JTextField();
		textField.setBounds(39, 79, 217, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u6C0F\u540D\u3092\u66F8\u304D\u8FBC\u3080");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							String s = textField.getText();
							shimei.getName(s);
							frames.setVisible(false);
							shimei = new GUIKadai07();
							shimei.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
				
			}
		});
		btnNewButton.setBounds(168, 123, 122, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							shimei = new GUIKadai07();
							shimei.setVisible(true);
							frames.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
				
			}
		});
		btnNewButton_1.setBounds(316, 123, 91, 21);
		contentPane.add(btnNewButton_1);
	}
}
