package racinggame;

public class Controller {
    public static void main(String[] args) {
        InputView input = new InputView();
        RacingStatus car = input.inputCar();
        Racing race = new Racing();
        race.runRace(car);
    }
}