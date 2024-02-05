package models;

public class Cuboid extends Rectangle{

        private double height;

        public Cuboid(double length, double width, double height) {
            super(length, width);
            this.height = height;
        }

        public double volume() {
            return length * width * height;
        }

        public double surfaceArea() {
            return 2 * (length * width + length * height + width * height);
        }
    }

