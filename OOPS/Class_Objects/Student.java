package OOPS.Class_Objects;

public class Student{
    int roll;
    String name;
    int marks;
    final String clgName = "NSEC";
    static int countStud = 0;

    //constructor
    public Student(int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;

    }
    public static int getCountStud(){
        return countStud++;
    }
//    public String setNames(String name){
//        this.name = name;
//        return name;
//    }
//    public int setRoll(int roll){
//        this.roll = roll;
//        return roll;
//    }
//    public int setMarks(int marks){
//        this.marks = marks;
//        return marks;
//    }
}

