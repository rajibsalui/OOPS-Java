package OOPS.Inheritance.Office;


public class Teaching extends Employee {
     String subjectSpecialization;
     String designation;

    public Teaching(String empCode, String empName, String address, String phNo, double basicPay,
                    String subjectSpecialization, String designation) {
        super(empCode, empName, address, phNo, basicPay);
        this.subjectSpecialization = subjectSpecialization;
        this.designation = designation;
    }

    @Override
    public void displaySalaryStatement() {
        super.displaySalaryStatement();
        System.out.println("Subject Specialization: " + subjectSpecialization);
        System.out.println("Designation: " + designation);
    }
}


