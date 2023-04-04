package shop.mtcoding.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import shop.mtcoding.graphql.domain.Actor;

@Controller
public class ActorController {
//    @QueryMapping
//    public Actor actorById(@Argument String id) {
//        return Actor.getById(id);
//    }

//    @SchemaMapping
//    public Actor author(Actor actor) {
//        return Actor.getById(actor.authorId());
//    }
}