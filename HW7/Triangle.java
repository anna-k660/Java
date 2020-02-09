package com.epam.HW7;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double calcArea (int a, int b, int c){
        double halfPerimeter = (a + b + c) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                " area= " + calcArea(a, b, c);
    }
}
