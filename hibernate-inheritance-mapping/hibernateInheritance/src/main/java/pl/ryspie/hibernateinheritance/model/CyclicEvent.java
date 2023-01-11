package pl.ryspie.hibernateinheritance.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity(name = "cyclic_events")
@NoArgsConstructor
@Getter
@Setter
public class CyclicEvent extends InternalEvent {
    @Column
    private int cycleLength;

    public CyclicEvent( String eventOwner, String description, int limitedPLaces, String location, String groupName,
                       boolean isPrivate, int cycleLength) {
        super(eventOwner, description, limitedPLaces, location, groupName, isPrivate);
        this.cycleLength = cycleLength;
    }

    @Override
    public String toString() {
        return super.toString() + "CyclicEvent{" +
                "cycleLength=" + cycleLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CyclicEvent)) return false;
        if (!super.equals(o)) return false;
        CyclicEvent that = (CyclicEvent) o;
        return cycleLength == that.cycleLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cycleLength);
    }
}
