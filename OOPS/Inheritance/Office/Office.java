package OOPS.Inheritance.Office;

public class Office extends Employee {
    String position;


    public Office(String empCode, String empName, String address, String phNo, double basicPay,
                    String position) {
        super(empCode, empName, address, phNo, basicPay);
        this.position = position;
    }

    @Override
    public void displaySalaryStatement() {
        super.displaySalaryStatement();
        System.out.println("Position: " + position);

    }
}
