package visitor_mediator_pattern.models;

import visitor_mediator_pattern.contracts.Mediator;
import visitor_mediator_pattern.contracts.Shape;
import visitor_mediator_pattern.contracts.ShapeVisitor;

public class Application {
    public static void main(String[] args) {
        ShapeVisitor visitor = new ShapeVisitorImpl();
        Mediator mediator = new MediatorImpl(visitor);

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 4);
        Shape triangle = new Triangle(6, 3);

        mediator.addShape(circle);
        mediator.addShape(rectangle);
        mediator.addShape(triangle);

        System.out.println(mediator.calcAreaOfShapes());
        System.out.println(mediator.drawAllShapes());
    }
}