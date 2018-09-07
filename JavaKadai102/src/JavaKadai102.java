
public class JavaKadai102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (String word : args) {
			if(word == "+") {
				System.out.println(Integer.parseInt(args[1])  + Integer.parseInt(args[2]));
			}else if(word == "-") {
				System.out.println(Integer.parseInt(args[1])  - Integer.parseInt(args[2]));
			}else if(word == "/") {
				System.out.println(Integer.parseInt(args[1])  / Integer.parseInt(args[2]));
			} else if(word == "*") {
				System.out.println(Integer.parseInt(args[1])  * Integer.parseInt(args[2]));
			}
			
			
			
			
		}
	}

}
