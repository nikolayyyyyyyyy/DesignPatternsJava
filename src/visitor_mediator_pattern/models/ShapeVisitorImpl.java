package visitor_mediator_pattern.models;

import visitor_mediator_pattern.contracts.ShapeVisitor;

public class ShapeVisitorImpl implements ShapeVisitor {
    @Override
    public String visit(Circle circle) {
        double radius = Math.pow(circle.gerRadius(), 2) * 3.14;
        return String.format("Circle area: %.2f", radius);
    }

    @Override
    public String visit(Rectangle rectangle) {
        double area = rectangle.getLength() * rectangle.getWidth();
        return String.format("Rectangle area: %.2f", area);
    }

    @Override
    public String visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        return String.format("Triangle area: %.2f", area);
    }
}
