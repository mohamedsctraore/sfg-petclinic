package guru.springframework.petclinic.model;

import java.io.Serializable;

/**
 * Created by mohamed on 12/9/18.
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
