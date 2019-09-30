package com.company;

import java.util.Arrays;

public class Streams {
    public static void main(String[] args){
        Shape[] shapes = new Shape[]{
                new Square(1),
                new Square(2),

                // Next line won't compile
                //new Shape("Square"),

                new Circle(2)
        };

        System.out.println("Create new set of squares with side length of original areas, and then print");
        Arrays.stream(shapes)
                .filter(s -> s instanceof Square)
                .map(s -> new Square((int) s.getArea()))
                .forEach(Shape::print);
    }
}
