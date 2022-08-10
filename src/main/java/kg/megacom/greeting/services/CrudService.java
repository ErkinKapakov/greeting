package kg.megacom.greeting.services;

import kg.megacom.greeting.models.Position;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {
    T save(T t);
    T update(T t);

    void deleteById(Long id);

    Optional<T> findById(Long id);
    List<T> findAll();
}
