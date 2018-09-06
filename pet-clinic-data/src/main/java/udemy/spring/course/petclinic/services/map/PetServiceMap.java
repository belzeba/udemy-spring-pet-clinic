package udemy.spring.course.petclinic.services.map;

import udemy.spring.course.petclinic.model.Pet;
import udemy.spring.course.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created by Ari on 06.09.2018
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
