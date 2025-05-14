package visitor_mediator_pattern.models;

import visitor_mediator_pattern.contracts.Mediator;
import visitor_mediator_pattern.contracts.Shape;
import visitor_mediator_pattern.contracts.ShapeVisitor;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
    List<Shape> shapes;
    private final ShapeVisitor visitor;

    public MediatorImpl(ShapeVisitor shapeVisitor) {

        this.shapes = new ArrayList<>();
        this.visitor = shapeVisitor;
    }

    @Override
    public String drawAllShapes() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Shape s :
                this.shapes) {
            stringBuilder.append(s.draw()).append("\n");
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public String calcAreaOfShapes() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Shape s :
                this.shapes) {
            stringBuilder.append(s.accept(visitor)).append("\n");
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }
}
