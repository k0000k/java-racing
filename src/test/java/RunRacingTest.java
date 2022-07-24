import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import racinggame.AlwaysGo;
import racinggame.RunRacing;
import racinggame.RacingStatus;

import static org.assertj.core.api.Assertions.assertThat;

class RunRacingTest {

    private final RacingStatus testRacing1 = new RacingStatus(3, 5);
    private final RacingStatus testRacing2 = new RacingStatus(5, 3);

    @Test
    @DisplayName("레이싱 시작 상태 테스트")
    public void randomNumberTest() {
        String[] testCarList1 = new String[]{"-", "-", "-"};
        String[] testCarList2 = new String[]{"-", "-", "-", "-", "-"};

        assertThat(testRacing1.getRacingCars()).isEqualTo(testCarList1);
        assertThat(testRacing2.getRacingCars()).isEqualTo(testCarList2);
    }

    @Test
    @DisplayName("이동 횟수 테스트")
    public void moveTest() {

        String[] testCarList1 = new String[]{"------", "------", "------"};
        String[] testCarList2 = new String[]{"----", "----", "----", "----", "----"};

        RunRacing race = new RunRacing();
        AlwaysGo alwaysGo = new AlwaysGo();

        race.runRace(testRacing1, alwaysGo);
        race.runRace(testRacing2, alwaysGo);

        assertThat(testRacing1.getRacingCars()).isEqualTo(testCarList1);
        assertThat(testRacing2.getRacingCars()).isEqualTo(testCarList2);
    }

}