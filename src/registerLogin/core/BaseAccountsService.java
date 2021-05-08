package registerLogin.core;

import registerLogin.entities.concretes.User;

public interface BaseAccountsService {
	void login(User user);
	void register(User user);
}