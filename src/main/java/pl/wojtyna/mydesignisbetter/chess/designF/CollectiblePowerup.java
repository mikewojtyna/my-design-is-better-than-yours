package pl.wojtyna.mydesignisbetter.chess.designF;

public record CollectiblePowerup() implements Powerup {

    @Override
    public DomainEvents collect() {
        return DomainEvents.empty().append(new PowerupCollected(someEffect()));
    }

    private Effect someEffect() {
        return null;
    }
}
