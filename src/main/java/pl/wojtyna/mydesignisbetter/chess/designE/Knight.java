package pl.wojtyna.mydesignisbetter.chess.designE;


public class Knight implements Piece {


    @Override
    public void move(Position source, Position target, Board board) {
        if (isMoveValid(source, target, board)) {
            board.removePieceFromOldPositionAndSetPieceToTargetPosition(source, target);
        }
    }

    @Override
    public Color color() {
        return null;
    }

    private boolean isMoveValid(Position source, Position target, Board board) {
        return false;
    }
}
