package pl.wojtyna.mydesignisbetter.chess.designF;

import java.util.List;

public record DomainEvents(List<DomainEvent> events) {

    public static DomainEvents empty() {return new DomainEvents(List.of());}

    public DomainEvents append(DomainEvents events) {
        // ...
        return this;
    }

    public DomainEvents append(DomainEvent event) {
        // ...
        return this;
    }
}
