//done
import java.util.*;

public class JavaKadai054 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("������͂��Ă��������[�[��");
	int months = sc.nextInt();
	
	if (months == 1  || months == 2 || months == 12 )
	{
		System.out.print("�~�ł�");
	}
	else if (months == 3  || months == 4 || months == 5 )
	{
		System.out.print("�t�ł�");
	}
	
	else if (months == 6  || months == 7 || months == 8 )
	{
		System.out.print("�Ăł�");
	}
	
	else if (months == 9  || months == 10 || months == 11)
	{
		System.out.print("�H�ł�");
	}
	
	else
		
		System.out.println("�G�[��");
	
	
}
}
