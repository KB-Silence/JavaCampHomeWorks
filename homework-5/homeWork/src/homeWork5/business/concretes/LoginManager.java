package homeWork5.business.concretes;

import homeWork5.business.abstracts.LoginService;
import homeWork5.core.abstracts.CheckService;
import homeWork5.core.abstracts.EmailVerificationService;
import homeWork5.dataAccess.abstracts.UserDao;
import homeWork5.entities.concretes.User;

public class LoginManager implements LoginService {

	private UserDao userDao;
	private CheckService checkService;
	private EmailVerificationService verifycationEmail;

	public LoginManager(UserDao userDao, CheckService checkService, EmailVerificationService verifycationEmail) {
		this.userDao = userDao;
		this.checkService = checkService;
		this.verifycationEmail = verifycationEmail;
	}

	@Override
	public void existEmail(String email) {
		for (User user : userDao.getAll()) {
			if (user.getEmail() == email) {
				throw new ArithmeticException("E-Posta adresi zaten mevcut.");
			}
		}
	}

	@Override
	public void register(User user) {
		this.existEmail(user.getEmail());
		if (!checkService.checkEmail(user.getEmail())) {
			return;
		}
		System.out.println("Email Kontrolü Başarılı.");
		if (!checkService.checkFirstName(user.getFirstName())) {
			return;
		}
		System.out.println("Şifre Kontrolü Başarılı.");
		if (!checkService.checkPassword(user.getPassword())) {
			return;
		}
		System.out.println("İsim Kontrolü Başarılı.");
		if (!checkService.checkLastname(user.getLastName())) {
			return;
		}
		System.out.println("Soyad Kontrolü Başarılı.");
		verifycationEmail.verifyEmail(user);
		verifycationEmail.isVerified(user);
		userDao.add(user);
		System.out.println(
				"Sayın " + user.getFirstName() + " " + user.getLastName() + " kayıt işleminiz başarıyla gerçekleşi.");
	}

	@Override
	public void login(String email, String password) {
		if (!checkService.checkEmail(email)) {
			return;
		}
		if (!checkService.checkPassword(password)) {
			return;
		}
		for (User user : userDao.getAll()) {
			if (email == user.getEmail() && password == user.getPassword()) {
				System.out.println(user.getFirstName() + " " + user.getLastName() + " Başarıyla giriş yaptınız.");
				return;
			}
		}
		throw new ArithmeticException("Hatalı eposta adresi veya parola girdiniz. Lütfen tekrar deneyin.");

	}
}
