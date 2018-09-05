package udemy.spring.course.petclinic.services;

import udemy.spring.course.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by Ari on 06.09.2018
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
