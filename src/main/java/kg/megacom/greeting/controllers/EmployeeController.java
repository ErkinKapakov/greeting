package kg.megacom.greeting.controllers;

import kg.megacom.greeting.models.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/{name}")
    public Employee getEmployee(@PathVariable String name){
        Employee employee = new Employee(1, name, "Kapakov");
        return employee;
    }

    @GetMapping()
    public Employee get(@RequestParam String name){
        Employee employee = new Employee(1, name, "Kanimetov");
        return employee;
    }
}
