package pl.wojtyna.mydesignisbetter.chess.designE;

import java.io.Serial;
import java.io.Serializable;

public class SuicidalBomber implements Piece, Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    @Override
    public void move(Position source, Position target, Board board) {
        if (isMoveValid(source, target, board)) {
            board.removePiece(source);
            removePieceFromAllAdjacentFields(target, board);
        }
    }

    @Override
    public Color color() {
        return null;
    }

    private void removePieceFromAllAdjacentFields(Position target, Board board) {
        // remove from...
        // target.x - 1, target.y
        // target.x + 1, target.y
        // target.x - 1, target.y - 1
        // ...
    }

    private boolean isMoveValid(Position source, Position target, Board board) {
        return false;
    }
}
