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
		for (int i = 1; i < 81; i++) {
			
			int answer = 0;
			System.out.println(i + "問の解答ーー＞");
			answer = sc.nextInt();
			
				
				if(answer == 0)
				{
					countA++;
					
				}
				else if (answer == 1) {
					countB++;
					
				}
				else if (answer == 2) {
					countC++;
					
				}
				
				else if (answer == 3) {
					countD++;
					
				}
				else {
					countErr++;
				}
			
				if(i == 80) {
					System.out.printf("ア　＝ %.2f \n",(countA/80)*100);
					System.out.printf("イ　＝%.2f \n",(countB/80)*100);
					System.out.printf("ウ　＝%.2f \n",(countC/80)*100);
					System.out.printf("エ　＝%.2f \n",(countD/80)*100);
				}
			
			
		}
		
	}
	
}

