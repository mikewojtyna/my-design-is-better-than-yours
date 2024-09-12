package pl.wojtyna.mydesignisbetter.chess.designF;

public interface Piece extends ChessObject {

    Power power();

    DomainEvents move(Position source, Position target, Board board);

    Color color();
}
