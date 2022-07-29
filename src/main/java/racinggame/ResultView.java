package racinggame;

public class ResultView {
    public void printRace(RacingStatus racingStatus) {
        for (int i = 0; i < racingStatus.getRacingCount(); i++) {
            printCars(i, racingStatus);
            System.out.println();
        }
    }

    public void printCars(int raceCount, RacingStatus racingStatus) {
        for (Car car : racingStatus.getRacingCars()) {
            String result = "-".repeat(car.getPositionRecords()[raceCount]);
            System.out.println(car.getName()+": "+result);
        }
    }
}
