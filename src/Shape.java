/**
 * Created by jc258876 on 20/04/15.
 */
public abstract class Shape {
    protected int x, y;

    public Shape(){
        x = y = 0;
    }

    public abstract boolean hit(int x, int y);

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void resize(float ratio) {
        this.x *= ratio;
        this.y *= ratio;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
