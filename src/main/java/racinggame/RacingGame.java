package racinggame;

import java.util.HashMap;

public class RacingGame {
    private final RacingStatus racingStatus;
    private final MoveCase moveCase;
    private final Move move;
    private final HashMap<Integer, Record> records;

    public RacingGame(InputValue inputValue, MoveCase moveCase) {
        this.racingStatus = new RacingStatus(inputValue);
        this.moveCase = moveCase;
        this.move = new Move();
        this.records = new HashMap<>();
    }

    public void runRace() {
        for (int i = 0; i < racingStatus.getRacingCount(); ++i) {
            Record record = new Record();
            record.makeRecord(racingStatus.getCars());
            this.records.put(i, record);
            this.move.decideMove(racingStatus.getCars(), moveCase);
        }
    }

    public HashMap<Integer, Record> getRecords() {
        return records;
    }

    public RacingStatus getRacingStatus() {
        return racingStatus;
    }
}
