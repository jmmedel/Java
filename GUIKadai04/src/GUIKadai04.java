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
	private JCheckBox checkbox1;
	private JCheckBox checkbox2;
	private JCheckBox checkbox3;
	private JCheckBox checkbox4;
	private JCheckBox checkbox5;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel DispLabel;

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
		setBounds(100, 100, 528, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		DispLabel = new JLabel("\u82F1\u8A9E\u306E\u5358\u8A9E\u3092\u8868\u793A\u3057\u307E\u3059");
		DispLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 14));
		DispLabel.setBounds(5, 10, 342, 202);
		contentPane.add(DispLabel);
		
		
		checkbox1 = new JCheckBox("\uFF11");
		checkbox1.setBounds(5, 235, 47, 21);
		contentPane.add(checkbox1);
		
		
		checkbox2 = new JCheckBox("\uFF12");
		checkbox2.setBounds(56, 235, 47, 21);
		contentPane.add(checkbox2);
		
		
		checkbox3 = new JCheckBox("\uFF13");
		checkbox3.setBounds(96, 235, 47, 21);
		contentPane.add(checkbox3);
		
		
		checkbox4 = new JCheckBox("\uFF14");
		checkbox4.setBounds(136, 235, 47, 21);
		contentPane.add(checkbox4);
		
		
		checkbox5 = new JCheckBox("\uFF15");
		checkbox5.setBounds(184, 235, 47, 21);
		contentPane.add(checkbox5);
		
		
		btnNewButton_2 = new JButton("\u8868\u793A");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String allnumber = "<html> ";
				if(checkbox1.isSelected()) {
					allnumber += "âpåÍÇ≈ÇÕONEÇ≈Ç∑ÅB<br>";
				 DispLabel.setText(allnumber);
				}if(checkbox2.isSelected()) {
					allnumber += "âpåÍÇ≈ÇÕTWOÇ≈Ç∑ÅB<br>";
					DispLabel.setText(allnumber);
				} if(checkbox3.isSelected()) {
					allnumber += "âpåÍÇ≈ÇÕTHREEÇ≈Ç∑ÅB<br>";
					DispLabel.setText(allnumber);
				} if(checkbox4.isSelected()) {
					allnumber += "âpåÍÇ≈ÇÕFOURÇ≈Ç∑ÅB<br>";
					DispLabel.setText(allnumber);
				} if(checkbox5.isSelected()) {
					allnumber += "âpåÍÇ≈ÇÕFIVEÇ≈Ç∑ÅB<br>";
					DispLabel.setText(allnumber);
				}
				
			}
		});
		btnNewButton_2.setBounds(254, 227, 104, 37);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("\u7D42\u4E86");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(370, 227, 91, 37);
		contentPane.add(btnNewButton_3);
	}
}
