package pl.wojtyna.mydesignisbetter.chess.designD;

public interface Piece {

    boolean isMoveValid(Position source, Position target, BoardContext boardContext);

    Color color();
}
