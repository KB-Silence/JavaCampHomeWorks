package homeWork5.core.adapters;

import GoogleLogin.concretes.GoogleLoginManager;
import homeWork5.core.abstracts.OutSourceServices;

public class GoogleLoginManagerAdapter implements OutSourceServices {

	@Override
	public void registerWith() {
		GoogleLoginManager googleManager = new GoogleLoginManager();
		googleManager.register();
	}

	@Override
	public void loginWith() {
		GoogleLoginManager googleManager = new GoogleLoginManager();
		googleManager.login();
	}
}
