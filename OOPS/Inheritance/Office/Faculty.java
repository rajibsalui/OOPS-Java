package OOPS.Inheritance.Office;

public class Faculty extends Teaching{
    String researchArea;


    public Faculty(String empCode, String empName, String address, String phNo, double basicPay,
                    String subjectSpecialization, String designation, String researchArea) {
        super(empCode, empName, address, phNo, basicPay,subjectSpecialization, designation);
        this.researchArea = researchArea;
    }

    @Override
    public void displaySalaryStatement() {
        super.displaySalaryStatement();
        System.out.println("Research Area: " + researchArea);

    }
}
