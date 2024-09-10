package pl.wojtyna.mydesignisbetter.chess.designB;

import java.util.Optional;

public record Field(Position position, Optional<Piece> piece) {
}
