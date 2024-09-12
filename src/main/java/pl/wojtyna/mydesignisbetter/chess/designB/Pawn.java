package pl.wojtyna.mydesignisbetter.chess.designB;

import java.io.Serial;
import java.io.Serializable;

public class Pawn implements Piece, Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    @Override
    public PieceType type() {
        return null;
    }

    @Override
    public Color color() {
        return null;
    }
}
