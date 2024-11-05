package ie.atu.labexamcicd;

import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/updateEmployee")
    public  List<Employee> updateEmployee(@RequestBody Employee employee){
        return employeeService.getEmployeeList();
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public List<Employee> deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
        return employeeService.getEmployeeList();
    }


}
