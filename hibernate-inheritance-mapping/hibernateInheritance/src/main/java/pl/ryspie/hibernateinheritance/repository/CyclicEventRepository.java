package pl.ryspie.hibernateinheritance.repository;

import org.springframework.stereotype.Repository;
import pl.ryspie.hibernateinheritance.model.CyclicEvent;

import java.util.List;

@Repository
public interface CyclicEventRepository extends InternalEventRepository<CyclicEvent> {
//    List<CyclicEvent> findByEventOwner(String eventOwner);
}
