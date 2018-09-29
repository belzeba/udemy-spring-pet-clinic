package udemy.spring.course.petclinic.services.map;

import udemy.spring.course.petclinic.model.Vet;
import udemy.spring.course.petclinic.services.VetService;

import java.util.Set;

/**
 * Created by Ari on 06.09.2018
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
