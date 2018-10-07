package udemy.spring.course.petclinic.model;

import java.time.LocalDate;

/**
 * Created by Ari on 07.10.2018
 */
public class Visit extends BaseEntity {

    private LocalDate dte;
    private String description;
    private Pet pet;

    public LocalDate getDte() {
        return dte;
    }

    public void setDte(LocalDate dte) {
        this.dte = dte;
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
}
