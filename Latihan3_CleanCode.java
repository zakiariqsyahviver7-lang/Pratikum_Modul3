class Employee {
    int getMonthlySalary() { return 5000; }
    int getCommission() { return 1000; }
    int getBonus() { return 2000; }
}

abstract class EmployeeType {
    abstract int payAmount(Employee emp);
}

class Salesman extends EmployeeType {
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}

class Manager extends EmployeeType {
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}

public class Latihan3_CleanCode {
    public static void main(String[] args) {
        Employee emp = new Employee();
        EmployeeType salesman = new Salesman();
        System.out.println("Program berjalan sukses setelah refactoring!");
        System.out.println("Gaji Salesman hasil polymorphism: " + salesman.payAmount(emp));
    }
}