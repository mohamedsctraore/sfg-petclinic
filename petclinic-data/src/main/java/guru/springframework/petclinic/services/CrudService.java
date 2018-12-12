package guru.springframework.petclinic.services;

import java.util.Set;

/**
 * @author Mohamed Traore
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T save(T object);

    T findById(ID id);

    void delete(T object);

    void deleteById(ID id);
}
