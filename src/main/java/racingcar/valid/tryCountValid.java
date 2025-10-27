package racingcar.valid;

public final class tryCountValid {

    public tryCountValid(String tryCount) {
        if (tryCount.isEmpty()) {
            throw new IllegalArgumentException("시도할 횟수를 입력해주세요.");
        }

        // if (!tryCount.matches("\\d+")) {
        //     throw new IllegalArgumentException("시도할 횟수는 숫자여야 합니다.");
        // }
    }
}
