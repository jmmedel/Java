import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class GUIRei13Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	private ArrayList<GUIRei13CircleData> CircleData = new ArrayList<GUIRei13CircleData>();
	
	
	public void setCircleData(GUIRei13CircleData d ) {
		CircleData.add(d);
	}
	
	public void paintComponet(Graphics g) {
		super.paintComponents(g);
		
		for(GUIRei13CircleData d:CircleData) {
			
			Color c= new Color(d.getColorR(),d.getColorG(),d.getColorB());
			g.setColor(c);
			int r=d.getR();
			g.drawOval(d.getX()-r/2, d.getY()-r/2, r, r);
		}
		
	}

	public void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
	
}
