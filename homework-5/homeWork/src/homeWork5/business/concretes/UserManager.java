package homeWork5.business.concretes;

import homeWork5.business.abstracts.LoginService;
import homeWork5.business.abstracts.UserService;
import homeWork5.core.abstracts.OutSourceServices;
import homeWork5.entities.concretes.User;

public class UserManager implements UserService {

	private LoginService loginService;
	private OutSourceServices outService;
	
	public UserManager(LoginService loginService, OutSourceServices outService) {
		this.loginService = loginService;
		this.outService = outService;
	}

	@Override
	public void register(User user) {
		loginService.register(user);
	}
	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
	}
	@Override
	public void registerWithService() {
		outService.registerWith();
	}

	@Override
	public void loginWithService() {
		outService.loginWith();
	}

}
