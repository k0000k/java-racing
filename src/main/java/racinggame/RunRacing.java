package racinggame;

public class RunRacing {

    public void runRace(RacingStatus car, MoveCase moveCase) {
        ResultView resultView = new ResultView();
        for (int i = 0; i < car.getRacingCount(); ++i) {
            resultView.printRace(car);
            decideStop(car, moveCase);
        }
    }

    private void decideStop(RacingStatus car, MoveCase moveCase) {
        for (int j = 0; j < car.getCarCount(); j++) {
            if (moveCase.isMovable()) {
                car.go(j);
            }
        }
    }
}
