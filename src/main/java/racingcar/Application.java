package racingcar;

import racingcar.valid.carNameValid;
import racingcar.valid.tryCountValid;
import racingcar.View.InputView;
import racingcar.View.OutputView;

public class Application {

    private final InputView inputView = new InputView();

    public void run() {
        String carNames = inputView.readCarNames();
        carNameValid carNameValid = new carNameValid(carNames);
        String tryCount = inputView.readTryCount();
        tryCountValid tryCountValid = new tryCountValid(tryCount);
        Race race = new Race(carNames, tryCount);
        race.run();
        String result = race.getResult();
        String winner = race.getWinner();
        OutputView output = new OutputView(result, winner);
        output.run();
    }

    public static void main(String[] args) {
        new Application().run();
    }
}
