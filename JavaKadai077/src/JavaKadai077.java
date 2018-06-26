import java.util.*;
public class JavaKadai077 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		double countA = 0;
		double countB = 0;
		double countC = 0;
		double countD = 0;
		double countErr = 0;
		for (int i = 1; i < 11; i++) {
			
			int answer = 0;
			System.out.println(i + "–â‚Ì‰ð“š[[„");
			answer = sc.nextInt();
			
				
				if(answer == 0)
				{
					countA++;
					System.out.println("A = "+countA);
				}
				else if (answer == 1) {
					countB++;
					System.out.println("B = "+countB);
				}
				else if (answer == 2) {
					countC++;
					System.out.println("C = "+countC);
				}
				
				else if (answer == 3) {
					countD++;
					System.out.println("D = "+countD);
				}
				else {
					countErr++;
				}
			
				if(i == 10) {
					System.out.printf("%2f",(countA/10)*100);
					System.out.printf("%2f",(countB/10)*100);
					System.out.printf("%2f",(countC/10)*100);
					System.out.printf("%2f",(countD/10)*100);
				}
			
			
		}
		
	}
	
}

