import java.util.Scanner;

public class JavaKadai112 {
    public static void main(String[] args) {
        System.out.println("このプログラムにより、ユーザーは温度を計算できます。");
        calculateTemp();
    }

    private static void calculateTemp() {
        Scanner input = new Scanner(System.in);
        System.out.println("華氏を摂氏に変換するには、Fを入力してください。");
        System.out.println("Cを入力して摂氏を華氏に変換してください。");
        String option = input.next();
        if (option.toLowerCase().equals("f")){
            System.out.println("華氏で温度を入力してください。");
            ftoc();
        }else if (option.toLowerCase().equals("c")){
            System.out.println("温度を摂氏で入力してください。");
            ctof();
        }else{
            System.out.println("エラーFまたはCを入力してください！");
        }
    }

    private static void ftoc() {
        Scanner input = new Scanner(System.in);
        Double celsius = input.nextDouble();
        	
        	if(celsius > -500) {
        	System.out.println(celsius + "摂氏は" + ((celsius * 9 / 5.0) + 32) + "華氏");
        	}
        	else {
        		System.out.println("絶対ゼロにすることはできません");
        	}
        		
        
        
    }

    private static void ctof() {
        Scanner input = new Scanner(System.in);
        Double Fahrenheit = input.nextDouble();
        if(Fahrenheit > -500) {
        System.out.println(Fahrenheit + "華氏は" + ((Fahrenheit - 32) * (5 / 9.0)) + "摂氏");
        }
        else {
        	System.out.println("絶対ゼロにすることはできません");
        }
        	
        
    }

    private static void print(String string){
        System.out.println("\n" + string);
    }

   
}