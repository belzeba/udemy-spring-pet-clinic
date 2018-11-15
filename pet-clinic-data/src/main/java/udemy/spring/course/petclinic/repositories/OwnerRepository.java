package udemy.spring.course.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.spring.course.petclinic.model.Owner;

/**
 * Created by Ari on 15.11.2018
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
