
public class JavaKadai121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point = new Point(10,3);
		point.getPoint();
		point.setX(3);
		point.setY(3);
		point.getPoint();
	}

}

class Point {
private int x;
public void setX(int x) {
	this.x += x;
}

public void setY(int y) {
	this.y += y;
}

private int y;
public Point(int x, int y) {
	
	this.x = x;
	this.y = y;
}

public void getPoint() {
	System.out.println( "â° = " + x + " èc = "  + y );
}

}

