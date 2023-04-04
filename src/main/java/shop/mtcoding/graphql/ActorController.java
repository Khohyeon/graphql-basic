//package shop.mtcoding.graphql;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.graphql.data.method.annotation.Argument;
//import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.graphql.data.method.annotation.SchemaMapping;
//import org.springframework.stereotype.Controller;
//import shop.mtcoding.graphql.domain.Actor;
//import shop.mtcoding.graphql.model.ActorRepository;
//
//@Controller
//public class ActorController {
//
//    @Autowired
//    private ActorRepository actorRepository;
//
////    @QueryMapping
////    public Actor actorById(@Argument int id) {
////        return actorRepository.findById(id);
////    }
//
////    @SchemaMapping
////    public Actor author(Actor actor) {
////        return Actor.getById(actor.authorId());
////    }
//}