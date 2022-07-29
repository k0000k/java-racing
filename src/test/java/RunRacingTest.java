import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import racinggame.InputValue;
import racinggame.RacingGame;
import racinggame.AlwaysGo;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RunRacingTest {

    private final InputValue testRacingInput1 = new InputValue(3, 5);
    private final InputValue testRacingInput2 = new InputValue(5, 3);

    AlwaysGo alwaysGo = new AlwaysGo();

    RacingGame racingGame1 = new RacingGame(testRacingInput1, alwaysGo);
    RacingGame racingGame2 = new RacingGame(testRacingInput2, alwaysGo);


    @Test
    @DisplayName("레이싱 시작 상태 테스트")
    public void racingStartTest() {
        ArrayList<Integer> testCarList = new ArrayList<>(Arrays.asList(1));

        assertThat(racingGame1.getRacingStatus().getCars().getRacingCars().get(0).getPositionRecords())
                .isEqualTo(testCarList);
        assertThat(racingGame2.getRacingStatus().getCars().getRacingCars().get(0).getPositionRecords())
                .isEqualTo(testCarList);

    }

    @Test
    @DisplayName("이동 횟수 테스트")
    public void moveTest() {

        ArrayList<Integer> testCarList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> testCarList2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        racingGame1.runRace();
        racingGame2.runRace();

        assertThat(racingGame1.getRacingStatus().getCars().getRacingCars().get(0).getPositionRecords())
                .isEqualTo(testCarList1);
        assertThat(racingGame2.getRacingStatus().getCars().getRacingCars().get(0).getPositionRecords())
                .isEqualTo(testCarList2);
    }
}