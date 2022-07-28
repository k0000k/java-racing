package racinggame;

public class Controller {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        InputValue inputValue = inputView.inputCar();
        RacingStatus racingStatus = new RacingStatus(inputValue);

        RunRacing runRacing = new RunRacing();
        RandomGo randomGo = new RandomGo();
        runRacing.runRace(racingStatus, randomGo);

        ResultView resultView = new ResultView();
        resultView.printRace(racingStatus);
    }
}
