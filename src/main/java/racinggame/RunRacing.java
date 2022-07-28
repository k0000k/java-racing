package racinggame;

public class RunRacing {

    public void runRace(RacingStatus racingStatus, MoveCase moveCase) {
        for (int i = 1; i < racingStatus.getRacingCount(); i++) {
            decideStop(racingStatus.getRacingCars(), moveCase, i);
        }
    }

    private void decideStop(Car[] racingCars, MoveCase moveCase, int raceCount) {
        for (Car car : racingCars) {
            car.move(moveCase.isMovable(), raceCount);
        }
    }
}
