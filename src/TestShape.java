/**
 * Created by jc258876 on 20/04/15.
 */
public class TestShape {
    public static void main(String[] args) {
        System.out.println("Test 1: create circle");
        Shape shape = new Circle(10);
        check("(0,0) radius: 10", shape);

        System.out.println("Test 2: hit method");
        shape = new Circle(20);

        boolean hit = shape.hit(10,10);
        check("true", hit);

        hit = shape.hit(50,50);
        check("false", hit);

        System.out.println("Test 3: create rectangle");
        Shape rect = new Rectangle(10, 10);
        check("(0,0) [10,10]", rect);

        System.out.println("Test 4: hit rectangle with (5,5)");
        hit = rect.hit(5,5);
        check("true", hit);

        System.out.println("Test 5: hit rectangle with (100,5)");
        hit = rect.hit(100,5);
        check("false", hit);

        System.out.println("Test 6: hit rectangle with (5, -100)");
        hit = rect.hit(5,-100);
        check("false", hit);

        System.out.println("Test 7: move");
        rect.move(7,8);
        check("(7,8)[10,10]", rect);

        System.out.println("Test 8: resize circle");
        Shape circle = new Circle(10);
        circle.resize(0.5f);
        check("(0,0) radius: 5", circle);

        System.out.println("Test 9: resize rectangle");
        Shape rectangle = new Rectangle(100, 50);
        rectangle.resize(0.5f);
        check("(0,0) [50,25]", rectangle);


    }

    private static void check(String expected, Object actual) {
        String message = String.format("expected: %s actual: %s", expected, actual);
        System.out.println(message);
    }
}
