import java.util.Scanner;

public class BankManagement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample data
        Customer customer = new Customer("John Doe", "C123", "customer123");
        Employee employee = new Employee("Jane Smith", "E456", "employee456", "Manager");
        Admin admin = new Admin("Admin", "A789", "admin789");

        // Login
        System.out.println("Enter user type (customer, employee, admin):");
        String userType = scanner.next();

        if (userType.equals("customer")) {
        	
            // Customer login
            System.out.println("Enter customer ID:");
            String customerId = scanner.next();
            System.out.println("Enter password:");
            String customerPassword = scanner.next();

            if (customerId.equals(customer.id) && customerPassword.equals(customer.password)) {
            	
                // Customer logged in
                System.out.println("Customer logged in successfully!");
                
                while(true) {
                	System.out.println("Enter 1.Deposit 2.Withdraw 3.Display Balance 4.Exit");
                    int choice=scanner.nextInt();
                    switch(choice) {
                    case 1:System.out.println("Enter amount to deposit:");
                       	int damount=scanner.nextInt();
                       customer.deposit(damount);
                       break;
                    case 2:System.out.println("Enter amount to withdraw:");
                    	int wamount=scanner.nextInt();
                    	customer.withdraw(wamount);
                    	break;
                    case 3:
                    	customer.displayBalance();
                    	break;
                    case 4:
                    	return;
                	default:System.out.println("Invalid choice!!");
                }
              }
                // Perform deposit or withdraw operations as needed
            } else {
                System.out.println("Invalid credentials!");
            }
        } else if (userType.equals("employee")) {
        	
            // Employee login
            System.out.println("Enter employee ID:");
            String employeeId = scanner.next();
            System.out.println("Enter password:");
            String employeePassword = scanner.next();

            if (employeeId.equals(employee.id) && employeePassword.equals(employee.password)) {
            	
                // Employee logged in
                System.out.println("Employee logged in successfully!");
                
                // Perform employee-specific operations
            } else {
                System.out.println("Invalid credentials!");
            }
        } else if (userType.equals("admin")) {
        	
            // Admin login
            System.out.println("Enter admin ID:");
            String adminId = scanner.next();
            System.out.println("Enter password:");
            String adminPassword = scanner.next();

            if (adminId.equals(admin.id) && adminPassword.equals(admin.password)) {
            	
                // Admin logged in
                System.out.println("Admin logged in successfully!");
                
                // View profiles of customers and employees
                admin.viewProfile(customer);
                admin.viewProfile(employee);
            } else {
                System.out.println("Invalid credentials!");
            }
        } else {
            System.out.println("Invalid user type!");
        }

        scanner.close();
    }
}
