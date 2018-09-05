package udemy.spring.course.petclinic.model;

/**
 * Created by Ari on 05.09.2018
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
