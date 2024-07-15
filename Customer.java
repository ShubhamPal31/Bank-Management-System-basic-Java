// Customer
class Customer extends User {
    double balance;

    Customer(String name, String id, String password) {
        super(name, id, password);
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}