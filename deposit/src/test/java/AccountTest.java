import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Before All");
    }

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    public void depositTests() {
        account.deposit(750);
        assertEquals(750, account.getBalance());
        account.deposit(-300);
        assertEquals(750, account.getBalance());
    }

    @Test
    public void withdrawalTests() {
        account.deposit(750);
        assertEquals(90, account.withdraw(90));
        assertEquals(0.0, account.withdraw(-6));
        assertEquals(0.0, account.withdraw(980));
        assertEquals(660, account.getBalance());
    }
    @Test
    public void largerBalance() {
        account.deposit(9500);
        assertEquals(9500, account.getBalance());
        assertEquals(0.0, account.withdraw(5000));
        account.setWithdrawLimit(5000);
        assertEquals(5000, account.withdraw(5000));
    }

    @Test
    public void testInitialBalanceIsZero() {
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void testDepositPositiveAmount() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testDepositNegativeAmount() {
        account.deposit(-50.0);
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void testWithdrawValidAmount() {
        account.deposit(200.0);
        double withdrawn = account.withdraw(150.0);
        assertEquals(150.0, withdrawn);
        assertEquals(50.0, account.getBalance());
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        account.deposit(100.0);
        double withdrawn = account.withdraw(150.0);
        assertEquals(0.0, withdrawn);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testWithdrawNegativeAmount() {
        account.deposit(100.0);
        double withdrawn = account.withdraw(-20.0);
        assertEquals(0.0, withdrawn);
        assertEquals(100.0, account.getBalance());
    }
    @AfterEach
    void tearDown() {
        account = null;
    }
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("After All");
    }
}
