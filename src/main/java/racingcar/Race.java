package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Randoms;

public class Race {
    int tryCount = 0;
    List<String> carNameList = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();

    public Race(String carNames, String tryCount) {
        carNameList = List.of(carNames.split(","));
        this.tryCount = Integer.parseInt(tryCount);
    }

    public void makeCars() {
        this.cars = this.carNameList.stream()
                    .map(name -> new Car(name))
                    .collect(Collectors.toList());
    }

    public boolean isMove() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        return randomNumber >= 4;
    }

    public void moveCars() {
        cars.forEach((car) -> {
            if (isMove()) {
                car.move();
            }
            car.print();
        });
    }

    public void run() {
        makeCars();

        for (int i = 0; i < tryCount; i++) {
            moveCars();
            System.out.println();
        }
    }
    
}
