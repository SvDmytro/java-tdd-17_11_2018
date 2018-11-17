package billing;

import org.junit.Assert;
import org.junit.Test;


public class BankAccountTest {

    @Test
    public void bankAccountShouldReturnAmount() {
        BankAccountService bankAccountService = new BankAccountService();

        Assert.assertNotNull(bankAccountService.returnAccountAmount("21321423523"));
    }

    @Test
    public void bankAccountServiceShouldDoPayment() {
        BankAccountService bankAccountService = new BankAccountService();

        Assert.assertTrue(bankAccountService.doPayment(12.55, "21321423523"));
    }

    @Test
    public void bankAccountServiceShouldHaveEnoughMoney() {
        BankAccountService bankAccountService = new BankAccountService();
        Assert.assertTrue(bankAccountService.canHandlePayment("21321423523",12.55));
    }
}
