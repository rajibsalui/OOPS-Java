package OOPS.Class_Objects;

import java.util.Scanner;

public class class1 {

    public void display(Student s)
    {
        System.out.println("Roll: "+s.roll);
        System.out.println("Name: "+s.name);
        System.out.println("Marks: "+s.marks);
        System.out.println("College Name: "+s.clgName);
        System.out.println("Total Students: "+s.countStud);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        //object 1
        Student s1=new Student(115,"Raj",99);
        class1 c1 = new class1();
        c1.display(s1);
//
//        s1.roll=1;
//        s1.name="John";
//        s1.marks=90;
//        display(s1);
//
//        //object 2
       Student s2=new Student(116,"rohan",98);

        c1.display(s2);
//        s2.roll=15;
//        s2.name="Raj";
//        s2.marks=99;
//        display(s2);

        Student s3=new Student(117,"rohit",97);

        c1.display(s3);

        //using setters
//        System.out.println("Enter the name: ");
//        s1.setNames(sc.nextLine());
//        //System.out.println(s1.name);
//
//        System.out.println("Enter the roll: ");
//        s1.setRoll(sc.nextInt());
//        //System.out.println(s1.roll);
//
//        System.out.println("Enter the marks: ");
//        s1.setMarks(sc.nextInt());
//        //System.out.println(s1.marks);
//
//        display(s1);
//        display(s2);
//        display(s3);

    }
}
