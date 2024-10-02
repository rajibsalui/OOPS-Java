package OOPS.Inheritance;


// multiple inheritance
public class Shape {
    public void area() {
        System.out.println("Area of shape");
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println("Area of circle: "+3.14*r*r);
    }
}
class Triangle extends Shape{
    public void area(int l,int b){
        System.out.println("Area of Triangle: "+0.5*l*b);
    }
}
class Rectangle extends Shape{
    public void area(int l,int b){
        System.out.println("Area of Rectangle: "+l*b);
    }
}
class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(5);
        Triangle t = new Triangle();
        t.area(5, 6);
        Rectangle r = new Rectangle();
        r.area(5, 6);
    }
}