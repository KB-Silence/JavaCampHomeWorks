package homeWork4.Managers;

import homeWork4.Entities.User;
import homeWork4.Interfaces.UserCheckService;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		return true;
	}

}
