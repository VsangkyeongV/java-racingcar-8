package racingcar;

import racingcar.valid.CarNameValid;
import racingcar.valid.TryCountValid;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {

    private final InputView inputView = new InputView();

    void run() {
        String carNames = inputView.readCarNames();
        new CarNameValid(carNames);
        String tryCount = inputView.readTryCount();
        new TryCountValid(tryCount);
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
