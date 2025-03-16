package B5;

public abstract class Circle implements  Corlorable{
    private String color;
    private double radius;




    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void display(){
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
    }
}
