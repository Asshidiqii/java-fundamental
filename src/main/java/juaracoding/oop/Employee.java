package juaracoding.oop;

public class Employee {
    protected String name;
    protected String address;
    protected String salary;

    // Default constructor
    public Employee() {
    }

    // Constructor with parameters
    public Employee(String name, String address, String salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    // Getters and Setters for name, address, and salary
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    // Method to display work information
    public void work() {
        System.out.println(name + " is working.");
    }
}
