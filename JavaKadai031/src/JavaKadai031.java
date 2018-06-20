import java.util.Scanner;  

public class JavaKadai031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);  
		System.out.print("氏名を入力してください　－ー＞　\n");
		String name = sc.next();
		System.out.print("年齢を入力してください　－－＞\n");
		int age = sc.nextInt();
		System.out.print(name + "さんは来年" + (age+1) + "歳になります");
	}

}
