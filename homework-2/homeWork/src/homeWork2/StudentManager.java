package homeWork2;

public class StudentManager extends UserManager{
	
	public void joinCourse(Student student) {
		System.out.println(student.getFirstName() +" isimli " + student.getUserType() + " " + student.getCourse() + " kursuna katıldı.");
	}
	
	public void leaveCourse(Student student) {
		System.out.println(student.getFirstName() + " isimli " + student.getUserType() + " " + student.getCourse() + " kursunu bıraktı.");
	}
	
	public void previousLesson(Student student) {
		System.out.println(student.getFirstName() + " isimli " + student.getUserType() + " önceki derse geçiş yaptı.");
	}
	
	public void nextLesson(Student student) {
		System.out.println(student.getFirstName() + " isimli " + student.getUserType() + " dersi tamamladı ve sonraki derse geçiş yaptı.");
	}
	
	public void listStudents(Student[] students) {
		for (Student student: students) {
			System.out.println("Öğrenci ID: " + student.getId() + "\nÖğrenci Adı Soyadı: " + student.getFirstName() + " " + student.getLastName() + "\nÖğrencinin Katıldığı Kurslar: " + student.getCourse());
		}
	}
}
