package racinggame;

import java.util.Scanner;

public class InputView {
    public InputValue inputCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String inputNames = scanner.nextLine();
        System.out.println("시도 할 횟수는 몇 회 인가요?");
        int racingCount = scanner.nextInt();

        return new InputValue(inputNames, racingCount);
    }
}
