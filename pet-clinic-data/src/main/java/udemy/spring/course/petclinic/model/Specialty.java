package udemy.spring.course.petclinic.model;

/**
 * Created by Ari on 07.10.2018
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
