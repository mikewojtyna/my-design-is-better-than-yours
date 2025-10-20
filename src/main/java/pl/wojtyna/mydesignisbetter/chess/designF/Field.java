package pl.wojtyna.mydesignisbetter.chess.designF;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

public final class Field implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
    private Position position;
    private ChessObject chessObject;

    public Field(Position position, ChessObject chessObject) {
        this.position = position;
        this.chessObject = chessObject;
    }

    public Field(Position position) {
        this.position = position;
        chessObject = null;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setChessObject(Piece chessObject) {
        this.chessObject = chessObject;
    }

    public Position position() {return position;}

    public Optional<ChessObject> object() {return Optional.ofNullable(chessObject);}

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
               Objects.equals(this.chessObject, that.chessObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, chessObject);
    }

    @Override
    public String toString() {
        return "Field[" +
               "position=" + position + ", " +
               "piece=" + chessObject + ']';
    }

}
