
public class JavaKadai092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] Data = {23,45,21,67,95,43,76,19};
		System.out.println("�z��̕��ς�" + getAvg(Data) + "�ł�");
		System.out.println("�z��̐擪����4�̕��ς� "
				 + getAvg(Data,4)+ "�ł�");
		System.out.println("�z��̐擪����15�̕��ς�"
				+ getAvg(Data,15) + "�ł�");
	}

	private static String getAvg(int[] data, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static double getAvg(int[] data) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		sum += sum/data.length;
		return sum;
	}

}
