package kg.megacom.greeting.controllers.base;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CrudMethods<T> {

    @GetMapping("/all")
    List<T> findAll();

    @GetMapping("/{id}")
    T getById(@PathVariable Long id);

    @PostMapping("/save")
    T save(@RequestBody T t);

    @PutMapping("/update")
    T update(@RequestBody T t);

    @DeleteMapping("/delete")
    T remove(@PathVariable Long id);

}
