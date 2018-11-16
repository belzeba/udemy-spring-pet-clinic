package udemy.spring.course.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ari on 07.10.2018
 */
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @Column(name = "description")
    private String description;

    public Specialty() {
    }

    public Specialty(String description) {
        this.description = description;
    }

    public Specialty(Long id, String description) {
        super(id);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static SpecialtyBuilder builder() {
        return new SpecialtyBuilder();
    }

    public static class SpecialtyBuilder {
        private String description;

        SpecialtyBuilder() {
        }

        public SpecialtyBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Specialty build() {
            return new Specialty(description);
        }

        public String toString() {
            return "Specialty.SpecialtyBuilder(description=" + this.description + ")";
        }
    }
}
