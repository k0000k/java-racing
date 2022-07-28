package racinggame;

public class RacingStatus {
    private final int racingCount;
    private final Car[] racingCars;

    public RacingStatus(InputValue inputValue) {
        int carCount = inputValue.getCarCount();
        this.racingCount = inputValue.getRacingCount();
        this.racingCars = new Car[carCount];
        for (int i = 0; i < carCount; i++) {
            racingCars[i] = new Car(racingCount);
        }
    }

    public int getRacingCount() {
        return racingCount;
    }

    public Car[] getRacingCars() {
        return racingCars;
    }
}
