import java.util.*;
public class JavaKadai071 {

	public  static void printstart(String msg, int number) {
		System.out.print(msg);
		for (int i = 0; i < number; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 2;
		int column = 2;
		int[][] matrix = new int[row][column];
		int num0 = 0;
		int num1 = 0;
		int minus1 = 0;
		Scanner sc = new  Scanner(System.in);
		String result="";//this variable for the last line which print the result
		   for (int i = 0; i < row; i++) {
		     result=result+"\n";
		       for (int j = 0; j < column; j++) {
		         System.out.println("Row [" + i + "]:  Column " + j + " :");
		         matrix[i][j] = sc.nextInt();
		         if(matrix[i][j] == -1) {
		        	 minus1++;
		         }
		         else if (matrix[i][j] == 0) {
		        	 num0++;
		         }
		         else if (matrix[i][j] == 1) {
		        	 num1++;
		         }
		         result=result+matrix[i][j]+", ";
		       
		        }
		       
		    }
		System.out.println(result);////for the final result
		System.out.println();
		printstart("-1 | = " ,minus1);
		printstart("0 | = ", num0);
		printstart("1 | = " ,num1);

	}
	

}
