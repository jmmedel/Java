import java.util.*;
public class JavaKadai056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("�F����͂��Ă��������[�[��");
		String color = sc.next();
		
		switch (color) {
		case "���F":
			 System.out.println("BLACK");
			break;
		case "�ΐF":
			 System.out.println("Green");
			break;
		case "�F":
			 System.out.println("Blue");
			break;
		case "���F":
			 System.out.println("BLACK");
			break;
		case "���F":
			 System.out.println("White");
			break;
		case "�ԐF":
			 System.out.println("RED");
			break;
		
		default:
			 System.out.println("���[��");
			break;
		}
		
	}

}
