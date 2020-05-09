package gr.haec.fullstack.VisitCrete.Entities;


import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(columnDefinition = "person_id")
    private Person person;

    @ManyToOne
    @JoinColumn(columnDefinition = "tourPackage_id")
    private TourPackage tourPackage;


    @Min(1)
    @Max(5)
    private String score;
    private String comments;


    public Rating() {
    }

    public Rating(long id, Person person, TourPackage tourPackage, @Min(1) @Max(5) String score, String comments) {
        this.id = id;
        this.person = person;
        this.tourPackage = tourPackage;
        this.score = score;
        this.comments = comments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}