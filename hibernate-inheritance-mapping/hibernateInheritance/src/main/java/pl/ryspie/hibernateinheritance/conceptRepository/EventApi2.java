package pl.ryspie.hibernateinheritance.conceptRepository;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import pl.ryspie.hibernateinheritance.model.CyclicEvent;
import pl.ryspie.hibernateinheritance.model.Event;
import pl.ryspie.hibernateinheritance.model.InternalEvent;

import java.util.List;

@Controller
public class EventApi2 {

    private final EventRepository2<Event> eventRepository;
    private final InternalEventRepository2<InternalEvent> internalEventRepository;
    private final CyclicEventRepository2 cyclicEventRepository;

    public EventApi2(EventRepository2<Event> eventRepository, InternalEventRepository2<InternalEvent> internalEventRepository, CyclicEventRepository2 cyclicEventRepository) {
        this.eventRepository = eventRepository;
        this.internalEventRepository = internalEventRepository;
        this.cyclicEventRepository = cyclicEventRepository;
    }

//    @EventListener(ApplicationReadyEvent.class)
    public void checkData(){

        Event event = new Event("Riczi", "GłównyEvent", 20, "Warszawa");
        InternalEvent internalEvent = new InternalEvent("Magda", "WewnetrznyEvent", 5, "Warszawa", "Grupa", true);
        CyclicEvent cyclicEvent = new CyclicEvent("Riczi", "CyklicznyEvent", 2, "Warszawa", "Grupa", false, 7);
        InternalEvent internalEvent2 = new InternalEvent("Riczi", "InternalEvent2", 10, "Poznań", "Grupa2", false);

        eventRepository.save(event);
        internalEventRepository.save(internalEvent);
        cyclicEventRepository.save(cyclicEvent);
        internalEventRepository.save(internalEvent2);

        //For Events

//        List<Event> events = eventRepository.findAll();
//        for (Event event1 : events) {
//            System.out.println(event1);
//        }
//        List<Event> riczisEvents = eventRepository.findAllByEventOwner("Riczi");
//        riczisEvents.forEach(System.out::println);

        //For InternalEvents

//        List<InternalEvent> events = internalEventRepository.findAll();
//        for (InternalEvent event1 : events) {
//            System.out.println(event1);
//        }
//        List<InternalEvent> riczisEvents = internalEventRepository.findAllByEventOwner("Riczi");
//        riczisEvents.forEach(System.out::println);

        //For Cyclic Events

//        List<CyclicEvent> events = cyclicEventRepository.findAll();
//        for (InternalEvent event1 : events) {
//            System.out.println(event1);
//        }

    }
}
