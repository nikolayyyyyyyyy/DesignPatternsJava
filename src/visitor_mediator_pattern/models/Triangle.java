package visitor_mediator_pattern.models;

import visitor_mediator_pattern.contracts.Shape;
import visitor_mediator_pattern.contracts.ShapeVisitor;

public class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String accept(ShapeVisitor shapeVisitor) {
        return shapeVisitor.visit(this);
    }

    @Override
    public String draw() {
        return "Drawing triangle.";
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}
