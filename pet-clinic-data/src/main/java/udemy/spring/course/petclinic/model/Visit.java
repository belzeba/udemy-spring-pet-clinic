package udemy.spring.course.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * Created by Ari on 07.10.2018
 */
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public Visit() {
    }

    public Visit(LocalDate date, String description, Pet pet) {
        this.date = date;
        this.description = description;
        this.pet = pet;
    }

    public Visit(Long id, LocalDate date, String description, Pet pet) {
        super(id);
        this.date = date;
        this.description = description;
        this.pet = pet;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public static VisitBuilder builder() {
        return new VisitBuilder();
    }

    public static class VisitBuilder {
        private LocalDate date;
        private String description;
        private Pet pet;

        VisitBuilder() {
        }

        public VisitBuilder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public VisitBuilder description(String description) {
            this.description = description;
            return this;
        }

        public VisitBuilder pet(Pet pet) {
            this.pet = pet;
            return this;
        }

        public Visit build() {
            return new Visit(date, description, pet);
        }

        public String toString() {
            return "Visit.VisitBuilder(date=" + this.date + ", description=" + this.description + ", pet=" + this.pet + ")";
        }
    }
}
