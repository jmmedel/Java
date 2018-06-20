import java.util.Scanner;

public class JavaKadai033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("学籍番号を入力してくださいーー＞");
		int gakuseki = sc.nextInt();
		System.out.print("氏名うぉ入力してくださいーー＞");
		String name = sc.next();
		System.out.printf("学籍番号%dの%sです", gakuseki,name);
		
	}

}
