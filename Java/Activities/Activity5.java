package Activities;

abstract class Book{
	String title;
	abstract void setTitle(String S);
	
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	public void setTitle(String S) {
		title = S;
	}
}

public class Activity5 {

	public static void main(String[] args) {
		String title = "Harry Potter";
		Book newNovel = new MyBook();
		//Set title
		newNovel.setTitle(title);

		//Print result
		System.out.println("The title is: " + newNovel.getTitle());

	}

}
