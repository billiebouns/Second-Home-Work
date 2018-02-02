package Figure;

public class Circle extends Figure {

    private double lenght;

    public Circle( double lenght){
        this.lenght= lenght;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
