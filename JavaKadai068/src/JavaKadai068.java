// Done
import java.util.Scanner;

public class JavaKadai068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double clear;
		double cloudy;
		double rainy;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("今日の天気を入力してくださいーー＞（０：晴れ、１曇り、２雨）－－＞");
		int num1 = sc.nextInt();
		switch (num1) {
		case 0:
			clear = 0.4;
			cloudy = 0.4;
			rainy = 0.2;
			double clear2;
			double cloudy2;
			double rainy2;
			
			for (int i = 1; i < 8; i++) {
				 clear2 = clear *0.4 + cloudy *  0.3 + rainy * 0.3;
				 cloudy2 =  clear * 0.4 + cloudy * 0.4 + rainy * 0.5;
				 rainy2 = clear * 0.2 + cloudy * 0.3 + rainy * 0.2;
				 
						 
				System.out.printf(i+"日後の晴れの確率は  %.2f 曇りの確率は %.2f　雨の確率は %.2f \n",clear2,cloudy2,rainy2);
				
			}
			
			break;
		
		case 1:
			clear = 0.3;
			cloudy = 0.4;
			rainy = 0.3;
			double clear3;
			double cloudy3;
			double rainy3;
			
			for (int i = 1; i < 8; i++) {
				 clear3 = clear *0.4 + cloudy *  0.3 + rainy * 0.3;
				 cloudy3 =  clear * 0.4 + cloudy * 0.4 + rainy * 0.5;
				 rainy3 = clear * 0.2 + cloudy * 0.3 + rainy * 0.2;
				 
						 
				System.out.printf(i+"日後の晴れの確率は  %.2f 曇りの確率は %.2f　雨の確率は %.2f \n",clear3,cloudy3,rainy3);
				
			}
			
			break;
		
		case 2:
			clear = 0.3;
			cloudy = 0.5;
			rainy = 0.2;
			double clear4;
			double cloudy4;
			double rainy4;
			
			for (int i = 1; i < 8; i++) {
				 clear4 = clear *0.4 + cloudy *  0.3 + rainy * 0.3;
				 cloudy4 =  clear * 0.4 + cloudy * 0.4 + rainy * 0.5;
				 rainy4 = clear * 0.2 + cloudy * 0.3 + rainy * 0.2;
				 
						 
				System.out.printf(i+"日後の晴れの確率は  %.2f 曇りの確率は %.2f　雨の確率は %.2f \n",clear4,cloudy4,rainy4);
				
			}
			
			break;
			
		default:
			System.out.println("エーら");
			break;
		}
	

	}

}
