package Figure;

public class Cube extends Figure{
    private int widht;
    private int height;
    private int depth;

    public Cube(int widht,int height,int depth){
        this.depth= depth;
        this.height= height;
        this.widht = widht;
    }
    @Override
    public void draw() {
        System.out.println("Cube");
    }
}
