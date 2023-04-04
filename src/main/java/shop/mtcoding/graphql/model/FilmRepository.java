package shop.mtcoding.graphql.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.mtcoding.graphql.domain.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
}