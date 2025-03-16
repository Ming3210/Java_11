package B10;

public class Manager extends Employee implements AttendMeeting{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    String work() {
        return "Quản lý " + getName() + " (Lương: " + getSalary() + ") đang giám sát dự án";
    }

    @Override
    String takeVacation() {
        return "Quản lý " + getName() + " (Lương: " + getSalary() + ") đang đi nghỉ phép tại Pháp.";
    }

    @Override
    public String attendMeeting() {
        return "Quản lý " + getName() + " (Lương: " + getSalary() + ") đang tham gia cuộc họp";
    }
}
