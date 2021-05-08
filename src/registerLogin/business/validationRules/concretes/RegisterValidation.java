package registerLogin.business.validationRules.concretes;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import registerLogin.business.validationRules.abstracts.Validation;
import registerLogin.entities.concretes.User;

public class RegisterValidation implements Validation {

	private static boolean result = true;

	public static boolean checkFormValid(User user) {
		checkMinCharacter(user.getFirstName(), user.getLastName());
		checkEmailFormat(user.getEmail());
		checkPasswordLength(user.getPassword());
		return result;
	}

	private static void checkPasswordLength(String password) {
		if (password.length() < 6) {
			System.out.println("sifre en az 6 karakterden olusmalidir.");
			result = false;
		}

	}

	private static void checkMinCharacter(String firstName, String lastName) {
		if (firstName.length() < 2 && lastName.length() < 2) {
			System.out.println("Kullanici adi ve soyadi en az 2 karakterden olusmalidir.");
			result = false;
		}
	}

	private static void checkEmailFormat(String email) {
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email.toLowerCase(Locale.ROOT));
		
		if (!matcher.matches()) {
			System.out.println("Lütfen gecerli bir email adresi giriniz!");
			result = false;
		} else {
			System.out.println(email + " adresi gecerli");
		}

	}

}

//email = JOptionPane.showInputDialog(email);
//email.matches("(?simx)\\\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b")
