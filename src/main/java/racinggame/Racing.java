package racinggame;

import java.util.Random;

public class Racing {
    private Random random;

    Racing(){
         this.random = new Random();
    }

    public void runRace(RacingStatus car) {
        ResultView resultView = new ResultView();
        for (int i = 0; i < car.getRacingCount(); ++i) {
            resultView.printRace(car);
            decideStop(car);
        }
    }

    public void decideStop(RacingStatus car) {
        for (int j = 0; j < car.getCarCount(); j++) {
            if (random.nextInt(10) >= 4) {
                car.go(j);
            }
        }
    }
}
