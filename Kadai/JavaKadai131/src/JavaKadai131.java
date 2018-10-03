
public class JavaKadai131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook notebook1 = new Notebook();
		notebook1.setTitle("メモ帳");
		notebook1.GetNotebookName();
		
		
		Notebook notebook2 = new Notebook();
		notebook1.setTitle("授業ノート ");
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
		System.out.println(id + "番目のノートを作成しました");
	}
	
	public void GetNotebookName() {
		
		System.out.println(this.id  +  "番目のノート" + this.title );
	}
	
	
	
}
