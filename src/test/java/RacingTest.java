import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import racinggame.RacingStatus;

import static org.assertj.core.api.Assertions.assertThat;

class RacingTest {
    @Test
    @DisplayName("레이싱 시작 상태 테스트")
    public void randomNumberTest() {
        String[] testCarList = new String[] {"-", "-", "-"};
        RacingStatus car = new RacingStatus(3, 5);

        assertThat(car.getRacingCars()).isEqualTo(testCarList);
    }


}