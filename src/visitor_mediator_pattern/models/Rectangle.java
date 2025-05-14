package visitor_mediator_pattern.models;

import visitor_mediator_pattern.contracts.Shape;
import visitor_mediator_pattern.contracts.ShapeVisitor;

public class Rectangle implements Shape {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String accept(ShapeVisitor shapeVisitor) {
        return shapeVisitor.visit(this);
    }

    @Override
    public String draw() {
        return "Drawing rectangle.";
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
