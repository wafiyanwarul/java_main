package practicumpbo.objectbehavior;

/**
 * Wafiy Anwarul Hikam / 220605110022 / Praktikum PBO / F
 * @author ACER A515-45-R3RR
 */
public class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}

class EmployeeTestDrive {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Zainal Abidin", 19, 50000.00);
        employees[1] = new Employee("Ramadhan Rahmat", 18, 60000.00);
        employees[2] = new Employee("Alhubul Austadz", 19, 70000.00);
        employees[3] = new Employee("Humam Afif", 19, 80000.00);
        employees[4] = new Employee("Harris Rifky", 17, 90000.00);
        employees[5] = new Employee("Ahmad Hilmy", 19, 100000.00);
        employees[6] = new Employee("Wafiy Anwarul", 19, 110000.00);
        employees[7] = new Employee("Rigen Ferdian", 18, 120000.00);
        employees[8] = new Employee("Ivan Fairuz", 18, 130000.00);
        employees[9] = new Employee("Ahmad Yusni", 18, 140000.00);

        for (int i = 0; i < employees.length; i++) {
            employees[i].printEmployeeInfo();
            for (int j = 0; j < 1; j++) {
                System.out.println(" ");
            }
        }
    }
}