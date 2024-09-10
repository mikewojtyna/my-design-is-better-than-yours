package pl.wojtyna.mydesignisbetter.chess.designC;

public class Knight implements Piece {

    @Override
    public boolean isMoveValid(Position source, Position target) {
        return false;
    }

    @Override
    public Color color() {
        return null;
    }
}
