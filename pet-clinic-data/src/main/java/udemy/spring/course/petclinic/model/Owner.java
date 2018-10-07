package udemy.spring.course.petclinic.model;

import java.util.Set;

/**
 * Created by Ari on 05.09.2018
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
