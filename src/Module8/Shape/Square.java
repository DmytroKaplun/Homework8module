package Module8.Shape;

import Module8.OperateShape;

public class Square extends Shape {
    public Square(String name) {
        super(name);
    }

    public Square(String name, int side1, int side2) {
        super(name, side1, side2);
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
}
