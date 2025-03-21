package B3;

public abstract class Vehicle {
    private String name;
    private int speed;

    protected abstract void displayInfo();

    public Vehicle() {
    }

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void start(){
        System.out.println("Vehicle is starting");
    }


}
