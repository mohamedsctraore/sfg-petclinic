package guru.springframework.petclinic.model;

/**
 * Created by mohamed on 12/9/18.
 */
public class Person extends BaseEntity {
    private String firstname;
    private String lastname;

    public Person() {
    }

    public Person(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
