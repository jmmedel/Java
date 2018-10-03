

/// Done
import java.util.*;
public class JavaKadai057 {

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
			System.out.printf("明日の晴れの確率は  %.2f 曇りの確率は %.2f　雨の確率は %.2f",clear,cloudy,rainy);
			break;
		
		case 1:
			clear = 0.3;
			cloudy = 0.4;
			rainy = 0.3;
			System.out.printf("明日の晴れの確率は  %.2f 曇りの確率は %.2f　雨の確率は %.2f",clear,cloudy,rainy);
			break;
		
		case 2:
			clear = 0.3;
			cloudy = 0.5;
			rainy = 0.2;
			System.out.printf("明日の晴れの確率は  %.2f 曇りの確率は %.2f　雨の確率は %.2f",clear,cloudy,rainy);
			break;
			
		default:
			System.out.println("エーら");
			break;
		}
	}

}
