package pl.wojtyna.mydesignisbetter.chess.designF;


import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class Knight implements Piece, Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    @Override
    public Power power() {
        return new Power(1);
    }

    @Override
    public DomainEvents move(Position source, Position target, Board board) {
        if (isMoveValid(source, target, board)) {
            board.removePieceFromOldPositionAndSetPieceToTargetPosition(source, target);
            return new DomainEvents(List.of(new PieceMoved()));
        }
        return DomainEvents.empty();
    }

    @Override
    public Color color() {
        return null;
    }

    private boolean isMoveValid(Position source,
                                Position target,
                                Board board) {
        return false;
    }
}
