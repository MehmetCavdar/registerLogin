package registerLogin.business.validationRules.concretes;

import registerLogin.business.validationRules.abstracts.Validation;
import registerLogin.entities.concretes.User;

public class LoginValidation  implements Validation {

	private static boolean result = true;

	public static boolean checkFormValid(User user) {
		checkEnteredRequired(user.getEmail(),user.getPassword());
		return result;
	}
	
	private static void checkEnteredRequired(String email, String password) {
		if (email.length() < 0 && password.length() < 0) {
			System.out.println("Giris formu eksik bilgiler iceriyor.");
			result = false;
		}
	}

}
