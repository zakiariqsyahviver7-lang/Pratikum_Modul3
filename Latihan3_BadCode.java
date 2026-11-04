class EmployeeType {
    public static final int ENGINEER = 1;
    public static final int SALESMAN = 2;
    public static final int MANAGER = 3;
}

public class Latihan3_BadCode {
    int _monthlySalary = 5000;
    int _commission = 1000;
    int _bonus = 2000;
    int type = EmployeeType.SALESMAN;

    int getType() { return type; }

    int payAmount() throws Exception {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return _monthlySalary;
            case EmployeeType.SALESMAN:
                return _monthlySalary + _commission;
            case EmployeeType.MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new Exception("Incorrect Employee");
        }
    }

    public static void main(String[] args) throws Exception {
        Latihan3_BadCode emp = new Latihan3_BadCode();
        System.out.println("Menyiapkan Bad Code...");
        System.out.println("Gaji (Bad Code): " + emp.payAmount());
    }
}