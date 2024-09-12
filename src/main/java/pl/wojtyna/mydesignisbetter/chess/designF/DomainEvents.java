package pl.wojtyna.mydesignisbetter.chess.designF;

import java.util.ArrayList;
import java.util.List;

public record DomainEvents(List<DomainEvent> events) {

    public static DomainEvents empty() {return new DomainEvents(List.of());}

    public DomainEvents append(DomainEvents events) {
        // ...
        var newEvents = new ArrayList<>(this.events);
        newEvents.addAll(events.events);
        return new DomainEvents(newEvents);
    }

    public DomainEvents append(DomainEvent event) {
        // ...
        return append(new DomainEvents(List.of(event)));
    }
}
