package ie.atu.labexamcicd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee>getEmployeeList(){
        return employeeList;
    }

    public List addEmployee(Employee employee){
        employeeList.add(employee);
        return employeeList;
    }

}
