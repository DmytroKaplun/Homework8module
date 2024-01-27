package Module8;

import Module8.Shape.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ShapeExecutor {

    public static void main(String[] args) {
     Shape circle = new Circle("circle");
     Shape quad = new Quad("quad");git add
     Shape rectangle = new Rectangle("rectangle");
     Shape square = new Square("square");
     Shape triangle = new Triangle("an equilateral triangle", 4, 5, 8);

     print(circle);
     print(quad);
     print(rectangle);
     print(square);
     print(triangle);
        System.out.println(triangle.getArea());
    }

    private static void print(Shape shape) {
     System.out.println(shape.toString());
    }
}