package racinggame;

public class RacingStatus {
    private final int racingCount;
    private final Car[] racingCars;
    private final String[] carNames;

    public RacingStatus(InputValue inputValue) {
        int carCount = inputValue.getCarCount();
        this.racingCount = inputValue.getRacingCount();
        this.carNames = inputValue.getCarNames();
        this.racingCars = new Car[carCount];
        for (int i = 0; i < carCount; i++) {
            racingCars[i] = new Car(racingCount, carNames[i]);
        }
    }

    public int getRacingCount() {
        return racingCount;
    }

    public Car[] getRacingCars() {
        return racingCars;
    }
}
