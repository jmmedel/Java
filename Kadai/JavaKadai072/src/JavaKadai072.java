//Done
import java.util.*;
public class JavaKadai072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�f�[�^������͂��Ă��������[�[��");
		int num = sc.nextInt();
	    double[] numArray  = new double[3];
	    double sum = 0.0;
	    double standardDeviation = 0.0;
	    for (int i = 0; i < num; i++) {
	    	System.out.print(i + 1 + "�Ԗڂ̃f�[�^����͂��Ă��������[�[��");
			numArray[i] = sc.nextDouble();
		}
	    for(double x : numArray) {
            sum += x;
        }
	   
	    double avg = sum / num;
	    for (int i = 0; i < 3; i++) {
	    	System.out.printf( "1�Ԗڂ̃f�[�^�� = %.6f �ŁA�΍��́@%.6f�@�ł� \n", numArray[i],numArray[i]-avg);
		}
        
       
    }
	
	

}
