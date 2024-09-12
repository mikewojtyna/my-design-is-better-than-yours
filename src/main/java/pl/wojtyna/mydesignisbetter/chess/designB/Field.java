package pl.wojtyna.mydesignisbetter.chess.designB;

import java.io.Serial;
import java.io.Serializable;
import java.util.Optional;

public record Field(Position position, Optional<Piece> piece) implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
}
