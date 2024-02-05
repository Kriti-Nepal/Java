package models;

public class RC_main {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 4);
            System.out.println("Rectangle Area: " + rectangle.area());
            System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

            Cuboid cuboid = new Cuboid(3, 4, 5);
            System.out.println("Cuboid Volume: " + cuboid.volume());
            System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());
        }
    }
