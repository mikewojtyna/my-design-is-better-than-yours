package pl.wojtyna.mydesignisbetter.chess.designF;

public record InstantPowerup(Effect effect, Board board) implements Powerup {

    @Override
    public DomainEvents whenMovedOn(Piece piece) {
        var events = effect.apply(board);
        return DomainEvents.empty().append(new InstantPowerupActivated()).append(events);
    }
}
