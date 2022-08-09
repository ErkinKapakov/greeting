package kg.megacom.greeting.controllers.base;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CrudMethods<T> {

    @GetMapping("/all")
    public List<T> findAll();

    @GetMapping("/{id}")
    public T getById(@PathVariable Long id);

    @PostMapping("/save")
    public T save(@RequestBody T t);

    @PutMapping("/update")
    public T update(@RequestBody T t);

    @DeleteMapping("/delete")
    public T remove(@PathVariable Long id);

}
