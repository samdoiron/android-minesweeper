package ca.dal.samdoiron.minesweeper;


public class MineField {

    static final int ROWS = 9;
    static final int COLUMNS = 9;

    public enum Difficulty {
        EASY,
        MEDIUM,
        HARD
    }

    private Cell[][] cells;

    public static MineField generate(Difficulty difficulty) {
       Cell[][] cells = makeEmptyCells();
    }

    private static Cell[][] makeEmptyCells() {
        Cell[][] cells = new Cell[ROWS][COLUMNS];
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                cells[row][column] = Cell.makeNothing();
            }
        }
        return cells;
    }

    public MineField(Cell[][] cells) {
        this.cells = cells;
    }

    public Cell.Display cellDisplayAt(int row, int column) {
        return cells[row][column].getDisplay();
    }

}
