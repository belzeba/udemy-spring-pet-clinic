package udemy.spring.course.petclinic.services.map;

import udemy.spring.course.petclinic.model.Owner;
import udemy.spring.course.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created by Ari on 06.09.2018
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}
