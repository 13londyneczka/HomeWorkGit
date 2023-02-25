package Lesson3.Exercise1;

public class PlaceInCinema {

    private final int number;
    private final int row;
    private boolean isFree;

    public PlaceInCinema(int number, int row, boolean isFree) {
        this.number = number;
        this.row = row;
        this.isFree = isFree;
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
