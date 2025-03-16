package B10;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    String work() {
        return "Lập trình viên " + getName() + " (Lương: " + getSalary() + ") đang viết code cho hệ thống";
    }

    @Override
    String takeVacation() {
        return "Lập trình viên " + getName() + " (Lương: " + getSalary() + ") đang đi nghỉ phép ở HN.";
    }
}
