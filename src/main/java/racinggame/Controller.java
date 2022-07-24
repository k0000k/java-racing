package racinggame;

public class Controller {
    public static void main(String[] args) {
        InputView input = new InputView();
        RacingStatus racingStatus = input.inputCar();
        RunRacing runRacing = new RunRacing();
        RandomGo randomGo = new RandomGo();
        runRacing.runRace(racingStatus, randomGo);
    }
}
