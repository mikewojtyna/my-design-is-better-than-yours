package pl.wojtyna.mydesignisbetter.chess.designC;

public interface Piece {

    // what about blocking fields?
    boolean isMoveValid(Position source, Position target);

    Color color();
}
