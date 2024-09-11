package pl.wojtyna.mydesignisbetter.chess.designE;

public class Pawn implements Piece {


    @Override
    public void move(Position source, Position target, Board board) {
        if (isMoveValid(source, target, board)) {
            board.removePieceFromOldPositionAndSetPieceToTargetPosition(source, target);
        }
    }

    private boolean isMoveValid(Position source, Position target, Board board) {
        return false;
    }

    @Override
    public Color color() {
        return null;
    }
}
