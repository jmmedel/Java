import java.util.Scanner;

public class JavaKadai041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("1�ڂ̐����l����͂��Ă��������[�[��");
		int num1 = sc.nextInt();
		System.out.println("2�ڂ̐����l����͂��Ă��������[�[��");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
	}

}
