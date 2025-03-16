package B7;

abstract class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;



     public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public Employee() {
    }



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    abstract public int calculateSalary();
}
