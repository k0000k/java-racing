package racinggame;

public class Car {
    private final int[] positionRecords;
    private final String name;

    Car(int racingCount, String name) {
        this.positionRecords = new int[racingCount];
        this.name = name;
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

    public String getName() {
        return name;
    }
}
