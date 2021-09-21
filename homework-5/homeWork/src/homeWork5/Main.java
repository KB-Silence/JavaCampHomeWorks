package homeWork5;

import homeWork5.business.abstracts.UserService;
import homeWork5.business.concretes.LoginManager;
import homeWork5.business.concretes.UserManager;
import homeWork5.core.adapters.GoogleLoginManagerAdapter;
import homeWork5.core.concretes.CheckManager;
import homeWork5.core.concretes.EmailVerificationManager;
import homeWork5.dataAccess.concretes.InMemoryUserDao;
import homeWork5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new LoginManager(new InMemoryUserDao(), new CheckManager(), new EmailVerificationManager()), 
							  new GoogleLoginManagerAdapter());
		User newUser = new User();
		newUser.setId(0);
		newUser.setFirstName("Berkcan");
		newUser.setLastName("Serbest");
		newUser.setEmail("berkcanserbest5@gmail.com");
		newUser.setPassword("123987");
		userService.register(newUser);
		System.out.println("-----------------------------------------------------------------------------------");
		User newUser2 = new User();
		newUser2.setId(1);
		newUser2.setFirstName("Nida Nurşah");
		newUser2.setLastName("Serbest");
		newUser2.setEmail("nidanursah@hotmail.com");
		newUser2.setPassword("987123");
		userService.register(newUser2);
		System.out.println("-----------------------------------------------------------------------------------");
		User newUser3 = new User();
		newUser3.setId(2);
		newUser3.setFirstName("Gülşah");
		newUser3.setLastName("Tek");
		newUser3.setEmail("gulsah@gmail.com");
		newUser3.setPassword("456789123");
		userService.register(newUser3);
		System.out.println("-----------------------------------------------------------------------------------");
		userService.login("berkcanserbest5@gmail.com", "123987");
		userService.login("gulsah@gmail.com", "456789123");
		System.out.println("-----------------------------------------------------------------------------------");
		userService.registerWithService();
		userService.loginWithService();
	}

}
