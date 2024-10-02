package OOPS.Inheritance;


//multilevel inheritance
public class A  {
    public A(){
        super();
        System.out.println("A");
    }
    A(int n){
        super();
        System.out.println("A int");
    }
}
class B extends A {
    B() {
        super();
        System.out.println("B");
    }

    B(int n) {
        this();
        System.out.println("B int");
    }
}
class AB{
    public static void main(String[]args){
        B ob=new B(5);
    }
}
