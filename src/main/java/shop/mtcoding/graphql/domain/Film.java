package shop.mtcoding.graphql.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "FILM")
@Getter
@Setter
public class Film {

    @Id
    @Column(name = "FILM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer filmId;

    @Column(name = "NAME")
    private String name;
    @Column(name = "regDt")
    private LocalDate regDt;

    public Film() {
    }

    public Film(String name, LocalDate regDt) {
        this.name = name;
        this.regDt = regDt;
    }
}