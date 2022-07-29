package racinggame;

import java.util.ArrayList;

public class Car {
    private final ArrayList<Integer> positionRecords;
    private final int INITIAL_POSITION_OF_CAR = 1;

    public Car() {
        this.positionRecords = new ArrayList<>();
        positionRecords.add(INITIAL_POSITION_OF_CAR);
    }

    public void move(boolean go) {
        int beforePosition = positionRecords.get(positionRecords.size() - 1);
        if (go) {
            positionRecords.add(++beforePosition);
            return;
        }
        positionRecords.add(beforePosition);
    }

    public ArrayList<Integer> getPositionRecords() {
        return positionRecords;
    }
}
