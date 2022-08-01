package racinggame;

import java.util.HashMap;

public class RacingStatus {
    private final int racingCount;
    private final Cars cars;

    public RacingStatus(InputValue inputValue) {
        int carCount = inputValue.getCarCount();
        this.racingCount = inputValue.getRacingCount();
        this.cars = new Cars(carCount);
    }

    public int getRacingCount() {
        return racingCount;
    }

    public Cars getCars() {
        return cars;
    }
}
