package racinggame;

public class Move {
    public void decideMove(Cars cars, MoveCase moveCase) {
        for (Car car : cars.getRacingCars()) {
            if(moveCase.isMovable()){
                car.move();
            }
        }
    }
}
