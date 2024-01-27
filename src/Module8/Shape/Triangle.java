package Module8.Shape;
import java.lang.Math;
import Module8.OperateShape;

public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    public Triangle(String name, int side1, int side2, int side3) {
        super(name, side1, side2, side3);
    }

    @Override
    public double getArea() {
        double perimeter = (side1 + side2 + side3) / 2.0;
        double temp = perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3);
        return Math.sqrt(temp);
    }
}
