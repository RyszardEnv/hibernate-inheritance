package pl.ryspie.hibernateinheritance.conceptRepository;

import org.springframework.stereotype.Repository;
import pl.ryspie.hibernateinheritance.model.CyclicEvent;

@Repository
public interface CyclicEventRepository2 extends InternalEventRepository2<CyclicEvent> {

}
