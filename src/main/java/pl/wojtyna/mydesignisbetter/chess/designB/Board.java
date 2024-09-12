package pl.wojtyna.mydesignisbetter.chess.designB;

import java.util.Optional;

public class Board {

    private final Field[] fields = initBoard();
    private final Color whoseTurn = Color.WHITE;

    void move(Position piecePosition, Position targetPosition) {
        findPieceAtPosition(piecePosition).ifPresent(piece -> {
            if (piece.color() == whoseTurn) {
                switch (piece.type()) {
                    case KNIGHT -> moveKnight(piecePosition, targetPosition);
                    case PAWN -> movePawn(piecePosition, targetPosition);
                    default -> throw new IllegalStateException("Unexpected value: " + piece);
                }
            }
        });
    }

    private Field[] initBoard() {
        throw new UnsupportedOperationException("init board logic");
    }

    private void moveKnight(Position piecePosition, Position targetPosition) {
        throw new UnsupportedOperationException("move knight logic");
    }

    private void movePawn(Position piecePosition, Position targetPosition) {
        throw new UnsupportedOperationException("move pawn logic");
    }

    private Optional<Piece> findPieceAtPosition(Position piecePosition) {
        throw new UnsupportedOperationException("find piece logic");
    }
}
