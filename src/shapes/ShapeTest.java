package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        //test
        rectangle rectangle = new rectangle(4, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        square square = new square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        // New test with abstract classes
        Measurable myShape = new square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myRectangleShape = new rectangle(4, 5);
        System.out.println(myRectangleShape.getArea());
        System.out.println(myRectangleShape.getPerimeter());
    }
}