package pl.wojtyna.mydesignisbetter.chess.designF;

import java.util.List;

public class Pawn implements Piece {


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
