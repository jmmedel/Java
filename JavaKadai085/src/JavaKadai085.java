import java.util.*;
public class JavaKadai085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year,nyear;
		String str;
		Calendar cal = Calendar.getInstance();
		nyear = cal.get(Calendar.YEAR);
		Scanner stdin = new Scanner(System.in);
		System.out.printf("西暦年を入力してくださいーー＞");
		year = stdin.nextInt();
		str = toWareki(year);
		if(str == null)
			System.out.printf("変かは１８６８年以降です\n");
		else System.out.printf("西暦%d年%sです。この年に生まれた人は今年%d歳になります\n", year,str,nyear-year);
		
	}

	public static String toWareki(int year) {
		// TODO Auto-generated method stub
		String  wa = null;
		if (year > 1989 ) {
		wa = "平成" + (year - 1988) + "年";
		} 
		return wa;
		
		
	}

}
