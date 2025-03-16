package B10;

public class Company {
    private Employee[] employees;
    private int count;

    public Company(int size) {
        employees = new Employee[size];
        count = 0;
    }

    void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Công ty đã đạt số lượng nhân viên tối đa.");
        }
    }

    void startWork() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].work());
        }
    }

    void organizeMeeting() {
        for (int i = 0; i < count; i++) {
            if (employees[i] instanceof AttendMeeting) {
                System.out.println(((AttendMeeting) employees[i]).attendMeeting());
            }
        }
    }
}
