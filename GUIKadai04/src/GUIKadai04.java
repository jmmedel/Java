import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIKadai04 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKadai04 frame = new GUIKadai04();
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
	public GUIKadai04() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 22, 50, 13);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u8868\u793A");
		btnNewButton.setBounds(261, 230, 91, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(343, 230, 91, 21);
		getContentPane().add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(8, 105, 103, 21);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(8, 128, 103, 21);
		getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(8, 151, 103, 21);
		getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_3.setBounds(8, 174, 103, 21);
		getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		chckbxNewCheckBox_4.setBounds(8, 193, 103, 21);
		getContentPane().add(chckbxNewCheckBox_4);
		setTitle("0H01007 \u52A0\u8CC0\u5C4B\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB\u3000(\u6570\u82F1\u5358\u8A9E\u8868\u793A)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u82F1\u8A9E\u306E\u5358\u8A9E\u3092\u8868\u793A\u3057\u307E\u3059");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 14));
		lblNewLabel.setBounds(5, 10, 424, 49);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uFF11");
		chckbxNewCheckBox.setBounds(5, 235, 37, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("\uFF12");
		chckbxNewCheckBox_1.setBounds(46, 235, 36, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("\uFF13");
		chckbxNewCheckBox_2.setBounds(86, 235, 36, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("\uFF14");
		chckbxNewCheckBox_3.setBounds(126, 235, 44, 21);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("\uFF15");
		chckbxNewCheckBox_4.setBounds(165, 235, 37, 21);
		contentPane.add(chckbxNewCheckBox_4);
		
		JButton btnNewButton = new JButton("\u8868\u793A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if()
			}
		});
		btnNewButton.setBounds(243, 219, 104, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7D42\u4E86");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(343, 219, 91, 37);
		contentPane.add(btnNewButton_1);
	}
}
