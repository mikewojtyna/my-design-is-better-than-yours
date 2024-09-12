package pl.wojtyna.mydesignisbetter.chess.designF;

import java.io.Serial;
import java.io.Serializable;

public record Position(int x, int y) implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
}
