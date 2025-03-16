package B4;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV() {
            @Override
            public void turnOff() {
                super.turnOff();
            }

            @Override
            public void turnOn() {
                super.turnOn();
            }
        };
        tv.turnOn();
        tv.turnOff();

        Radio radio = new Radio() {
            @Override
            public void turnOff() {
                super.turnOff();
            }

            @Override
            public void turnOn() {
                super.turnOn();
            }
        };
        radio.turnOn();
        radio.turnOff();
    }
}
