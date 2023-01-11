package pl.ryspie.hibernateinheritance.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity(name = "internal_events")
@NoArgsConstructor
@Getter
@Setter
public class InternalEvent extends Event {
    @Column
    protected String groupName;
    @Column
    protected boolean isPrivate;

    public InternalEvent(String eventOwner, String description, int limitedPLaces, String location, String groupName, boolean isPrivate) {
        super(eventOwner, description, limitedPLaces, location);
        this.groupName = groupName;
        this.isPrivate = isPrivate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InternalEvent)) return false;
        if (!super.equals(o)) return false;
        InternalEvent that = (InternalEvent) o;
        return isPrivate == that.isPrivate && Objects.equals(groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), groupName, isPrivate);
    }

    @Override
    public String toString() {
        return super.toString() + "InternalEvent{" +
                "groupName='" + groupName + '\'' +
                ", isPrivate=" + isPrivate +
                '}';
    }
}
