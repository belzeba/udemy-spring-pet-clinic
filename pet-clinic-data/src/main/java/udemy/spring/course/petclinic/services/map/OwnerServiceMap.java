package udemy.spring.course.petclinic.services.map;

import org.springframework.stereotype.Service;
import udemy.spring.course.petclinic.model.Owner;
import udemy.spring.course.petclinic.services.OwnerService;

import java.util.Set;

/**
 * Created by Ari on 06.09.2018
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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

    @Override
    public Owner findByLasName(String lastName) {
        return null;
    }
}
