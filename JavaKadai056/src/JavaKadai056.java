import java.util.*;
public class JavaKadai056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("色を入力してくださいーー＞");
		String color = sc.next();
		
		switch (color) {
		case "黒色":
			 System.out.println("BLACK");
			break;
		case "緑色":
			 System.out.println("Green");
			break;
		case "青色":
			 System.out.println("Blue");
			break;
		case "黄色":
			 System.out.println("BLACK");
			break;
		case "白色":
			 System.out.println("White");
			break;
		case "赤色":
			 System.out.println("RED");
			break;
		
		default:
			 System.out.println("えーら");
			break;
		}
		
	}

}
