package HW_1_2;

public abstract class Car {
    public String engine;
    private String color;
    private String name;

    public Car(String engine, String color, String name) {
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
