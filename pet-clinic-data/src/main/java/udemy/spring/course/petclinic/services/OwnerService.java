package udemy.spring.course.petclinic.services;

import udemy.spring.course.petclinic.model.Owner;

/**
 * Created by Ari on 06.09.2018
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLasName(String lastName);

}
