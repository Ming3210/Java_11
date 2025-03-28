package B6;

public abstract class Animal {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void sound();
    abstract void move();
}
