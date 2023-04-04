package shop.mtcoding.graphql.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.mtcoding.graphql.domain.Actor;
import shop.mtcoding.graphql.domain.AddressInput;
import shop.mtcoding.graphql.model.ActorRepository;

import java.util.List;

@Service
public class ActorService implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }
    public List<Actor> getAllActors(){
        return actorRepository.findAll();
    }
    public Actor getActorById(Integer id){
        return actorRepository.findById(id).get();
    }

    // mutation
    @Transactional
    public Actor updateAddress(Integer id, String address){
        Actor actor =  actorRepository.findById(id).get();
        actor.setAddress(address);
        actorRepository.save(actor);
        return actor;
    }
    // 입력 개체를 얻을 수 있음
    @Transactional
    public Actor updateAddressByInputObject(AddressInput input){
        Actor actor =  actorRepository.findById(input.getActorId()).get();
        actor.setAddress(input.getAddress());
        actorRepository.save(actor);
        return actor;
    }
}