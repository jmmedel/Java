import java.util.Scanner;  

public class JavaKadai031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);  
		System.out.print("��������͂��Ă��������@�|�[���@\n");
		String name = sc.next();
		System.out.print("�N�����͂��Ă��������@�|�|��\n");
		int age = sc.nextInt();
		System.out.print(name + "����͗��N" + (age+1) + "�΂ɂȂ�܂�");
	}

}
