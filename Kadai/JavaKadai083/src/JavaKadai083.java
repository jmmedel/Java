//done
import java.util.*;
public class JavaKadai083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ay = {42,66,47,28,59,37};
		int[] by;
		for (int i = 0; i < ay.length; i++) {
			System.out.printf("%5d",ay[i]);
		}
			System.out.println();
			by = arrayCopy(ay);
			ay[2] = 600;
			System.out.printf("%n コピー元データ %n");
		for (int i = 0; i < ay.length; i++) {
			System.out.printf("%5d",ay[i]);
		}
		System.out.println();
		System.out.printf("%n コピーしたデータ%n");
		for (int i = 0; i < by.length; i++) {
			System.out.printf("%5d",by[i]);
		}
		
		
		
		
	}
	
	
	public static int[] arrayCopy(int[] data) {
		
		
		return data.clone();
		
	}
	
}
