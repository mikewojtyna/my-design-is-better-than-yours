package pl.wojtyna.mydesignisbetter.tournament;

import pl.wojtyna.mydesignisbetter.chess.designF.Effect;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record Player(List<Effect> effects) implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
}
