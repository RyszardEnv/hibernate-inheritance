package pl.ryspie.hibernateinheritance.repository;


import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ryspie.hibernateinheritance.model.Event;

import java.util.List;

@Repository
@Primary
public interface EventRepository<I extends Event> extends JpaRepository<I, Long> {

    List<I> findAllByEventOwner(String eventOwner);

}
