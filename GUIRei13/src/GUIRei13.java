import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GUIRei13 extends GUIRei13Panel {

	private JFrame frame;
	private GUIRei13Panel contentPane;
	
	private Random Rnd = new Random();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRei13 window = new GUIRei13();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIRei13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		contentPane = new GUIRei13Panel();
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int x=arg0.getX();
				int y=arg0.getY();
				int r=Rnd.nextInt(100)+1;
				int cr=Rnd.nextInt(255);
				int cg=Rnd.nextInt(255);
				int cb=Rnd.nextInt(255);
				GUIRei13CircleData d = new GUIRei13CircleData(x,7,r,cr,cg,cb);
				contentPane.setCircleData(d);
				contentPane.repaint();
				frame.add(contentPane);
				
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
