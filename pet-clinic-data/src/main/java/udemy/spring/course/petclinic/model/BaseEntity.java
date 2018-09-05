package udemy.spring.course.petclinic.model;

import java.io.Serializable;

/**
 * Created by Ari on 06.09.2018
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
