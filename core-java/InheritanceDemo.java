class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayRole() {
        System.out.println("Employee: " + name);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, double salary, String language) {
        super(name, salary);
        this.programmingLanguage = language;
    }

    @Override
    void displayRole() {
        System.out.println("Developer: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Language: " + programmingLanguage);
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Developer dev = new Developer("Abhishek", 50000, "Java");

        dev.displayRole();
    }
}