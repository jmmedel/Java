package testingcode;


public class Enumtest {
   
Day day;
   public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}
public Enumtest(Day day) {
	
	this.day = day;
}//end of cunstructor
public Enumtest() {
	
}
public void allday(){
	for(Day x :Day.values()){
		 System.out.println(x.name());
	}
}
   public void telltheday(){
	   switch(day){
	   case MONDAY:
           System.out.println("Mondays are bad.");
           break;
               
       case FRIDAY:
           System.out.println("Fridays are better.");
           break;
                    
       case SATURDAY: case SUNDAY:
           System.out.println("Weekends are best.");
           break;
                   
       default:
           System.out.println("Midweek days are so-so.");
           break;
	   }
   }

}// end of main
