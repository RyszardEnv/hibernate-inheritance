package pl.ryspie.hibernateinheritance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter
@Setter
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    protected String eventOwner;
    @Column
    protected String description;
    @Column
    protected int limitedPLaces;
    @Column
    protected String location;

    public Event(String eventOwner, String description, int limitedPLaces, String location) {
        this.eventOwner = eventOwner;
        this.description = description;
        this.limitedPLaces = limitedPLaces;
        this.location = location;
    }


    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventOwner='" + eventOwner + '\'' +
                ", description='" + description + '\'' +
                ", limitedPLaces=" + limitedPLaces +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return id == event.id && limitedPLaces == event.limitedPLaces && Objects.equals(eventOwner, event.eventOwner) &&
                Objects.equals(description, event.description) && Objects.equals(location, event.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventOwner, description, limitedPLaces, location);
    }
}
