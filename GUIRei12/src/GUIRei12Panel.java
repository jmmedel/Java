import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;


public class GUIRei12Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Image Img=null;
	public void setImage(Image img) {
		Img = img;
	}
	
	public void paintComponent(Graphics g) {
		if(Img!=null) {
			g.drawImage(Img,0,0,this.getWidth(),this.getHeight(),this);
		}
		
	}
	
}
