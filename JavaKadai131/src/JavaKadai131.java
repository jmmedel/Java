
public class JavaKadai131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook notebook1 = new Notebook();
		notebook1.setTitle("������");
		notebook1.GetNotebookName();
		
		
		Notebook notebook2 = new Notebook();
		notebook1.setTitle("���ƃm�[�g ");
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
		System.out.println(id + "�Ԗڂ̃m�[�g���쐬���܂���");
	}
	
	public void GetNotebookName() {
		
		System.out.println(this.id  +  "�Ԗڂ̃m�[�g" + this.title );
	}
	
	
	
}
