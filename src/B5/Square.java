package B5;

public abstract class Square implements Corlorable {
    private double side;
    public String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void display() {
        System.out.println("Color: " + color + ", side: " + side);
    }
}
