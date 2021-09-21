package homeWork5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homeWork5.dataAccess.abstracts.UserDao;
import homeWork5.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	public List<User> users;
	
	public InMemoryUserDao() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı database'e eklendi.");
	}

	@Override
	public void delete(User user) {
		//Kullanıcı silme komutları.
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}
}
