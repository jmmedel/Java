import java.util.*;
public class JavaKadai085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year,nyear;
		String str;
		Calendar cal = Calendar.getInstance();
		nyear = cal.get(Calendar.YEAR);
		Scanner stdin = new Scanner(System.in);
		System.out.printf("����N����͂��Ă��������[�[��");
		year = stdin.nextInt();
		str = toWareki(year);
		if(str == null)
			System.out.printf("�ς��͂P�W�U�W�N�ȍ~�ł�\n");
		else System.out.printf("����%d�N%s�ł��B���̔N�ɐ��܂ꂽ�l�͍��N%d�΂ɂȂ�܂�\n", year,str,nyear-year);
		
	}

	public static String toWareki(int year) {
		// TODO Auto-generated method stub
		String  wa = null;
		if (year > 1989 ) {
		wa = "����" + (year - 1988) + "�N";
		} 
		return wa;
		
		
	}

}
