package testingcode;


import testingcode.Enumtest.Day;
import testingcode.allplanet.Planets;
import testingcode.enumclass.Season;

public class javamain {
	public static void main(String[] args) {
		enumclass a = new enumclass();
		Enumtest b = new Enumtest();
		   a.display(Season.SPRING);
		   a.display(Season.WINTER);
		   a.display(Season.SUMMER);
		   a.display(Season.FALL);
		   Enumtest firstDay = new Enumtest(Day.MONDAY);
	       firstDay.telltheday();
	       Enumtest thirdDay = new Enumtest(Day.WEDNESDAY);
	       thirdDay.telltheday();
	       Enumtest fifthDay = new Enumtest(Day.FRIDAY);
	       fifthDay.telltheday();
	       Enumtest sixthDay = new Enumtest(Day.SATURDAY);
	       sixthDay.telltheday();
	       Enumtest seventhDay = new Enumtest(Day.SUNDAY);
	       seventhDay.telltheday();
	       a.enumIterate();
	       System.out.println("");
	       b.allday();
	       allplanet gg = new allplanet();
	       System.out.println("");
	       gg.printmass();
	       
	        
	}//main endd
}
