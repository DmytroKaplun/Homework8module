package Module8.Shape;

import Module8.OperateShape;

import java.util.Objects;

public abstract class Shape implements OperateShape {
    protected int side1, side2, side3;
    protected String name;
    protected int radius;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Shape(String name) {
        this.name = name;
    }

    public Shape(String name, int radius) {
        this(name);
        this.radius = radius;
    }

    public Shape(String name, int side1, int side2) {
        this(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    public Shape(String name, int side1, int side2, int side3) {
        this(name, side1, side2);
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "This geometric figure is " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape shape)) return false;
        return side1 == shape.side1 && side2 == shape.side2 && radius == shape.radius && Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, name, radius);
    }
}
