package homeWork5.core.concretes;

import homeWork5.core.abstracts.CheckService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckManager implements CheckService {
	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if (!email.isEmpty() && matchFound) {
			return true;
		} else {
			throw new ArithmeticException("Geçerli bir e-mail adresi girmediniz.");
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length() > 5) {
			return true;
		} else {
			throw new ArithmeticException("Şifreniz en az 6 karakter olmalıdır.");
		}
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if (firstName.length() > 1) {
			return true;
		} else {
			throw new ArithmeticException("Adınız en az 2 karakter olmalıdır.");
		}
	}

	@Override
	public boolean checkLastname(String lastName) {
		if (lastName.length() > 1) {
			return true;
		} else {
			throw new ArithmeticException("Soyadınız en az 2 karakter olmalıdır.");
		}
	}
	
	
}