package shop.mtcoding.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.mtcoding.graphql.domain.Actor;
import shop.mtcoding.graphql.domain.Film;
import shop.mtcoding.graphql.model.FilmRepository;

@Service
public class FilmResolver implements GraphQLResolver<Actor> {
    @Autowired
    private FilmRepository filmRepository;

    @Transactional
    public Film getFilm(Actor actor){
        return filmRepository.findById(actor.getFilmId()).get();
    }
}