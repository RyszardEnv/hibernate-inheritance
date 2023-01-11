package pl.ryspie.hibernateinheritance.conceptRepository;

import org.springframework.stereotype.Repository;
import pl.ryspie.hibernateinheritance.model.InternalEvent;

@Repository
public interface InternalEventRepository2<C extends InternalEvent> extends EventRepository2<C> {

}
