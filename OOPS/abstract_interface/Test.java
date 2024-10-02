package OOPS.abstract_interface;

abstract class Test {
    abstract void add();
    abstract void sub();
}

class Test2 extends Test {
    void add() {
        System.out.println("Addition1");
    }

    void sub() {
        System.out.println("Subtraction1");
    }
}

class Test3 implements interfaceExample {
    public void add() {
        System.out.println("Addition2");
    }

    public void sub() {
        System.out.println("Subtraction2");
    }
}

class Main {
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.add();
        obj.sub();

        Test3 obj2 = new Test3();
        obj2.add();
        obj2.sub();
    }
}