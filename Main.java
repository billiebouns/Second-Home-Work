package com.company;

import Painter.Painter;
import Figure.Circle;
import Figure.Cube;
import Figure.Rectangle;

public class Main {

    public static void main(String[] args) {
        Painter cube = new Cube(10,10,10);
        Painter rectangle= new Rectangle(10,5);
        Painter circle = new Circle(5.2);
        circle.draw();
        rectangle.draw();
        cube.draw();
    }
}
