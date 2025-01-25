package OOPS.Class_Objects;


class A1{
    void display(){
        System.out.println("in A1");
    }
    public class B1{
        void config(){
            System.out.println("in B1");
        }
    }
}
public class InnerClass {
    public static void main(String[]args){
        A1 ob=new A1();
        ob.display();
        A1.B1 obj=  ob.new B1();  // Create inner class object
        obj.config();
    }
}
