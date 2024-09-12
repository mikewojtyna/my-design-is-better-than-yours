package pl.wojtyna.mydesignisbetter.chess.designE;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class Board implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
    private final List<Field> fields = initBoard();
    private final Color whoseTurn = Color.WHITE;

    public void move(Position piecePosition, Position targetPosition) {
        findPieceAtPosition(piecePosition)
            .filter(piece -> piece.color() == whoseTurn)
            .ifPresent(piece -> piece.move(piecePosition, targetPosition, this));
    }

    void removePieceFromOldPositionAndSetPieceToTargetPosition(Position piecePosition,
                                                               Position targetPosition) {
        throw new UnsupportedOperationException("move piece logic");
    }

    void removePiece(Position position) {
        throw new UnsupportedOperationException("remove piece logic");
    }

    private List<Field> initBoard() {
        throw new UnsupportedOperationException("init board logic");
    }

    private Optional<Piece> findPieceAtPosition(Position piecePosition) {
        throw new UnsupportedOperationException("find piece logic");
    }
}
