import java.util.Scanner;

public class JavaKadai075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int get_number;
		for (int i = 1; i < 6; i++) {
			
			for (int j = 1; j < 4; j++) {
				System.out.println("番号"+ i + "学生の科目" + j + "の得点を入力してくださいーー＞");
				get_number = sc.nextInt();
				while(get_number > -2 & get_number < 100) {
				   
				   if(get_number == -1) {
					   
					   break;
				   }
				   else if (get_number == -2) {
					 
					   System.exit(0);
				   }
				   
				}
				
			}
			System.out.println("総合得点は"+ total);
			
		}
		
	}

}
