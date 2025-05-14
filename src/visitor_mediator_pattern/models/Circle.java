package visitor_mediator_pattern.models;

import visitor_mediator_pattern.contracts.Shape;
import visitor_mediator_pattern.contracts.ShapeVisitor;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String accept(ShapeVisitor shapeVisitor) {
        return shapeVisitor.visit(this);
    }

    @Override
    public String draw() {
        return "Drawing circle.";
    }

    public double gerRadius() {
        return this.radius;
    }
}
