package OOPS.Inheritance.Office;


import OOPS.Inheritance.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OfficeDatabase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Employee Details:");
        System.out.print("Employee Code: ");
        String empCode = reader.readLine();
        System.out.print("Employee Name: ");
        String empName = reader.readLine();
        System.out.print("Address: ");
        String address = reader.readLine();
        System.out.print("Phone Number: ");
        String phNo = reader.readLine();
        System.out.print("Basic Pay: ");
        double basicPay = Double.parseDouble(reader.readLine());

        System.out.println("\nEnter your choice");
        System.out.println("1. Teaching");
        System.out.println("2. Office");
        int choice = Integer.parseInt(reader.readLine());

        switch (choice) {
            case 1:
                System.out.println("\nEnter Teaching Details:");
                System.out.print("Subject Specialization: ");
                String subjectSpecialization = reader.readLine();
                System.out.print("Designation: ");
                String designation = reader.readLine();
                System.out.println("\nEnter your choice");
                System.out.println("1. Faculty");
                System.out.println("2. Technical");
                int ch = Integer.parseInt(reader.readLine());
                if (ch==1){
                    //Teaching teachingEmployee = new Teaching(empCode, empName, address, phNo, basicPay, subjectSpecialization, designation);
                    System.out.println("\nEnter your Research Area:");
                    String researchArea = reader.readLine();
                    Faculty faculty = new Faculty(empCode, empName, address, phNo, basicPay, subjectSpecialization, designation, researchArea);
                    System.out.println("\nFaculty Employee Salary Statement:");


                   // teachingEmployee.displaySalaryStatement();
                    faculty.displaySalaryStatement();
                }else if(ch==2){
                    //Teaching teachingEmployee = new Teaching(empCode, empName, address, phNo, basicPay, subjectSpecialization, designation);
                    System.out.println("\nEnter your Tech Expert Area:");
                    String techexpertArea = reader.readLine();
                    Technical technical = new Technical(empCode, empName, address, phNo, basicPay, subjectSpecialization, designation, techexpertArea);
                    System.out.println("\nTechnical Employee Salary Statement:");
                    //teachingEmployee.displaySalaryStatement();
                    technical.displaySalaryStatement();
                }
                else {
                    System.out.println("Invalid choice");
                }

                break;
            case 2:
                System.out.println("\nEnter Office Details:");
                System.out.print("Enter the position ");
                String position = reader.readLine();
                System.out.println("\nEnter your choice");
                System.out.println("1. Administrative");
                System.out.println("2. Accounts");
                int ch1 = Integer.parseInt(reader.readLine());
                if (ch1==1) {

                    System.out.println("\nEnter your Role:");
                    String role = reader.readLine();
                    Administrative admin = new Administrative(empCode, empName, address, phNo, basicPay, position, role);
                    System.out.println("\nAdministrative Employee Salary Statement:");
                    admin.displaySalaryStatement();
                }
                else if(ch1==2){
                    System.out.println("\nEnter your Department:");
                    String department = reader.readLine();
                    Accounts accounts = new Accounts(empCode, empName, address, phNo, basicPay, position, department);
                    System.out.println("\nAccounts Employee Salary Statement:");
                    accounts.displaySalaryStatement();
                }
                else {
                    System.out.println("Invalid choice");
                }
//                Office ob = new Office(empCode, empName, address, phNo, basicPay, position);
//                System.out.println("\nOffice Employee Salary Statement:");
//                ob.displaySalaryStatement();
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
}