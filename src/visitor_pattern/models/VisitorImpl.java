package visitor_pattern.models;

import visitor_pattern.contracts.EmployeeVisitor;

public class VisitorImpl implements EmployeeVisitor {
    @Override
    public String visit(NormalEmployee normalEmployee) {
        return String.format("Normal Employee bonus: %.2f", normalEmployee.getSalary() + 22);
    }

    @Override
    public String visit(Consultant consultant) {
        return String.format("Consultant bonus: %.2f", consultant.getSalary() + 222);
    }

    @Override
    public String visit(Manager manager) {
        return String.format("Manager bonus: %.2f", manager.getSalary() + 2222);
    }
}
