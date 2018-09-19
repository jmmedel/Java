import java.util.Scanner;

public class JavaKadai112 {
    public static void main(String[] args) {
        System.out.println("This Program will allow the user to calculate temperature.");
        calculateTemp();
    }

    private static void calculateTemp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a F to convert Fahrenheit to Celsius.");
        System.out.println("Please enter a C to convert Celsius to Fahrenheit.");
        String option = input.next();
        if (option.toLowerCase().equals("f")){
            System.out.println("Please enter a temperature in degrees Fahrenheit.");
            ftoc();
        }else if (option.toLowerCase().equals("c")){
            System.out.println("Please enter a temperature in degrees Celsius.");
            ctof();
        }else{
            System.out.println("ERROR PLEASE ENTER A F OR A C TO PROCEED!");
        }
    }

    private static void ftoc() {
        Scanner input = new Scanner(System.in);
        Double celsius = input.nextDouble();
       
        	System.out.println(celsius + "celsius is" + ((celsius * 9 / 5.0) + 32) + "Fahrenheite");
      
        
        	
       
        	
        
        calculatetemp();
    }

    private static void ctof() {
        Scanner input = new Scanner(System.in);
        Double Fahrenheit = input.nextDouble();
        if(Fahrenheit < -500.5) {
        System.out.println(Fahrenheit + "Fahrenheit is" + ((Fahrenheit - 32) * (5 / 9.0)) + "Celsius");
        }
        else {
        	System.out.println("Cant not be absulute zero");
        }
        	
        calculatetemp();
    }

    private static void print(String string){
        System.out.println("\n" + string);
    }

    private static void calculatetemp(){
        System.out.println("\nInside calculateTemp");
    }
}