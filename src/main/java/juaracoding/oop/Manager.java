package juaracoding.oop;

public class Manager extends Employee {
    private String department;

    // Default constructor
    public Manager() {
    }

    // Constructor with parameters
    public Manager(String name, String address, String salary, String department) {
        super(name, address, salary); // Call the constructor of the Employee class
        this.department = department;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override the work method to display additional information
    @Override
    public void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}
