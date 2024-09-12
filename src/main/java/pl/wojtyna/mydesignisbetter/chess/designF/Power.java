package pl.wojtyna.mydesignisbetter.chess.designF;

public record Power(int level) {

    boolean isWeakerThan(Power power) {
        return level < power.level();
    }
}
