package racingcar;

public class Car {

    private final String name;
    private String state;

    public Car(String name) {
        this.name = name;
        this.state = "";
    }

    public void move() {
        this.state += "-";
    }

    @Override
    public String toString() {
        return this.name + " : " + this.state;
    }

    public String getName() {
        return this.name;
    }

    public int getState() {
        return this.state.length();
    }
}
