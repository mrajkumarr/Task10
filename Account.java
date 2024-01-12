package task10;

public class Account {
	
	private double balance;

    // No-argument constructor
    public Account() {
    }

    // Two-argument constructor
    public Account(double initialbalance) {
        balance = initialbalance;
    }

    // Method to deposit
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Main method
    public static void main(String[] args) {
        // Create an account object using the no-argument constructor
        Account account1 = new Account();
        Account account2 = new Account(1000.0);

        // Deposit 500
        account1.deposit(500.0);

        // Withdraw 200
        account2.withdraw(200.0);

        // Printing balance
        System.out.println("Account 1 balance: " + account1.balance);
        
        System.out.println("Account 2 balance: " + account2.balance);
    }
}


/*
Output

Account 1 balance: 500.0
Account 2 balance: 800.0

*/