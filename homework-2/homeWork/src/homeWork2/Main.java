package homeWork2;

public class Main {

	public static void main(String[] args) {
		
		// Öğrenci bilgilerinin set edildiği kısım.
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Berkcan");
		student1.setLastName("Serbest");
		student1.setEmail("berkcanserbest5@gmail.com");
		student1.setPassword("12345");
		student1.setUserType("Öğrenci");
		student1.setCourse("Java + React Yazılımcı Geliştirme Kampı");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Nida Nurşah");
		student2.setLastName("Serbest");
		student2.setEmail("nidanursah@gmail.com");
		student2.setPassword("54321");
		student2.setUserType("Öğrenci");
		student2.setCourse("Java + React Yazılımcı Geliştirme Kampı");
		
		// Öğrencileri listelemek için öğreni bilgilerinin tutulduğu array list.
		Student[] studentList = new Student[] {student1, student2};
		
		// Eğitmen bilgilerinin set edildiği kısım.
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setPassword("987651234");
		instructor1.setUserType("Eğitmen");
		instructor1.setProfession("C#, Java & React, Python, DevFramework etc.");
		instructor1.setDescription("MCT ,PMP ve ITIL sertifikalarına sahibim.");
		// Eğitmenleri listelemek için eğitmen bilgilerinin tutulduğu array list.
		Instructor[] instructorList = new Instructor[] {instructor1};
		
		// Çoklu işlemler için user bilgilerini tuttuğumuz array list.
		User[] userList = new User[] {student1, instructor1};
		
		// Çoklu işlemler ile ilgili operasyonları yönettiğimiz kısım.
		UserManager userManager = new UserManager();
		userManager.addMultiple(userList);
		userManager.removeMultiple(userList);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		// Student ile ilgili operasyonları yönettiğimiz kısım.
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.remove(student1);
		studentManager.update(student1);
		studentManager.addComment(student1);
		studentManager.removeComment(student1);
		studentManager.updateComment(student1);
		studentManager.loadScreenShot(student1);
		studentManager.joinCourse(student1);
		studentManager.leaveCourse(student1);
		studentManager.previousLesson(student1);
		studentManager.nextLesson(student1);
		
		System.out.println("--------------------------------");
		
		//Öğrenci listeleme operasyonu
		studentManager.listStudents(studentList);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		// Instructor ile ilgili operasyonları yönettiğimiz kısım.
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.remove(instructor1);
		instructorManager.update(instructor1);
		instructorManager.addComment(instructor1);
		instructorManager.removeComment(instructor1);
		instructorManager.updateComment(instructor1);
		instructorManager.loadScreenShot(instructor1);
		instructorManager.addLesson(instructor1);
		instructorManager.removeLesson(instructor1);
		instructorManager.updateLesson(instructor1);
		instructorManager.addHomeWork(instructor1);
		instructorManager.removeHomeWork(instructor1);
		instructorManager.updateHomeWork(instructor1);
		
		System.out.println("--------------------------------");
		
		//Eğitmen listeleme operasyonu.
		instructorManager.listInstructor(instructorList);
		
	}

}
