package hw_day7_suggestion.data;

public class User {
	private String username;
	private String password;
	private double balance;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.balance = 10000.0;
	}

	public String getUsername() {
		return username;
	}

	public boolean authenticate(String password) {
		return this.password.equals(password);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance!");
		}
	}
}
