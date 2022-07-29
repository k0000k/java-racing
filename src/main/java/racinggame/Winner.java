package racinggame;

import java.util.ArrayList;

public class Winner {
    private int winValue;
    private ArrayList<String> winnersName;

    public void selectWinner(RacingStatus racingStatus) {
        findWinValue(racingStatus.getRacingCars());
        findWinnersName(racingStatus.getRacingCars());
    }

    public void findWinValue(Car[] racingCars) {
        this.winValue = racingCars[0].getPosition();
        for (Car car : racingCars) {
            if (this.winValue <= car.getPosition()) {
                this.winValue = car.getPosition();
            }
        }
    }

    public void findWinnersName(Car[] racingCars) {
        this.winnersName = new ArrayList<String>();
        for (Car car : racingCars) {
            if (winValue == car.getPosition()) {
                this.winnersName.add(car.getName());
            }
        }
    }

    public ArrayList<String> getWinnersName() {
        return winnersName;
    }
}
