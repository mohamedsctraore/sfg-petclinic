package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by mohamed on 12/9/18.
 */
public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
