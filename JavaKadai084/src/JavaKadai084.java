///done
import java.util.Arrays;
public class JavaKadai084 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] data = {32,56,31,56,47,56,15};
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%5d",data[i]);
			
		}
		System.out.printf("%n");
		int m = getMedia(data);
		System.out.printf("’†‰›’l‚Í%d‚Å‚·\n", m);
		
	}
	
	public static int  getMedia(int[] data) {
		 Arrays.sort(data);
		int middle = data.length/2;
	
		return data[middle];
	}

}
