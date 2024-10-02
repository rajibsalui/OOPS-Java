package OOPS.Inheritance.Office;

public class Technical extends Teaching{
    String techexpertArea;


    public Technical(String empCode, String empName, String address, String phNo, double basicPay,
                   String subjectSpecialization, String designation, String techexpertArea) {
        super(empCode, empName, address, phNo, basicPay,subjectSpecialization, designation);
        this.techexpertArea = techexpertArea;
    }

    @Override
    public void displaySalaryStatement() {
        super.displaySalaryStatement();
        System.out.println("Tech Expert Area: " + techexpertArea);

    }
}