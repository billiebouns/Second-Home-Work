package Painter;

import Figure.Circle;
import Figure.Cube;
import Figure.Figure;
import Figure.Rectangle;
import java.util.ArrayList;

public class Painter {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add( new Circle(10.5));
        figures.add(new Cube(10,10,10));
        figures.add(new Rectangle(5,10));
        for(Figure i:figures){
            i.draw();
        }

    }
}
