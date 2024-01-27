package Module8.Shape;

import Module8.OperateShape;

public class Quad extends Shape {
    public Quad(String name) {
        super(name);
    }

    public Quad(String name, int side1, int side2) {
        super(name, side1, side2);
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
}
