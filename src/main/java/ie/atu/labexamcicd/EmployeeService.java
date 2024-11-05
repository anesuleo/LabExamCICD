package ie.atu.labexamcicd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List addEmployee(Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

    public List updateEmployee(Employee employee) {
        for (Employee e : employeeList) {
            if (Objects.equals(e, employee)) {
                employee.setEmployeeCode();
                employee.setName();
                employee.setEmail();
                employee.setPosition();
                employee.setDate();
            }
        }
        return employeeList;
    }

    public List deleteEmployee(String employee) {
        for (Employee e : employeeList) {
            if (Objects.equals(e, employee)) {
                employeeList.remove(e);
            }
        }
        return employeeList;
    }
}