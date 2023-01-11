package pl.ryspie.hibernateinheritance.repository;

import org.springframework.stereotype.Repository;
import pl.ryspie.hibernateinheritance.model.InternalEvent;

import java.util.List;

@Repository
public interface InternalEventRepository<C extends InternalEvent> extends EventRepository<C> {

//    List<C> findAllByEventOwner(String eventOwner);

}
