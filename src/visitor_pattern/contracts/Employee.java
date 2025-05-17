package visitor_pattern.contracts;

public interface Employee {

    double getSalary();

    String accept(EmployeeVisitor visitor);
}
