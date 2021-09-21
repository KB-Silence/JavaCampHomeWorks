package homeWork5.core.concretes;

import homeWork5.core.abstracts.EmailVerificationService;
import homeWork5.entities.concretes.User;

public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public void verifyEmail(User user) {
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(user.getEmail() + " adresinize gönderilen doğrulama linkine tıklayınız.");
	}

	@Override
	public boolean isVerified(User user) {
		System.out.println("Sayın " + user.getFirstName() + " e-posta adresiniz başarıyla doğrulandı.");
		return true;
	}

}
