package com.epam.HW7;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int calcArea(int width, int height){
        int area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                super.toString() +
                ", width=" + width +
                ", height=" + height +
                " area= " + calcArea(width, height);
    }
}
