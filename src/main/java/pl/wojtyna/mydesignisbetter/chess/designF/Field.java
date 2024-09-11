package pl.wojtyna.mydesignisbetter.chess.designF;

import java.util.Objects;
import java.util.Optional;

public final class Field {

    private Position position;
    private Piece piece;

    public Field(Position position, Piece piece) {
        this.position = position;
        this.piece = piece;
    }

    public Field(Position position) {
        this.position = position;
        piece = null;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Position position() {return position;}

    public Optional<Piece> piece() {return Optional.ofNullable(piece);}

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        var that = (Field) obj;
        return Objects.equals(this.position, that.position) &&
               Objects.equals(this.piece, that.piece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, piece);
    }

    @Override
    public String toString() {
        return "Field[" +
               "position=" + position + ", " +
               "piece=" + piece + ']';
    }

}
