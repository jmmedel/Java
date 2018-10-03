import java.util.*;
public class JavaKadai065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
	    System.out.print("Enter a number");
		double data = sc.nextDouble();
		
		if(data<0) {
			counter++;
			System.out.println("the data enter -->"  + counter);
		}
			
		}
		
		
	}

}
