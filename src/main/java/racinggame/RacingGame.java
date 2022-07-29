package racinggame;

public class RacingGame {
    private final RacingStatus racingStatus;
    private final MoveCase moveCase;
    private final Move move;

    public RacingGame(InputValue inputValue, MoveCase moveCase) {
        this.racingStatus = new RacingStatus(inputValue);
        this.moveCase = moveCase;
        this.move = new Move();
    }

    public void runRace() {
        for (int i = 1; i < racingStatus.getRacingCount(); i++) {
            this.move.decideMove(racingStatus.getCars(), moveCase);
        }
    }

    public RacingStatus getRacingStatus() {
        return racingStatus;
    }
}
