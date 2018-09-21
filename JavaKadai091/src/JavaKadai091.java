//done
import java.util.Arrays;
public class JavaKadai091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		int Data1 = 50;
		int Data2 = 20;
		
		int[] Data3 = {42,67,45,21,30,83,55};
		int Min;
		Min = getMin(Data1,Data2);
		System.out.println("2つのデータの最小値は"+ Min + "です");
		Min = getMin(Data3);
		System.out.println("配列のデータの最小値は"+ Min + "です");
		
	}

	private static int getMin(int[] data3) {
		// TODO Auto-generated method stub
		int min = data3[0];
		for (int i = 0; i < data3.length; i++) {
			if(min > data3[i]) {
				min = data3[i];
			}
		}
		return min;
	}

	private static int getMin(int data1, int data2) {
		// TODO Auto-generated method stub
		
		
		return data1 < data2 ? data1 : data2 ;
	}

}
