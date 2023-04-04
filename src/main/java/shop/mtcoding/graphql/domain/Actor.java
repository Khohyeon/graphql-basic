package shop.mtcoding.graphql.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="ACTOR")
@Getter
@Setter
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACTOR_ID")
    private Integer actorId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DOB")
    private LocalDate dob;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "FILM_ID")
    private Integer filmId;

    public Actor() {

    }

    public Actor(String firstName, String lastName, LocalDate dob, String address, Integer filmId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.filmId = filmId;
    }
}