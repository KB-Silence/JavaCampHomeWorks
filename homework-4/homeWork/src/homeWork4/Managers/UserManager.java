package homeWork4.Managers;

import homeWork4.Abstract.BaseUserManager;
import homeWork4.Entities.User;
import homeWork4.Interfaces.UserCheckService;

public class UserManager extends BaseUserManager{

	private UserCheckService checkService;
	
	public UserManager(UserCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void add(User user) {
		if (checkService.checkIfRealPerson(user)) {
			super.add(user);
		} else {
			throw new ArithmeticException("Bilgiler doğrulanamadı. Kontrol edip tekrar deneyin.");
		}
	}
}
