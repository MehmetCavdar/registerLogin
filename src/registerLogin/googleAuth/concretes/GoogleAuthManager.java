package registerLogin.googleAuth.concretes;

import registerLogin.entities.concretes.User;
import registerLogin.googleAuth.abstracts.GoogleAuthService;

public class GoogleAuthManager implements GoogleAuthService{
	public void login(User user) {
		System.out.println("Google hesabi ile giris saglandi.");
	}

	public void register(User user) {
		System.out.println("Google hesabi ile kayit gerçeklestirildi.");
	}

}