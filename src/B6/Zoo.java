package B6;

public  class Zoo {
    Animal[] animals = new Animal[10];
    int count = 0;
    void addAnimal(Animal animal) {
        if (count < animals.length) animals[count++] = animal;
    }
    void showAnimals() {
        for (int i = 0; i < count; i++) {
            animals[i].sound();
            animals[i].move();
        }
    }
}
