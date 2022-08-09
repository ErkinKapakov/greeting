package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Department;
import kg.megacom.greeting.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController implements CrudMethods<Department> {

    @Override
    public List<Department> findAll() {
        return Arrays.asList(
                new Department(1L, "Manager dep", true),
                new Department(2L, "Ceo dep", true),
                new Department(3L, "Programmer dep", true),
                new Department(4L, "HR", true)
        );
    }

    @Override
    public Department getById(Long id) {
        return new Department(id, "Ceo dep", true);
    }

    @Override
    public Department save(Department department) {
        department.setId(100L);
        return department;
    }

    @Override
    public Department update(Department department) {
        department.setName("New department");
        return department;
    }

    @Override
    public Department remove(Long id) {
        return new Department(id, "Head ceo", true);
    }
}
