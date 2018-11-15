package udemy.spring.course.petclinic.services.map;

import org.springframework.stereotype.Service;
import udemy.spring.course.petclinic.model.Specialty;
import udemy.spring.course.petclinic.model.Vet;
import udemy.spring.course.petclinic.services.SpecialtyService;
import udemy.spring.course.petclinic.services.VetService;

import java.util.Set;

/**
 * Created by Ari on 06.09.2018
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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

        // Check that specialty is persisted. If not, then persist.
        if (!object.getSpecialties().isEmpty()) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
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
