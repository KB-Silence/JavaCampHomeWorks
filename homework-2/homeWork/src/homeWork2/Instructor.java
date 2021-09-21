package homeWork2;

public class Instructor extends User{
	
	private String profession;
	private String description;
	
	public Instructor() {}
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String userType, String profession, String description) {
		super(id, firstName, lastName, email, password, userType);
		this.profession = profession;
		this.description = description;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
