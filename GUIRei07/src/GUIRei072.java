import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalityType;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIRei072 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTextField DlgTextField;
	private JButton okButton;
	private JButton cancelButton;
	private JLabel DlgLabel;
	public boolean Okflag=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIRei072 dialog = new GUIRei072();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIRei072() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 245, 154);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			DlgLabel = new JLabel("\u5909\u4F7F\u3057\u3066\u304F\u3060\u3055\u3044");
			DlgLabel.setBounds(12, 23, 70, 26);
			contentPanel.add(DlgLabel);
		}
		{
			DlgTextField = new JTextField();
			DlgTextField.setBounds(12, 59, 188, 19);
			contentPanel.add(DlgTextField);
			DlgTextField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Okflag=true;
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Okflag=false;
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
