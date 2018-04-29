package testingcode;

public class enumclass {
	public enum Season {
	    WINTER,
	    SPRING,
	    SUMMER,
	    FALL
	}
	
	
	public  void display(Season s) {
	    System.out.println(s.name());  // name() is a built-in method that gets the exact name of the enum constant
	}
	public  void enumIterate() {
	    for (Season s : Season.values()) {
	        System.out.println(s.name());
	    }
	}
   
	
}//enum class end
