package B5;

public abstract class Rectangle implements Corlorable{
    private double width;
    private double length;
    private String color;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void display(){
        System.out.println("Rectangle: width = " + width + ", length = " + length + ", color = " + color);
    }
}
