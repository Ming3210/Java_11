package B9;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        setBalance(getBalance() - amount);
        System.out.println("Rút " + amount + " từ tài khoản vãng lai (có thể âm). Số dư hiện tại: " + getBalance());
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Nạp " + amount + " vào tài khoản vãng lai.");
    }

    @Override
    void displayBalance() {
        System.out.println("Số dư tài khoản vãng lai (" + getAccountNumber() + "): " + getBalance());
    }
}
