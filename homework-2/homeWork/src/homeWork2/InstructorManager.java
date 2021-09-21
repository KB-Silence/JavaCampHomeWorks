package homeWork2;

public class InstructorManager extends UserManager{
	
	public void addLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli " + instructor.getUserType() + " yeni ders ekledi.");
	}
	
	public void removeLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli " + instructor.getUserType() + " dersi sildi.");
	}
	
	public void updateLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli " + instructor.getUserType() + " dersi güncelledi.");
	}
	
	public void addHomeWork(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli " + instructor.getUserType() + " yeni ödev ekledi.");
	}
	
	public void removeHomeWork(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli " + instructor.getUserType() + " ödevi sildi.");
	}
	
	public void updateHomeWork(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli " + instructor.getUserType() + " ödevi güncelledi.");
	}
	
	public void listInstructor(Instructor[] instructors) {
		for (Instructor instructor: instructors) {
			System.out.println("Eğtimen ID: " + instructor.getId() + "\nEğitmen Adı Soyadı: " + instructor.getFirstName() + " " + instructor.getLastName() + "\nEğitmen Açıklaması: " + instructor.getDescription());
		}
	}
}
