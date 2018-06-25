import java.util.*;
public class JavaKadai077 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countErr = 0;
		for (int i = 1; i < 81; i++) {
			
			int answer = 0;
			System.out.println(i + "–â‚Ì‰ð“š[[„");
			answer = sc.nextInt();
			if(answer > -1) {
				switch (answer) {
				case 0:
					countA++;
					System.out.println("A = "+(countA / 80) * 100);
					
					
					break;
				case 1:
					++countB;
					
					System.out.println("B = "+(countB /80)* 100 );
					
					break;
				case 2:
					++countC;
					
					System.out.println("C =" +(countC / 80) * 100 );
					
					break;
				case 3:
					++countD;
					
					System.out.println("D = "+(countD /80) * 100 );
					
					break;
				default:
					++countErr;
					System.out.println("Error" + (countErr / 80) * 100 );
					break;
					
				}
				
				
			}
			System.out.println("Error" + countA );
			System.out.println("Error" + countB / 80 * 100 );
			System.out.println("Error" + countC );
			System.out.println("Error" + countD );
			System.out.println("Error" + countErr );
		}
		
	}
	
}

