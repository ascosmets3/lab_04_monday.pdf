import java.util.*;

class Employee {
    private String employeeID;
    private String name;
    private int age;
    private double salary;

    public Employee(String employeeID, String name, int age, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.2f", employeeID, name, age, salary);
    }
}

public class Anjali {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("161E90", "Raman", 41, 56000));
        employees.add(new Employee("161F91", "Himadri", 38, 67500));
        employees.add(new Employee("161F99", "Jaya", 51, 82100));
        employees.add(new Employee("171E20", "Tejas", 30, 55000));
        employees.add(new Employee("171G30", "Ajay", 45, 44000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sorting parameter (1. Age, 2. Name, 3. Salary):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(employees, Comparator.comparingInt(Employee::getAge));
                break;
            case 2:
                Collections.sort(employees, Comparator.comparing(Employee::getName));
                break;
            case 3:
                Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Sorted Employee Data:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
