//done
import java.util.*;
public class JavaKadai082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("�P�̃f�[�^����͂��Ă��������[�[��");
		double a = stdin.nextDouble();
		System.out.print("2�̃f�[�^����͂��������[�[��");
		double b = stdin.nextDouble();
		dispMax(a,b);
		
		
	}

	private static void dispMax(double a, double b) {
		// TODO Auto-generated method stub
		if (a > b) {
			System.out.println(a-b);
		}else if(a<b) {
			System.out.println(b-a);
		}else {
			System.out.println("����������");
		}
			
	}

}
