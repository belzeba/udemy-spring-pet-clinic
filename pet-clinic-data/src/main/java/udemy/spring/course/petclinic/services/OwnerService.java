package udemy.spring.course.petclinic.services;

import udemy.spring.course.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by Ari on 06.09.2018
 */
public interface OwnerService {

    Owner findByLasName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
