package ie.atu.labexamcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getEmployee")
    public List<Employee> getEmployee(){
        return employeeService.getEmployeeList();
    }

    @PostMapping("/addEmployee")
    public List<Employee> addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employeeService.getEmployeeList();
    }

}
