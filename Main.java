package models;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle is: " + circle.area());
        System.out.println("Circumference of Circle: " + circle.Circumference());

        Cylinder cylinder = new Cylinder(5,10);
        System.out.println("Cylinder volume is: " + cylinder.volume());
        System.out.println("Cylinder area is: " + cylinder.area());
        System.out.println("Cylinder circumference is: " + cylinder.Circumference());
    }
}