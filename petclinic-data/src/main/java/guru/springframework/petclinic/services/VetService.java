package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by mohamed on 12/9/18.
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
