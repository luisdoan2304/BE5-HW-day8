package hw_day7_suggestion.data;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		User[] users = new User[10];
		users[0] = new User("user1", "password1");
		users[1] = new User("user2", "password2");
		users[2] = new User("user3", "password3");
		users[3] = new User("user4", "password4");
		users[5] = new User("user6", "password6");
		users[6] = new User("user7", "password7");
		users[7] = new User("user8", "password8");
		users[8] = new User("user9", "password9");
		users[9] = new User("user10", "password10");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username = scanner.nextLine();
		System.out.print("Enter your password: ");
		String password = scanner.nextLine();

		User user = null;
		for (User u : users) {
			if (u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}

		if (user != null && user.authenticate(password)) {
			System.out.println("Login successful!");
			BankSystem bankSystem = new BankSystem(user);
			bankSystem.run();
		} else {
			System.out.println("Invalid username or password!");
		}
	}

}
