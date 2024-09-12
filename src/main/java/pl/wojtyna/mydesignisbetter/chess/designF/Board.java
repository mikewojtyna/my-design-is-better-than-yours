package pl.wojtyna.mydesignisbetter.chess.designF;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class Board implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
    private final List<Field> fields = initBoard();
    private Color whoseTurn = Color.WHITE;
    private DomainEvents uncommitedEvents = DomainEvents.empty();

    public DomainEvents move(Position piecePosition, Position targetPosition) {
        var events = findPieceAtPosition(piecePosition)
            .filter(piece -> piece.color() == whoseTurn)
            .map(piece -> piece.move(piecePosition, targetPosition, this)).orElse(DomainEvents.empty());
        uncommitedEvents = uncommitedEvents.append(events);
        return uncommitedEvents;
    }

    public void apply(Effect effect) {
        // some validation perhaps? e.g. max number of effect applied
        effect.apply(this);
    }

    void setWhoseTurn(Color color) {
        this.whoseTurn = color;
    }

    void apply(DomainEvent event) {
        // reconstruct state
    }

    void removePieceFromOldPositionAndSetPieceToTargetPosition(Position piecePosition,
                                                               Position targetPosition) {
        throw new UnsupportedOperationException("move piece logic");
    }

    Optional<Piece> findPieceAtPosition(Position piecePosition) {
        throw new UnsupportedOperationException("find piece logic");
    }

    private List<Field> initBoard() {
        throw new UnsupportedOperationException("init board logic");
    }
}
