package models;

public class Circle {
     double r;

    public Circle(double r){
        this.r= r  ;
    }

    public double pi = 3.14;
    public double area(){
        return Math.PI*r*r;
  }
  public double Circumference(){
        return 2*pi*r;
  }

}
