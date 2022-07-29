package racinggame;

import java.util.ArrayList;

public class Cars {
    private final ArrayList<Car> racingCars;

    public Cars(int carCount) {
        this.racingCars = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            this.racingCars.add(new Car());
        }
    }

    public ArrayList<Car> getRacingCars() {
        return racingCars;
    }
}
