// Employee
class Employee extends User {
    String position;

    Employee(String name, String id, String password, String position) {
        super(name, id, password);
        this.position = position;
    }

    void viewProfile(User user) {
        System.out.println("Name: " + user.name);
        System.out.println("ID: " + user.id);
        System.out.println("Position: " + (user instanceof Customer ? "Customer" : "Employee"));
    }
}