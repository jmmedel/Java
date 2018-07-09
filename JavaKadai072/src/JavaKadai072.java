//Done
import java.util.*;
public class JavaKadai072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("データ数を入力してくださいーー＞");
		int num = sc.nextInt();
	    double[] numArray  = new double[3];
	    double sum = 0.0;
	    double standardDeviation = 0.0;
	    for (int i = 0; i < num; i++) {
	    	System.out.print(i + 1 + "番目のデータを入力してくださいーー＞");
			numArray[i] = sc.nextDouble();
		}
	    for(double x : numArray) {
            sum += x;
        }
	   
	    double avg = sum / num;
	    for (int i = 0; i < 3; i++) {
	    	System.out.printf( "1番目のデータは = %.6f で、偏差は　%.6f　です \n", numArray[i],numArray[i]-avg);
		}
        
       
    }
	
	

}
