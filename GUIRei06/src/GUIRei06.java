import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GUIRei06 {

	private JFrame frmh;
	private JLabel IdLabel;
	private JTextField IdTextField;
	private JPasswordField PassPasswordField;
	private JLabel PassLabel;
	private JButton DispButtom;
	private JButton EndButtom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei06 window = new GUIRei06();
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
	public GUIRei06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmh = new JFrame();
		frmh.getContentPane().setSize(new Dimension(300, 200));
		frmh.setPreferredSize(new Dimension(300, 100));
		frmh.setTitle("0H01007 \u52A0\u8CC0\u5C4B\u3000\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB");
		frmh.setBounds(100, 100, 326, 145);
		frmh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmh.getContentPane().setLayout(new GridLayout(3, 2, 0, 5));
		
		IdLabel = new JLabel("\u30E6\u30FC\u30B6\u30FC\uFF29\uFF24");
		frmh.getContentPane().add(IdLabel);
		
		IdTextField = new JTextField();
		frmh.getContentPane().add(IdTextField);
		IdTextField.setColumns(10);
		
		PassLabel = new JLabel("\u30D1\u30B9\u30EF\u30FC\u30C9");
		frmh.getContentPane().add(PassLabel);
		
		PassPasswordField = new JPasswordField();
		frmh.getContentPane().add(PassPasswordField);
		
		DispButtom = new JButton("\u5224\u5B9A");
		DispButtom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =IdTextField.getText();
				@SuppressWarnings("deprecation")
				String pass= PassPasswordField.getText();
				if(id.equals("john")&& pass.equals("123456")) {
					JOptionPane.showMessageDialog(null, "正しいユーザーＩＤとパスワードです！", "判定結果", JOptionPane.OK_OPTION);
				} else {
					JOptionPane.showMessageDialog(null,"ユーザーＩＤかパスワードが間違いています", "判定結果",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		frmh.getContentPane().add(DispButtom);
		
		EndButtom = new JButton("\u7D42\u4E86");
		EndButtom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frmh.getContentPane().add(EndButtom);
	}

}
