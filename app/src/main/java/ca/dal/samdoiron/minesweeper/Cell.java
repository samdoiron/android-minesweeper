package ca.dal.samdoiron.minesweeper;



public class Cell {
    public enum Truth { BOMB, NOTHING };

    public enum Display {
        BOMB,
        UNKNOWN,
        FLAG,
        ZERO,
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT
    };

    private boolean isExposed;
    private boolean isFlagged;
    private Truth truth;

    public static Cell makeBomb() {
        return new Cell(Cell.Truth.BOMB);
    }

    public static Cell makeNothing() {
        return new Cell(Cell.Truth.NOTHING);
    }

    public Cell(Truth truth) {
        this.truth = truth;
    }

    public Display getDisplay() {
        return Display.BOMB;
    }
}
