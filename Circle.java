package Figure;

import Painter.Painter;

public class Circle extends Painter {
    private int diametr;
    private double pi;
    private double lenght = diametr * pi;

    public Circle( double lenght){
        this.lenght= lenght;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle");
    }
}
