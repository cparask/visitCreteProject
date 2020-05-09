package gr.haec.fullstack.VisitCrete.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TourPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tourPackageid;
    @Column(length = 140)
    private String name;

    @OneToMany(mappedBy = "tourPackage")
    @JsonIgnore
    Set<Rating> ratings;


    public TourPackage() {
    }

    public TourPackage(long tourPackageid, String name, Set<Rating> ratings) {
        this.tourPackageid = tourPackageid;
        this.name = name;
        this.ratings = ratings;
    }

    public long getTourPackageid() {
        return tourPackageid;
    }

    public void setTourPackageid(long tourPackageid) {
        this.tourPackageid = tourPackageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<Rating> ratings) {
        this.ratings = ratings;
    }
}

