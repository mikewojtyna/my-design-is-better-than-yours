package pl.wojtyna.mydesignisbetter.tournament;

import pl.wojtyna.mydesignisbetter.chess.designF.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Tournament implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
    private final int MAX_EFFECTS_PER_PLAYER = 10;
    private Map<Board, List<Player>> boards;

    public DomainEvents move(Position piecePosition, Position targetPosition, Board board) {
        // find the right board and move piece
        return DomainEvents.empty();
    }

    public DomainEvents handle(PowerupCollected powerupCollected) {
        // assign the powerup effect to the right player
        if (checkMaxNumerOfEffectsForPlayer(theRightPlayer())) {
            return produceSomeDomainEventsJustToMakeCompilerHappy();
        }
        return DomainEvents.empty();
    }

    public DomainEvents apply(Effect effect, Board board) {
        // apply effect on given board
        return DomainEvents.empty();
    }

    public DomainEvents exchangeEffects(Player donor, Player donee, Effect effect) {
        // exchange effects between donor and donee
        if (checkMaxNumerOfEffectsForPlayer(donor) && checkMaxNumerOfEffectsForPlayer(donee)) {
            return produceSomeDomainEventsJustToMakeCompilerHappy();
        }
        return DomainEvents.empty();
    }

    private Player theRightPlayer() {
        return null;
    }

    private DomainEvents produceSomeDomainEventsJustToMakeCompilerHappy() {
        return DomainEvents.empty();
    }

    private boolean checkMaxNumerOfEffectsForPlayer(Player player) {
        return false;
    }
}
