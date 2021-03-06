package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //test
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        // New test with abstract classes
        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myRectangleShape = new Rectangle(4, 5);
        System.out.println(myRectangleShape.getArea());
        System.out.println(myRectangleShape.getPerimeter());
    }
}