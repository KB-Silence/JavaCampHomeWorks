package homeWork;

public class MainSide {
	
	public MainSide(String category, String instructor, String search, 
					String title, String progressBar, String instructorName, 
					int progress, String isCompleted) {
		
		this.category = category;
		this.instructor = instructor;
		this.search = search;
		this.title = title;
		this.progressBar = progressBar;
		this.instructorName = instructorName;
		this.progress = progress;
		this.isCompleted= isCompleted;
	}
	String category;
	String instructor;
	String search;
	String title;
	String progressBar;
	String instructorName;
	int progress;
	String isCompleted;
}