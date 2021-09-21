package homeWork2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli " + user.getUserType() + " eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user: users) {
			add(user);
		}
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli " + user.getUserType() + " silindi.");
	}
	
	public void removeMultiple(User[] users) {
		for (User user: users) {
			remove(user);
		}
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli " + user.getUserType() + " güncellendi.");
	}
	
	public void addComment(User user) {
		System.out.println(user.getFirstName() + " isimli " + user.getUserType() + " yorum yaptı.");
	}
	
	public void removeComment(User user) {
		System.out.println(user.getFirstName() + " isimli " + user.getUserType() + " yorumunu sildi.");
	}
	
	public void updateComment(User user) {
		System.out.println(user.getFirstName() + " isimli " + user.getUserType() + " yorumunu güncelledi.");
	}
	
	public void loadScreenShot(User user) {
		System.out.println(user.getFirstName() + " isimli " + user.getUserType() + " ekran görüntüsü yükledi.");
	}

}
