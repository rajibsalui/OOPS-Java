package OOPS.Class_Objects;

public class staticExample {
    static int count = 0;  // static variable

    staticExample() {
        count++;  // Incrementing static variable
    }

    static void showCount() {  // static method
        System.out.println("Count is: " + count);
    }
}
 class Test2{
    static int add(int a, int b) {
        return a + b;
    }

}
class Test {
    public static void main(String[] args) {
        staticExample obj1 = new staticExample();
        staticExample obj2 = new staticExample();
        staticExample obj3 = new staticExample();

        staticExample.showCount();  // Accessing static method and variable

        System.out.println(Test2.add(10, 20));  // Accessing static method
    }
}
