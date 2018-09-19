
public class JavaKadai131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook notebook1 = new Notebook();
		notebook1.setTitle("Notebook1");
		notebook1.GetNotebookName();
		
		
		Notebook notebook2 = new Notebook();
		notebook1.setTitle("Notebook2 ");
		notebook1.GetNotebookName();
		
		
	}

}

class Notebook {
	
	private  String title;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	static int id;
	public Notebook() {
		id++;
		
	}
	
	public void GetNotebookName() {
		
		System.out.println("This is Note book name = " + this.title + " This is notebook Id = " + this.id);
	}
	
	
	
}
