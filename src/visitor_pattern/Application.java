package visitor_pattern;

import visitor_pattern.contracts.Employee;
import visitor_pattern.contracts.EmployeeVisitor;
import visitor_pattern.models.Consultant;
import visitor_pattern.models.Manager;
import visitor_pattern.models.NormalEmployee;
import visitor_pattern.models.VisitorImpl;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        EmployeeVisitor visitor = new VisitorImpl();
        List<Employee> employees = new ArrayList<>();
        employees.add(new NormalEmployee(1500));
        employees.add(new Manager(2400));
        employees.add(new Consultant(2000));

        for (Employee employee :
                employees) {
            System.out.println(employee.accept(visitor));
        }
    }
}
