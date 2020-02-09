package com.epam.HW7;

public class Circle extends Shape {
   // private String shape = "circle";
    private int radius;
    private final double PI = 3.14;

    public Circle( String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calcArea (int radius){
        double area = PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return  "circle: " +
                super.toString() + "; " +
                " radius= " + radius + "; " +
                " area = " + calcArea(radius);
    }
}
