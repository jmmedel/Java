
import java.util.*;
public class JavaKadai093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Data1;
		double Data2;
		double Ans;
		Scanner stdin = new Scanner(System.in);
		System.out.printf("1個目のデーターー＞");
		Data1 = stdin.nextDouble();
		System.out.println("2個目のデーターー＞");
		Data2 = stdin.nextDouble();
		 Ans = getArea(Data1);
		System.out.printf("1辺%fの正方形の面積%fです\n", Data1,Ans);
		Ans = getArea(Data1,Data2);
		System.out.printf("幅高さ%f,%fの長方形の面積は%fです\n", Data1,Data2,Ans);
		
	}

	private static double getArea(double data1, double data2) {
		// TODO Auto-generated method stub
		double ans = data1 * data2;
		
		return ans;
	}

	private static double getArea(double data1) {
		// TODO Auto-generated method stub
		double ans = data1*data1;
		
		return ans;
	}

}
