import java.util.Scanner;

public class JavaKadai075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		get_score();
	
		
	}
	
	public static void get_score() {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int get_number;
		for (int i = 1; i < 6; i++) {
			
			for (int j = 1; j < 4; j++) {
				System.out.println("番号"+ i + "学生の科目" + j + "の得点を入力してくださいーー＞");
				get_number = sc.nextInt();
				if(get_number > -2 & get_number < 101) {
				   
					
				    if(get_number == -1) {
					   
					   break;
				   }
				   else if (get_number == -2) {
					 
					  break;
				   }
				   else {
					   total = total + get_number;
					   break;
				   }
					   
				   
				   
				}
				
			}
			if(i == 5) {
				System.out.println("総合得点は"+ total);
				}
			
		}
	}

}
