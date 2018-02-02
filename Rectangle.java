package Figure;

public class Rectangle extends Figure{
    private int width;
    private int height;

    public Rectangle(int width,int height){
        this.height=height;
        this.width= width;
    }
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
