package pl.wojtyna.mydesignisbetter.chess.designC;

import java.io.Serial;
import java.io.Serializable;

public class Pawn implements Piece, Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    @Override
    public boolean isMoveValid(Position source, Position target) {
        return false;
    }

    @Override
    public Color color() {
        return null;
    }
}
