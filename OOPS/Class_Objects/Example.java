//call by reference example
package OOPS.Class_Objects;

class Example {
    int data = 50;
    void changeObject(Example ob) {
        ob.data = ob.data + 10;  // Change the original object
    }
    public static void main(String[] args) {
        Example obj = new Example();
        obj.changeObject(obj);  // Passing the reference of obj
        System.out.println("Value of data: " + obj.data);  // Data is now 60
    }
}