package udemy.spring.course.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.spring.course.petclinic.model.Visit;

/**
 * Created by Ari on 15.11.2018
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
