import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void depositTests() {
        Account account = new Account();
        account.deposit(750);
        assertEquals(750, account.getBalance());
        account.deposit(-300);
        assertEquals(750, account.getBalance());
    }

    @Test
    public void withdrawalTests() {
        Account account = new Account();
        account.deposit(750);
        assertEquals(90, account.withdraw(90));
        assertEquals(0.0, account.withdraw(-6));
        assertEquals(0.0, account.withdraw(980));
        assertEquals(660, account.getBalance());
    }
    @Test
    public void largerBalance() {
        Account account = new Account();
        account.deposit(9500);
        assertEquals(9500, account.getBalance());
        assertEquals(0.0, account.withdraw(5000));
        account.setWithdrawLimit(5000);
        assertEquals(5000, account.withdraw(5000));
    }
}
