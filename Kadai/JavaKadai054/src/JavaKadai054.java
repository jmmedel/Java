//done
import java.util.*;

public class JavaKadai054 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Œ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢[[„");
	int months = sc.nextInt();
	
	if (months == 1  || months == 2 || months == 12 )
	{
		System.out.print("“~‚Å‚·");
	}
	else if (months == 3  || months == 4 || months == 5 )
	{
		System.out.print("t‚Å‚·");
	}
	
	else if (months == 6  || months == 7 || months == 8 )
	{
		System.out.print("‰Ä‚Å‚·");
	}
	
	else if (months == 9  || months == 10 || months == 11)
	{
		System.out.print("H‚Å‚·");
	}
	
	else
		
		System.out.println("ƒG[‚ç");
	
	
}
}
