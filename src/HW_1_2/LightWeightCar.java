package HW_1_2;

public class LightWeightCar extends Car implements Function {

    public LightWeightCar(String engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    public void move() {
        System.out.println("car is moving");
    }

    @Override
    public void stop() {
        System.out.println("car is stop");
    }

    @Override
    public void start() {
        System.out.println("car is start");
    }

    @Override
    public void open() {
        System.out.println("car is open");
    }
}
