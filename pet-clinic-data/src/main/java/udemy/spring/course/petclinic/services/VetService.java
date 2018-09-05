package udemy.spring.course.petclinic.services;

import udemy.spring.course.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by Ari on 06.09.2018
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
