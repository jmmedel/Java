// Done

import java.util.*;
public class JavaKadai066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you score ");
		while(true) {
			double data = sc.nextDouble();
			if(data > 0 && data <100 ) {
				sum += data;
				System.out.println(sum);
			}
			else
				System.out.println("Please enter a passitiven number");
			
		}
	}

}
