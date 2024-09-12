package pl.wojtyna.mydesignisbetter.chess.designF;

public record CollectiblePowerup() implements Powerup {

    @Override
    public DomainEvents whenMovedOn(Piece piece) {
        return DomainEvents.empty().append(new PowerupCollected(someEffect()));
    }

    private Effect someEffect() {
        return null;
    }
}
