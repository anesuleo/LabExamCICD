package ie.atu.labexamcicd;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    public String employeeCode;
    @Size(max = 100)
    public String name;
    @Email
    public String email;
    public String position;
    @Positive
    public Double salary;
    @PastOrPresent
    public Date date;
}
