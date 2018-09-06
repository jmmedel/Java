import java.util.*;
public class JavaKadai083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ay = {42,66,47,28,59,37};
		int[] by;
		for (int i = 0; i < ay.length; i++) {
			System.out.printf("%5d",ay[i]);
		}
			by = arrayCopy(ay);
			ay[2] = 600;
			System.out.printf("%n コピー元データ ");
		
	}
	
	
	public static int[] arrayCopy(int[] data) {
		
		return data;
		
	}
	
}
