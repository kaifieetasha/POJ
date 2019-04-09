package model;

/**
 * @author Rafał Sochacki s20047
 * @author Iwona Rymanowska s19330
 * <p>
 * Basic model of an Employee object.
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private Date date;

    /**
     * @param date its a constructor from Date Class to add a date value to an Employee.
     */
    public Employee(int id, String firstName, String lastName, int salary, Date date) {
        this.date = date;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary() {
        double raise = salary + salary * 0.1;
        return (int) raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}
