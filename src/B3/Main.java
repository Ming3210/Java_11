package B3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            protected void displayInfo() {
                super.displayInfo();
            }
        };
        car.displayInfo();

        Bike bike = new Bike() {
            @Override
            public void displayInfo() {
                super.displayInfo();
            }
        };
        bike.displayInfo();
    }
}
