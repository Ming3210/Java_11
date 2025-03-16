package B9;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Không thể rút quá số dư hiện có.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Rút thành công " + amount + " từ tài khoản tiết kiệm.");
        }
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Nạp " + amount + " vào tài khoản tiết kiệm.");
    }

    @Override
    void displayBalance() {
        System.out.println("Số dư tài khoản tiết kiệm (" + getAccountNumber() + "): " + getBalance());
    }
}
