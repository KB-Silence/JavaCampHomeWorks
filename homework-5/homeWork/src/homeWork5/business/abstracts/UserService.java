package homeWork5.business.abstracts;

import homeWork5.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email, String password);
	void registerWithService();
	void loginWithService();
}
