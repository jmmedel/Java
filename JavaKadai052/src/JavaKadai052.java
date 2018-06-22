

// Done
import java.util.*;

public class JavaKadai052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1つ目の整数値を入力してくださいーー＞");
		int num1 = sc.nextInt();
		System.out.println("2つ目の整数値を入力してくださいーー＞");
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("Data1 は Data2 の約数である");
		}
		else
			System.out.println("Data1 は Data2 の約数ではない");
	}

}
