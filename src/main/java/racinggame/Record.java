package racinggame;

import java.util.ArrayList;

public class Record {
    private ArrayList<Integer> record;

    public Record() {
        this.record = new ArrayList<>();
    }

    public void makeRecord(Cars cars) {
        for (Car car : cars.getRacingCars()) {
            record.add(car.getPosition());
        }
    }

    public ArrayList<Integer> getRecord() {
        return record;
    }
}
