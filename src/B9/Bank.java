package B9;

public class Bank {
    private BankAccount[] accounts;
    private int count;

    public Bank(int size) {
        accounts = new BankAccount[size];
        count = 0;
    }

    void addAccount(BankAccount account) {
        if (count < accounts.length) {
            accounts[count++] = account;
        } else {
            System.out.println("Ngân hàng đã đầy, không thể thêm tài khoản mới.");
        }
    }

    void displayBalance() {
        for (int i = 0; i < count; i++) {
            accounts[i].displayBalance();
        }
    }
}
