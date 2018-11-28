import java.awt.EventQueue;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.FileOutputStream;
import java.util.Properties;
import  java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIRei10 {

	private JFrame frmh;
	private JLabel DispLabel;
	private final Properties Prop = new Properties();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei10 window = new GUIRei10();
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
	public GUIRei10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmh = new JFrame();
		frmh.addComponentListener(new ComponentAdapter() {
			
			@Override
			public void componentMoved(ComponentEvent arg0) {
				DispLabel.setText(String.format("横位置：%d　,　縦位置:%d ,　幅:%d　,高さ:%d　,",frmh.getLocation().x,frmh.getLocation().y,frmh.getSize().width,frmh.getSize().height ));
			}
			@Override
			public void componentResized(ComponentEvent e) {
				DispLabel.setText(String.format("横位置：%d　,　縦位置:%d ,　幅:%d　,高さ:%d　,",frmh.getLocation().x,frmh.getLocation().y,frmh.getSize().width,frmh.getSize().height ));
			}
		});
		frmh.setTitle("0H01007 \u52A0\u8CC0\u5C4B\u30B8\u30E3\u30F3\u30E1\u30C7\u30EB");
		frmh.setBounds(100, 100, 342, 228);
		frmh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton EndButton = new JButton("\u7D42\u4E86");
		EndButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prop.setProperty("x", String.valueOf(frmh.getLocation().x));
				Prop.setProperty("x", String.valueOf(frmh.getLocation().y));
				Prop.setProperty("x", String.valueOf(frmh.getSize().width));
				Prop.setProperty("x", String.valueOf(frmh.getSize().height));
				FileOutputStream fos=null;
				try {
					fos = new FileOutputStream("GUIRei10.properties");
					Prop.store(fos, null);
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}finally {
					
					try {
						
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
			}
		});
		frmh.getContentPane().add(EndButton, BorderLayout.SOUTH);
		
		DispLabel = new JLabel("\u6A2A\u4F4D\u7F6E\uFF1A\uFF0A\uFF0A\uFF0A\u3001\u7E26\u4F4D\u7F6E\uFF1A\uFF0A\uFF0A\uFF0A\u3001\u5E45\uFF1A\uFF0A\uFF0A\uFF0A\u3001\u9AD8\u3055\uFF1A\uFF0A\uFF0A\uFF0A");
		frmh.getContentPane().add(DispLabel, BorderLayout.CENTER);
	}

}
