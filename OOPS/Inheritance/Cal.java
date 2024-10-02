package OOPS.Inheritance;



public class Cal {
    void show(){
        System.out.println("in A");
    }
}
class Calc extends Cal{

    void show(){
        System.out.println("in B");
    }
}
class MethodOverriding {
    public static void main(){
        Calc ob=new Calc();
        ob.show();
        Cal obj=new Cal();
        obj.show();
    }

}
