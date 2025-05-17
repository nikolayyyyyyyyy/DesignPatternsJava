package visitor_pattern.contracts;

import visitor_pattern.models.Consultant;
import visitor_pattern.models.Manager;
import visitor_pattern.models.NormalEmployee;

public interface EmployeeVisitor {

    String visit(NormalEmployee normalEmployee);

    String visit(Consultant consultant);

    String visit(Manager manager);
}
