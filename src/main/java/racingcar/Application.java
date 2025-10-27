package racingcar;

import racingcar.valid.carNameValid;
import racingcar.valid.tryCountValid;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    private final InputView inputView = new InputView();

    void run() {
        String carNames = inputView.readCarNames();
        new carNameValid(carNames);
        String tryCount = inputView.readTryCount();
        new tryCountValid(tryCount);
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
