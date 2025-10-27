package racingcar.view;

public class OutputView {

    String result;
    String winner;

    public OutputView(String result, String winner) {
        this.result = result;
        this.winner = winner;
    }

    public void run() {
        System.out.println("실행 결과");
        System.out.println(result);
        System.out.println("최종 우승자 : " + winner);
    }
}
