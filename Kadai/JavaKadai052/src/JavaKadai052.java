

// Done
import java.util.*;

public class JavaKadai052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1�ڂ̐����l����͂��Ă��������[�[��");
		int num1 = sc.nextInt();
		System.out.println("2�ڂ̐����l����͂��Ă��������[�[��");
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("Data1 �� Data2 �̖񐔂ł���");
		}
		else
			System.out.println("Data1 �� Data2 �̖񐔂ł͂Ȃ�");
	}

}
