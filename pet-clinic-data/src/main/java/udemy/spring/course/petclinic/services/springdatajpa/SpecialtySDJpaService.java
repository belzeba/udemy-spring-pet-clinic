package udemy.spring.course.petclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import udemy.spring.course.petclinic.model.Specialty;
import udemy.spring.course.petclinic.repositories.SpecialtyRepository;
import udemy.spring.course.petclinic.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ari on 15.11.2018
 */
@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);

        return specialties;
    }

    @Override
    public Specialty findById(Long id) {
        return specialtyRepository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return specialtyRepository.save(specialty);
    }

    @Override
    public void delete(Specialty specialty) {
        specialtyRepository.delete(specialty);
    }

    @Override
    public void deleteById(Long id) {
        specialtyRepository.deleteById(id);
    }
}
