package OOPS.Inheritance.Office;

public class Accounts extends Office {
    String department;

    public Accounts(String empCode, String empName, String address, String phNo, double basicPay, String position,
            String department) {
        super(empCode, empName, address, phNo, basicPay, position);
        this.department = department;
    }

    @Override
    public void displaySalaryStatement() {
        super.displaySalaryStatement();
        System.out.println("Department: " + department);
    }
}
