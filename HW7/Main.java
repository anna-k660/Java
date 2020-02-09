package com.epam.HW7;

public class Main {

    public static void main (String[] args){
      
        Shape [] shapes = {
            new Rectangle("red", 5, 10),
            new Rectangle("black", 20, 7),
            new Rectangle("white", 17, 3),
            new Rectangle("black", 10, 30),
            new Circle("yellow", 10),
            new Circle("purple", 17),
            new Circle("white", 12),
            new Triangle("blue", 4, 5, 6),
            new Triangle("red", 10, 20, 20)
        };
        for (Shape shape: shapes) {
            System.out.println(shape);
        }

    }

}
