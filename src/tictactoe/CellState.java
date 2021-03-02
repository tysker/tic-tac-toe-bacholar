package tictactoe;

public enum CellState {

    COMPUTER("X"), USER("O"), EMPTY("-");

    private CellState(String text) {
        this.text = text;
    }

    private final String text;

    @Override
    public String toString() {
        return this.text;
    }
}
