/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private List<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<Employee>();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}