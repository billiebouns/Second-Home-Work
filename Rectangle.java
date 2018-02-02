package Figure;

import Painter.Painter;

public class Rectangle extends Painter{
    private int width;
    private int height;

    public Rectangle(int width,int height){
        this.height=height;
        this.width= width;
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("Rectangle");
    }
}
