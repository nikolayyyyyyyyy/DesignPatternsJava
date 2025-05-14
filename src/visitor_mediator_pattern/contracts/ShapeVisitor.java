package visitor_mediator_pattern.contracts;

import visitor_mediator_pattern.models.Circle;
import visitor_mediator_pattern.models.Rectangle;
import visitor_mediator_pattern.models.Triangle;

public interface ShapeVisitor {

    String visit(Circle circle);

    String visit(Rectangle rectangle);

    String visit(Triangle triangle);
}
