package pl.wojtyna.mydesignisbetter.chess.designD;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

// immutable projection of board
public record BoardContext(List<Field> fields) implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    public BoardContext {
        fields = List.copyOf(fields);
    }
}
