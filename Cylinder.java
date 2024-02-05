package models;

public class Cylinder extends Circle {
    double height;

    public Cylinder (double r, double height){
        super(r);
        this.height = height;
    }
    public double volume(){
        return area()*height;
    }
}
