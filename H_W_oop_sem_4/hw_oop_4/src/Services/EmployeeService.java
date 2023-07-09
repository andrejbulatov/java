package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;

public class EmployeeService implements iPersonService <Employee> {

    private int count;
    private List <Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public void create(String firstName, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }    
}
