package racinggame;

public class Racing {

    public void runRace(RacingStatus car, boolean go) {
        ResultView resultView = new ResultView();
        for (int i = 0; i < car.getRacingCount(); ++i) {
            resultView.printRace(car);
            decideStop(car, go);
        }
    }

    private void decideStop(RacingStatus car, boolean go) {
        for (int j = 0; j < car.getCarCount(); j++) {
            if (go) {
                car.go(j);
            }
        }
    }
}
