import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUIKadai03 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKadai03 frame = new GUIKadai03();
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
	public GUIKadai03() {
		setTitle("0H01007 \u52A0\u8CC0\u5C4B\u3000\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btnNewButton = new JButton("\u30D7\u30ED\u30B0\u30E9\u30E0\u306E\u7D42\u4E86");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		btnNewButton_1 = new JButton("\u8D64\u8272");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("RED");
				lblNewLabel.setForeground(Color.RED);
			}
		});
		contentPane.add(btnNewButton_1, BorderLayout.WEST);
		
		btnNewButton_2 = new JButton("\u9752\u8272");
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("BLUE");
				lblNewLabel.setForeground(Color.BLUE);
				
			}
		});
		contentPane.add(btnNewButton_2, BorderLayout.NORTH);
		
		btnNewButton_3 = new JButton("\u9EC4\u8272");
		btnNewButton_3.setForeground(Color.YELLOW);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("YELLOW");
				lblNewLabel.setForeground(Color.YELLOW);
				
				
			}
		});
		contentPane.add(btnNewButton_3, BorderLayout.EAST);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

}
