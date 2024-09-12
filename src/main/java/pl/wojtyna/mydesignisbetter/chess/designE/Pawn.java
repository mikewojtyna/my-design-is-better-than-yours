package pl.wojtyna.mydesignisbetter.chess.designE;

import java.io.Serial;
import java.io.Serializable;

public class Pawn implements Piece, Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    @Override
    public void move(Position source, Position target, Board board) {
        if (isMoveValid(source, target, board)) {
            board.removePieceFromOldPositionAndSetPieceToTargetPosition(source, target);
        }
    }

    @Override
    public Color color() {
        return null;
    }

    private boolean isMoveValid(Position source, Position target, Board board) {
        return false;
    }
}
