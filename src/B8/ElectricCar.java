package B8;

public  class ElectricCar extends Car implements Refuelable{
    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    String start() {
        return "Xe điện " + getModel() + " (Năm SX: " + getYear() + ", Giá: " + getPrice() + ") đã làm gì v";
    }

    @Override
    String stop() {
        return "Xe điện " + getModel() + " (Năm SX: " + getYear() + ", Giá: " + getPrice() + ") đã làm gì đấy";
    }

    @Override
    public String refuel() {
        return "Xe điện " + getModel() + " (Năm SX: " + getYear() + ", Giá: " + getPrice() + ") abcxyz";
    }
}
