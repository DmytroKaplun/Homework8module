package Module8.Shape;

import Module8.OperateShape;

public class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    public Circle(String name, int radius) {
        super(name, radius);
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }
}
