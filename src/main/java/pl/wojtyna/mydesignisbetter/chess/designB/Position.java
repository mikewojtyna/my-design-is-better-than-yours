package pl.wojtyna.mydesignisbetter.chess.designB;

import java.io.Serial;
import java.io.Serializable;

public record Position() implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
}
