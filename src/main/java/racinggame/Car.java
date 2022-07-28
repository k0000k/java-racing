package racinggame;

public class Car {
    private final int[] positionRecords;

    Car(int racingCount) {
        this.positionRecords = new int[racingCount];
        positionRecords[0] = 1;
    }

    public void move(boolean go, int raceCount) {
        if (go) {
            positionRecords[raceCount] = positionRecords[raceCount - 1] + 1;
            return;
        }
        positionRecords[raceCount] = positionRecords[raceCount - 1];
    }

    public int[] getPositionRecords() {
        return positionRecords;
    }
}
