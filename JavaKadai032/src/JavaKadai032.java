/*
 * 
 *  done
 *  */

import java.util.Scanner;

public class JavaKadai032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("生年月日の年を西暦で入力してくださいーー＞");
		int year = sc.nextInt();
		System.out.print("月を入力してくださいーー＞");
		int months = sc.nextInt();
		System.out.print("日を入力してくださいーー＞");
		int day = sc.nextInt();
		System.out.printf("生年月日は　%d/%d/%d",year,months,day);
		
		
		
	}

}
