// Done

import java.util.*;
import java.math.*;
public class JavaKadai067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		double num;
		int length ;
		System.out.print("正の整数値を入力してくださいーー＞");
		while(true) {
	     num = sc.nextDouble();
	     if(num > 0) {
	     length = (int)(Math.log10(num) + 1);
	     System.out.print(length);
	     break;	 
	     }
	     else {
	    	 System.out.print("正の整数値を入力してくださいーー＞");
	     }
	    	 
		}
		
		
				
		
	}

}
