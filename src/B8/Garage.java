package B8;

public class Garage {
    Car[] cars;
    int count;

    public Garage(int size) {
        cars = new Car[size];
        count = 0;
    }

    void addCar(Car car) {
        if (count < cars.length) {
            cars[count++] = car;
        }
    }

    void showActions() {
        for (int i = 0; i < count; i++) {
            System.out.println(cars[i].start());
            System.out.println(((Refuelable) cars[i]).refuel());
            System.out.println(cars[i].stop());
        }
    }
}
