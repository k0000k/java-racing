package racinggame;

public class InputValue {
    private final int carCount;
    private final int racingCount;
    private final String[] carNames;

    public InputValue(String inputNames, int racingCount) {
        this.carNames=inputNames.split(",");
        this.carCount = carNames.length;
        this.racingCount = racingCount;
    }

    public int getRacingCount() {
        return racingCount;
    }

    public int getCarCount() {
        return carCount;
    }

    public String[] getCarNames() {
        return carNames;
    }
}
