package pl.wojtyna.mydesignisbetter.chess.designC;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class Board implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    private final List<Field> fields = initBoard();
    private final Color whoseTurn = Color.WHITE;

    void move(Position piecePosition, Position targetPosition) {
        findPieceAtPosition(piecePosition)
            .filter(piece -> piece.color() == whoseTurn)
            .filter(piece -> piece.isMoveValid(piecePosition, targetPosition))
            .ifPresent(piece -> removePieceFromOldPositionAndSetPieceToTargetPosition(piecePosition, targetPosition));
    }

    private List<Field> initBoard() {
        throw new UnsupportedOperationException("init board logic");
    }

    private void removePieceFromOldPositionAndSetPieceToTargetPosition(Position piecePosition,
                                                                       Position targetPosition) {
        throw new UnsupportedOperationException("move piece logic");
    }

    private Optional<Piece> findPieceAtPosition(Position piecePosition) {
        throw new UnsupportedOperationException("find piece logic");
    }
}
