import java.util.Scanner;

public class JavaKadai112 {
    public static void main(String[] args) {
        System.out.println("���̃v���O�����ɂ��A���[�U�[�͉��x���v�Z�ł��܂��B");
        calculateTemp();
    }

    private static void calculateTemp() {
        Scanner input = new Scanner(System.in);
        System.out.println("�؎���ێ��ɕϊ�����ɂ́AF����͂��Ă��������B");
        System.out.println("C����͂��Đێ����؎��ɕϊ����Ă��������B");
        String option = input.next();
        if (option.toLowerCase().equals("f")){
            System.out.println("�؎��ŉ��x����͂��Ă��������B");
            ftoc();
        }else if (option.toLowerCase().equals("c")){
            System.out.println("���x��ێ��œ��͂��Ă��������B");
            ctof();
        }else{
            System.out.println("�G���[F�܂���C����͂��Ă��������I");
        }
    }

    private static void ftoc() {
        Scanner input = new Scanner(System.in);
        Double celsius = input.nextDouble();
        	
        	if(celsius > -500) {
        	System.out.println(celsius + "�ێ���" + ((celsius * 9 / 5.0) + 32) + "�؎�");
        	}
        	else {
        		System.out.println("��΃[���ɂ��邱�Ƃ͂ł��܂���");
        	}
        		
        
        
    }

    private static void ctof() {
        Scanner input = new Scanner(System.in);
        Double Fahrenheit = input.nextDouble();
        if(Fahrenheit > -500) {
        System.out.println(Fahrenheit + "�؎���" + ((Fahrenheit - 32) * (5 / 9.0)) + "�ێ�");
        }
        else {
        	System.out.println("��΃[���ɂ��邱�Ƃ͂ł��܂���");
        }
        	
        
    }

    private static void print(String string){
        System.out.println("\n" + string);
    }

   
}