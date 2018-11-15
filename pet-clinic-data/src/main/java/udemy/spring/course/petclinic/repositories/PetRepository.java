package udemy.spring.course.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.spring.course.petclinic.model.Pet;

/**
 * Created by Ari on 15.11.2018
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
