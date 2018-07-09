// Done

import java.util.Scanner;

public class JavaKadai074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] Array = new int [5][10];
		for (int i = 0; i < 5; i++) {
			 
			for (int j = 0; j < 10; j++) {
				System.out.print(i + "s" + j +"—á‚Ì’lF");
				Array[i][j] = sc.nextInt();
				System.out.println();
			}
		}
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 10; j++) {
				
				System.out.print(Array[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
