
public class JavaKadai102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1; i++) {
			if(args[i] == "+") {
				Addition(args);
			}
		}
		
		
		//Subtraction(args);
		//Division(args);
		//Multiplication(args);
		
	}
	
	public static void Addition(String[] args) {
		 int sum;
	   	 int i;
	   	 sum = Integer.parseInt(args[1]);          // Initialize the running sum
	    
	   	 for ( i = 2; i < args.length; i++ )
	   	 {
	   	    sum = sum + Integer.parseInt(args[i]);   // Add args[i] to running sum  
	 
	   	 }
	    
	   	 System.out.println( sum );
	}
	
	
	public static void Subtraction(String[] args) {
		 int ans;
	   	 int i;
	   	 ans = Integer.parseInt(args[1]);          // Initialize the running sum
	    
	   	 for ( i = 2; i < args.length; i++ )
	   	 {
	   	    ans = ans - Integer.parseInt(args[i]);   // Add args[i] to running sum  
	 
	   	 }
	    
	   	 System.out.println( ans );
	}
	
	public static void Division(String[] args) {
		 int ans;
	   	 int i;
	   	 ans = Integer.parseInt(args[1]);          // Initialize the running sum
	    
	   	 for ( i = 2; i < args.length; i++ )
	   	 {
	   	    ans = ans / Integer.parseInt(args[i]);   // Add args[i] to running sum  
	 
	   	 }
	    
	   	 System.out.println( ans );
	}
	
	public static void Multiplication(String[] args) {
		 int ans;
	   	 int i;
	   	 ans = Integer.parseInt(args[1]);          // Initialize the running sum
	    
	   	 for ( i = 2; i < args.length; i++ )
	   	 {
	   	    ans = ans * Integer.parseInt(args[i]);   // Add args[i] to running sum  
	 
	   	 }
	    
	   	 System.out.println( ans );
	}
	

}
