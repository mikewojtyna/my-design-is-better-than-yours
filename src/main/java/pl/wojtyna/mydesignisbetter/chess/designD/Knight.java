package pl.wojtyna.mydesignisbetter.chess.designD;

import java.io.Serial;
import java.io.Serializable;

public class Knight implements Piece, Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    @Override
    public boolean isMoveValid(Position source, Position target, BoardContext boardContext) {
        return false;
    }

    @Override
    public Color color() {
        return null;
    }
}
