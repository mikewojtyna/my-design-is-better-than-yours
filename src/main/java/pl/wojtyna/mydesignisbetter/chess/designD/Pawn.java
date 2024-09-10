package pl.wojtyna.mydesignisbetter.chess.designD;

public class Pawn implements Piece {

    @Override
    public boolean isMoveValid(Position source, Position target, BoardContext boardContext) {
        return false;
    }

    @Override
    public Color color() {
        return null;
    }
}
