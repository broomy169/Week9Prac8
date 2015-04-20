/**
 * Created by jc258876 on 20/04/15.
 */
public class Rectangle extends Shape{
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean hit(int x, int y) {
        boolean checkHorizontal = Math.abs(this.x - x) <= this.width;
        boolean checkVertical = Math.abs(this.y - y) <= this.height;
        return checkHorizontal && checkVertical;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void resize(float ratio) {
        this.width *=ratio;
        this.height *= ratio;
    }

    @Override
    public String toString() {
        return String.format("%s [%d,%d]", super.toString(), this.width, this.height);
    }

}
