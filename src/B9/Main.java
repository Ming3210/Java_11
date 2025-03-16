package B9;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(2);

        SavingAccount saving = new SavingAccount("1212121212", 1000);
        CheckingAccount checking = new CheckingAccount("2323232323", 500);

        bank.addAccount(saving);
        bank.addAccount(checking);

        saving.deposit(200);
        saving.withdraw(1500);
        checking.withdraw(700);

        bank.displayBalance();
    }
}
