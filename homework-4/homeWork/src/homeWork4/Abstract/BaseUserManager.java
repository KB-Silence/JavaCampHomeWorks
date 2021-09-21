package homeWork4.Abstract;

import homeWork4.Entities.User;
import homeWork4.Interfaces.UserService;

public abstract class BaseUserManager implements UserService{
	
	@Override
	public void add(User user) {
		System.out.println("Kimlik doğrulama başarılı.\n" + user.getNickname() + " kullanıcı adıyla sisteme kayıt oldunuz.");
	}
	
	@Override
	public void remove(User user) {
		System.out.println(user.getNickname() + " gittiğini görmek üzücü. Hesabın başarıyla silindi :( .");
	}

	@Override
	public void update(User user) {
		System.out.println("Bilgilerini başarıyla güncelledin " + user.getNickname() + ".");
	}
}
