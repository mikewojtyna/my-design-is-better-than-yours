package pl.wojtyna.mydesignisbetter.chess.designF;

import java.util.List;

// immutable projection of board
public record BoardContext(List<Field> fields) {

    public BoardContext {
        fields = List.copyOf(fields);
    }
}
