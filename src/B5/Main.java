package B5;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle() {
            @Override
            public void setRadius(double radius) {
                super.setRadius(radius);
            }

            @Override
            public void setColor(String color) {
                super.setColor(color);
            }

            @Override
            public void display() {
                super.display();
            }
        };
        Rectangle rectangle = new Rectangle() {
            @Override
            public void display() {
                super.display();
            }

            @Override
            public void setWidth(double width) {
                super.setWidth(width);
            }

            @Override
            public void setLength(double length) {
                super.setLength(length);
            }

            @Override
            public void setColor(String color) {
                super.setColor(color);
            }
        };
        Square square = new Square() {
            @Override
            public void display() {
                super.display();
            }

            @Override
            public void setColor(String color) {
                super.setColor(color);
            }

            @Override
            public void setSide(double side) {
                super.setSide(side);
            }
        };
        circle.setColor("Red");
        circle.setRadius(5);
        circle.display();
        rectangle.setColor("Blue");
        rectangle.setWidth(4);
        rectangle.setLength(6);
        rectangle.display();
        square.setColor("Green");
        square.setSide(5);
        square.display();
    }
}
