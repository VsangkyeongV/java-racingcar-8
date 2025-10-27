package racingcar;

public class Car {
    private String name;
    private String state;

    public Car(String name) {
        this.name = name;
        this.state = "";
    }
    
    public void move() {
        this.state += "-";
    }

    public void print() {
        System.out.println(this.name + " : " + this.state);
    }
}
