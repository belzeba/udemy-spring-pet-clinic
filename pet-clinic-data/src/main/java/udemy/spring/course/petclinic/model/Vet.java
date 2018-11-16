package udemy.spring.course.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialties = new HashSet<>();

    public Vet() {
    }

    public Vet(Set<Specialty> specialties) {
        this.specialties = specialties;
    }

    public Vet(Long id, String firstName, String lastName, Set<Specialty> specialties) {
        super(id, firstName, lastName);
        this.specialties = specialties;
    }

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }

    public static VetBuilder builder() {
        return new VetBuilder();
    }

    public static class VetBuilder {
        private Set<Specialty> specialties;

        VetBuilder() {
        }

        public VetBuilder specialties(Set<Specialty> specialties) {
            this.specialties = specialties;
            return this;
        }

        public Vet build() {
            return new Vet(specialties);
        }

        public String toString() {
            return "Vet.VetBuilder(specialties=" + this.specialties + ")";
        }
    }
}
