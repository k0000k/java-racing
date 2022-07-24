package racinggame;

public class ResultView {
    public void printRace(RacingStatus car) {
        for (String string : car.getRacingCars()) {
            System.out.println(string);
        }
        System.out.println();
    }
}
