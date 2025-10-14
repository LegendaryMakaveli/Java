import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBankAccount {
    @Test
    public void TestBankAccount() {
        BankAccount bankAccount = new BankAccount("Adeyemo");
        bankAccount.setName("Ikkaveli");
        assert(bankAccount.getName().equals("Ikkaveli"));
    }

    @Test
    public void TestDeposit() {
        BankAccount bankAccount = new BankAccount("Adeyemo");
        bankAccount.deposit(5000);
        assertEquals(5000, bankAccount.getBalance());
    }

    @Test
    public void TestWithdraw() {
        BankAccount bankAccount = new BankAccount("Adeyemo");
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);
        assertEquals(3000, bankAccount.getBalance());
    }

    @Test
    public void TestShowBalance() {
        BankAccount bankAccount = new BankAccount("Adeyemo");
        bankAccount.deposit(5000);
        assertEquals(5000, bankAccount.showBalance());
    }

    @Test
    public void TestWithdrawException() {
        BankAccount bankAccount = new BankAccount("Adeyemo");
        bankAccount.deposit(5000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(6000);
        });
        String expectedMessage = "Insufficient funds";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void TestDepositException() {
        BankAccount bankAccount = new BankAccount("Adeyemo");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(-5000);
        });
        String expectedMessage = "Deposit amount must be positive";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
