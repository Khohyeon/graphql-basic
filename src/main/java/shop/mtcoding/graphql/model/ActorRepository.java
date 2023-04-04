package shop.mtcoding.graphql.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.mtcoding.graphql.domain.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}