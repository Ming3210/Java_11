package B10;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(2);

        Manager manager = new Manager("AAAss", 8000);
        Developer developer = new Developer("Ming", 5000);

        company.addEmployee(manager);
        company.addEmployee(developer);

        company.startWork();
        company.organizeMeeting();
    }
}
