
import java.util.*;
public class JavaKadai093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Data1;
		double Data2;
		double Ans;
		Scanner stdin = new Scanner(System.in);
		System.out.printf("1�ڂ̃f�[�^�[�[��");
		Data1 = stdin.nextDouble();
		System.out.println("2�ڂ̃f�[�^�[�[��");
		Data2 = stdin.nextDouble();
		 Ans = getArea(Data1);
		System.out.printf("1��%f�̐����`�̖ʐ�%f�ł�\n", Data1,Ans);
		Ans = getArea(Data1,Data2);
		System.out.printf("������%f,%f�̒����`�̖ʐς�%f�ł�\n", Data1,Data2,Ans);
		
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
