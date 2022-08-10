package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Department;
import kg.megacom.greeting.models.Position;
import kg.megacom.greeting.services.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController implements CrudMethods<Department> {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @Override
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @Override
    public Optional<Department> getById(Long id) {
        return departmentService.findById(id);
    }

    @Override
    public Department save(Department department) {
        return departmentService.save(department);
    }

    @Override
    public Department update(Department department) {
        return departmentService.save(department);
    }

    @Override
    public void deleteById(Long id) {
        departmentService.deleteById(id);
    }
}
