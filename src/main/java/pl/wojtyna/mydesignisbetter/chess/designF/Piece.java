package pl.wojtyna.mydesignisbetter.chess.designF;

public interface Piece {

    DomainEvents move(Position source, Position target, Board board);

    Color color();
}
