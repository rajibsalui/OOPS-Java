package OOPS.Inheritance.Office;


public class Employee {
     String empCode;
     String empName;
     String address;
     String phNo;
     double basicPay;

    public Employee(String empCode, String empName, String address, String phNo, double basicPay) {
        this.empCode = empCode;
        this.empName = empName;
        this.address = address;
        this.phNo = phNo;
        this.basicPay = basicPay;
    }

    public double calculateSalary() {
        double da = 0.10 * basicPay;
        double hra = 0.20 * basicPay;
        return basicPay + da + hra;
    }

    public void displaySalaryStatement() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Employee Name: " + empName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phNo);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA (10%): " + (0.10 * basicPay));
        System.out.println("HRA (20%): " + (0.20 * basicPay));
        System.out.println("Total Salary: " + calculateSalary());
    }
}