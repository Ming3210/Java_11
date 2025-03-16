package B7;

public class Main {
    public static void main(String[] args) {
        Employee partTime = new PartTimeEmployee("Abc", 15, 6);
        Employee fullTime = new FullTimeEmployee("Xyz", 20);

        System.out.println(partTime.getName() + " gain: " + partTime.calculateSalary());
        System.out.println(fullTime.getName() + " gain: " + fullTime.calculateSalary());
    }
}
