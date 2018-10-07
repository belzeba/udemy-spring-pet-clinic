package udemy.spring.course.petclinic.services.map;

import org.springframework.stereotype.Service;
import udemy.spring.course.petclinic.model.Specialty;
import udemy.spring.course.petclinic.services.SpecialtyService;

import java.util.Set;

/**
 * Created by Ari on 07.10.2018
 */
@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
