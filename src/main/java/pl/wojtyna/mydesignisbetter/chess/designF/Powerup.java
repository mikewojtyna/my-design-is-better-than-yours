package pl.wojtyna.mydesignisbetter.chess.designF;

public interface Powerup extends ChessObject {

    DomainEvents whenMovedOn(Piece piece);
}
