package Enum;

public enum DisplayDiagonal {
    DIAG13(13), DIAG15(15), DIAG17(17);
    private int diagonal;
    DisplayDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
    public int getDisplayDiagonal() {
        return diagonal;
    }
}
