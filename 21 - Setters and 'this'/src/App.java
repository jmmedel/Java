

class Frog {
	
		String name;
		int Age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		
		
}








public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1 = new Frog();
		
		frog1.setName("Bertie");
		frog1.setAge(1);
		
		System.out.println(frog1.getName());
	}

}
