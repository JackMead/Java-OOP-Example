package com.company;

public class Inheritance {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Square(4),
                new Square(3),

                // Next line won't compile
                //new Shape("Square"),

                new Circle(2)
        };

        System.out.println("Squares");
        for (Shape shape : shapes) {
            if (isSquare(shape)) {
                shape.print();
            }
        }

        System.out.println("\nPrint all");
        for (Shape shape : shapes) {
            shape.print();
        }

    }

    private static boolean isSquare(Shape shape) {
        return shape instanceof Square;
    }
}

abstract class Shape {
    private String name;

    Shape(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public abstract double getArea();

    public void print() {
        System.out.println("This is a " + name + " with area " + getArea());
    }
}

class Square extends Shape {
    private int sideLength;

    Square(int sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }
}

class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

