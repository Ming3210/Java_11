package B8;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(2);
        garage.addCar(new ElectricCar("Tesla Model 3", 2023, 50000));
        garage.addCar(new GasCar("Toyota Camry", 2022, 35000));

        garage.showActions();
    }
}
