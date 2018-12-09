package guru.springframework.petclinic.model;

/**
 * Created by mohamed on 12/9/18.
 */
public class PetType {
    private String name;

    public PetType(String name) {
        this.name = name;
    }

    public PetType() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
