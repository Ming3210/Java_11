package B6;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Lion("Simba", 5));
        zoo.addAnimal(new Elephant("Dumbo", 10));
        zoo.showAnimals();

    }
}
