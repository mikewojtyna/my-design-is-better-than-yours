package pl.wojtyna.mydesignisbetter.chess.designF;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class Pawn implements Piece, Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    @Override
    public Power power() {
        return new Power(0);
    }

    @Override
    public DomainEvents move(Position source, Position target, Board board) {
        if (isMoveValid(source, target, board)) {
            board.removePieceFromOldPositionAndSetPieceToTargetPosition(source, target);
            return new DomainEvents(List.of(new PieceMoved())); // should probably include piece killed if target position contained a weaker piece
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
        return checkMoveModel(source, target, board) && checkKillModelIfTargetContainsOtherPiece();
    }

    private boolean checkKillModelIfTargetContainsOtherPiece() {
        return false;
    }

    private boolean checkMoveModel(Position source, Position target, Board board) {
        return false;
    }
}
