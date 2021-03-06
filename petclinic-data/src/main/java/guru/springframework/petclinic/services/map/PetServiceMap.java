package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by mohamed on 12/12/18.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
