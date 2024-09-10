package pl.wojtyna.mydesignisbetter.chess.designC;

import java.util.List;
import java.util.Optional;

public class Board {

    private List<Field> fields = initBoard();
    private Color whoseTurn = Color.WHITE;

    private List<Field> initBoard() {
        throw new UnsupportedOperationException("init board logic");
    }

    void move(Position piecePosition, Position targetPosition) {
        findPieceAtPosition(piecePosition)
            .filter(piece -> piece.color() == whoseTurn)
            .filter(piece -> piece.isMoveValid(piecePosition, targetPosition))
            .ifPresent(piece -> removePieceFromOldPositionAndSetPieceToTargetPosition(piecePosition, targetPosition));
    }

    private void removePieceFromOldPositionAndSetPieceToTargetPosition(Position piecePosition,
                                                                       Position targetPosition) {
        throw new UnsupportedOperationException("move piece logic");
    }

    private Optional<Piece> findPieceAtPosition(Position piecePosition) {
        throw new UnsupportedOperationException("find piece logic");
    }
}
