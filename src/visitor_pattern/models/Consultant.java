package visitor_pattern.models;

import visitor_pattern.contracts.Employee;
import visitor_pattern.contracts.EmployeeVisitor;

public class Consultant implements Employee {
    private final double salary;

    public Consultant(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String accept(EmployeeVisitor visitor) {
        return visitor.visit(this);
    }
}
