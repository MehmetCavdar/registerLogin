package registerLogin.core;

import registerLogin.entities.concretes.User;
import registerLogin.googleAuth.abstracts.GoogleAuthService;

public class GoogleAuthManagerAdapter implements BaseAccountsService{

	GoogleAuthService googleAuthService;
	
	public GoogleAuthManagerAdapter(GoogleAuthService googleAuthService) {
		this.googleAuthService = googleAuthService;
	}

	@Override
	public void login(User user) {
		this.googleAuthService.login(user);
	}

	@Override
	public void register(User user) {
		this.googleAuthService.register(user);
	}

}

