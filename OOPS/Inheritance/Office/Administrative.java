package OOPS.Inheritance.Office;

public class Administrative extends Office {
    String role;

    public Administrative(String empCode, String empName, String address, String phNo, double basicPay, String position,
            String role) {
        super(empCode, empName, address, phNo, basicPay, position);
        this.role = role;
    }

    @Override
    public void displaySalaryStatement() {
        super.displaySalaryStatement();
        System.out.println("Role: " + role);
    }
}
