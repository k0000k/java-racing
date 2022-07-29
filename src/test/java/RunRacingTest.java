import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import racinggame.*;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class RunRacingTest {

    private final InputValue testRacingInput1 = new InputValue("aa,bb,cc", 5);
    RacingStatus racingStatus1 = new RacingStatus(testRacingInput1);

    private final InputValue testRacingInput2 = new InputValue("aa,bb,cc,dd,ee", 3);
    RacingStatus racingStatus2 = new RacingStatus(testRacingInput2);

    RunRacing runRacing = new RunRacing();
    AlwaysGo alwaysGo = new AlwaysGo();


    @Test
    @DisplayName("레이싱 시작 상태 테스트")
    public void racingStartTest() {
        int[] testCarList1 = new int[]{1, 0, 0, 0, 0};
        int[] testCarList2 = new int[]{1, 0, 0};

        assertThat(racingStatus1.getRacingCars()[0].getPositionRecords()).isEqualTo(testCarList1);
        assertThat(racingStatus2.getRacingCars()[0].getPositionRecords()).isEqualTo(testCarList2);
    }

    @Test
    @DisplayName("이동 횟수 테스트")
    public void moveTest() {
        int[] testCarList1 = new int[]{1, 2, 3, 4, 5};
        int[] testCarList2 = new int[]{1, 2, 3};

        runRacing.runRace(racingStatus1, alwaysGo);
        runRacing.runRace(racingStatus2, alwaysGo);

        assertThat(racingStatus1.getRacingCars()[0].getPositionRecords()).isEqualTo(testCarList1);
        assertThat(racingStatus2.getRacingCars()[0].getPositionRecords()).isEqualTo(testCarList2);

    }

    @Test
    @DisplayName("우승자 테스트")
    public void winnerTest(){
        Winner winner = new Winner();

        winner.selectWinner(racingStatus1);

        ArrayList<String> winnersNameTest = new ArrayList<String>();
        winnersNameTest.add("aa");
        winnersNameTest.add("bb");
        winnersNameTest.add("cc");

        assertThat(winner.getWinnersName()).isEqualTo(winnersNameTest);
    }

}