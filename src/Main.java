import entities.models.Account;
import entities.models.BusinessAccount;
import entities.models.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1001,"Alex", 1000.0);

        acc1.withDraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002,"Bob", 1000.0, 0.01);
        acc2.withDraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Julia", 1000.0, 100.0 );
        acc3.withDraw(100.0);
        System.out.println(acc3.getBalance());
    }
}