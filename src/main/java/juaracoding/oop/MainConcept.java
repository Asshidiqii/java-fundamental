package juaracoding.oop;

public class MainConcept {
    public static void main(String[] args) {
        User admin = new User();
        admin.setUsername("adm1n");
        admin.setPassword("p4assword");
        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());

        User staff = new User();
        staff.setUsername("st4ff");
        staff.setPassword("p4ssword");
        System.out.println(staff.getUsername());
        System.out.println(staff.getPassword());

        staff.setCurrentPassword("p4ssword");
        staff.setNewPassword("1234");
        staff.setConfirmPassword("1234");
        staff.changePassword(staff.getCurrentPassword(), staff.getNewPassword(), staff.getConfirmPassword());

        // Polymorphism Overloading
        Callculator calculator = new Callculator();
        calculator.sum(5, 8);
        calculator.sum(5, 8, 3);
        calculator.sum(5.4, 9.2);

        BidangDatar bidangDatar = new BidangDatar();
        bidangDatar.draw();
        BidangDatar segitiga = new Segitiga();
        segitiga.draw();

        // Create an Employee object
        Employee employee = new Employee("John Doe", "123 Main St", "5000");
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());
        employee.work();

        // Create a Manager object
        Manager manager = new Manager("Jane Smith", "456 Elm St", "7000", "IT");
        System.out.println(manager.getName());
        System.out.println(manager.getAddress());
        System.out.println(manager.getSalary());
        System.out.println(manager.getDepartment());
        manager.work();
    }
}