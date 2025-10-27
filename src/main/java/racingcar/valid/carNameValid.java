package racingcar.valid;

import java.util.Arrays;
import java.util.List;

public final class CarNameValid {

    public CarNameValid(String carNames) {
        if (carNames.isEmpty()) {
            throw new IllegalArgumentException("경주할 자동차 이름을 입력해주세요.");
        }

        if (!carNames.contains(",")) {
            throw new IllegalArgumentException("자동차 이름은 쉼표(,)로 구분해야 합니다.");
        }
        validateCarNames(carNames);
    }

    public void validateCarNames(String carNames) {
        List<String> names = Arrays.asList(carNames.split(","));

        names.stream().forEach(name -> {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하로 입력해야 합니다.");
            }

            if (!name.matches("[a-zA-Z0-9]+")) {
                throw new IllegalArgumentException("자동차 이름에 허용되지 않은 문자가 포함되어 있습니다: ");
            }
        });
    }

}
