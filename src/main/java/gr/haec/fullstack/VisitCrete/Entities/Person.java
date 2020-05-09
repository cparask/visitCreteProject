package gr.haec.fullstack.VisitCrete.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 30)
    private String name;
    @Column(length = 30)
    private String surname;
    @Column(length = 30)
    private String email;

    @OneToMany (mappedBy = "person")
            @JsonIgnore
    Set<Rating> ratings;


    public Person() {
    }

    public Person(long id, String name, String surname, String email, Set<Rating> ratings) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.ratings = ratings;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<Rating> ratings) {
        this.ratings = ratings;
    }
}
