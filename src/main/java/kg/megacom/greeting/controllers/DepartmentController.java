package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Department;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController implements CrudMethods<Department> {


    @Override
    public List<Department> findAll() {
        return null;
    }

    @Override
    public Department getById(Long id) {
        return null;
    }

    @Override
    public Department save(Department department) {
        return null;
    }

    @Override
    public Department update(Department department) {
        return null;
    }

    @Override
    public Department remove(Long id) {
        return null;
    }
}
