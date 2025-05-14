package visitor_mediator_pattern.contracts;

public interface Mediator {

    String drawAllShapes();

    String calcAreaOfShapes();

    void addShape(Shape shape);
}
