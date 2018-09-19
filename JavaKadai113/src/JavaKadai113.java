
public class JavaKadai113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AMRadio amrradio = new AMRadio();
		amrradio.setVolume(500);
		amrradio.getVolume();
		amrradio.setFrequency(500);
		amrradio.getFrequency();
		amrradio.setRadiostatus(true);
		amrradio.isRadiostatus();
	}
	
	
}


class AMRadio {
	
	int volume;
	public void getVolume() {
		
		System.out.println("Volume is " + this.volume);
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void getFrequency() {
		
		System.out.println("Frequency is " + this.frequency);
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public void isRadiostatus() {
		
		if(radiostatus == true) {
		
		System.out.println("radiostatus  on");
		}
		else {
			System.out.println("radiostatus  off");
		}
	}
	public void setRadiostatus(boolean radiostatus) {
		this.radiostatus = radiostatus;
	}
	int frequency;
	boolean radiostatus;
	
	
	
}
