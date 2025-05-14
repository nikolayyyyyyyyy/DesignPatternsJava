package visitor_mediator_pattern.contracts;

public interface Shape {

    String accept(ShapeVisitor shapeVisitor);

    String draw();
}
