package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Owner;

/**
 * Created by mohamed on 12/9/18.
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
