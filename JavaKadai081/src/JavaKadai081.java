
public class JavaKadai081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 35 , b = 40 , c = 72, d = 49, e = 53;
		double v = getAvg(a,b,c,d,e);
		System.out.println(v);
	}

	private static double getAvg(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stub
		double total  =  a + b + c + d + e ;
		double avg = total / 5;
	
		return  avg;	
	}
	
	
	

}
