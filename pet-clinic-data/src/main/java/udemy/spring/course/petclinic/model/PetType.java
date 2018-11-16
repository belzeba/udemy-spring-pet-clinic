package udemy.spring.course.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ari on 05.09.2018
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public PetType() {
    }

    public PetType(String name) {
        this.name = name;
    }

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static PetTypeBuilder builder() {
        return new PetTypeBuilder();
    }

    public static class PetTypeBuilder {
        private String name;

        PetTypeBuilder() {
        }

        public PetTypeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PetType build() {
            return new PetType(name);
        }

        public String toString() {
            return "PetType.PetTypeBuilder(name=" + this.name + ")";
        }
    }
}
