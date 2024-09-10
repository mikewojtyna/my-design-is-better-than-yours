package pl.wojtyna.mydesignisbetter.chess.designE;

public interface Piece {

    void move(Position source, Position target, Board board);

    Color color();
}
