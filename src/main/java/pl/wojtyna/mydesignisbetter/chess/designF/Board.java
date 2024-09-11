package pl.wojtyna.mydesignisbetter.chess.designF;

import java.util.List;
import java.util.Optional;

public class Board {

    private List<Field> fields = initBoard();
    private Color whoseTurn = Color.WHITE;
    private DomainEvents uncommitedEvents = DomainEvents.empty();

    void apply(DomainEvent event) {
        uncommitedEvents = uncommitedEvents.append(event);
    }

    private List<Field> initBoard() {
        throw new UnsupportedOperationException("init board logic");
    }

    public DomainEvents move(Position piecePosition, Position targetPosition) {
        var events = findPieceAtPosition(piecePosition)
            .filter(piece -> piece.color() == whoseTurn)
            .map(piece -> piece.move(piecePosition, targetPosition, this)).orElse(DomainEvents.empty());
        uncommitedEvents = uncommitedEvents.append(events);
        return uncommitedEvents;
    }

    void removePieceFromOldPositionAndSetPieceToTargetPosition(Position piecePosition,
                                                               Position targetPosition) {
        throw new UnsupportedOperationException("move piece logic");
    }

    private Optional<Piece> findPieceAtPosition(Position piecePosition) {
        throw new UnsupportedOperationException("find piece logic");
    }
}
