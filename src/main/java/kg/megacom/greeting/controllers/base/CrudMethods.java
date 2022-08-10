package kg.megacom.greeting.controllers.base;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface CrudMethods<T> {

    @GetMapping("/all")
    List<T> findAll();

    @GetMapping("/{id}")
    Optional<T> getById(@PathVariable Long id);

    @PostMapping("/save")
    T save(@RequestBody T t);

    @PutMapping("/update")
    T update(@RequestBody T t);

    @DeleteMapping("/delete")
    void deleteById(@PathVariable Long id);

}
