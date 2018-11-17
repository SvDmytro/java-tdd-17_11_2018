import org.junit.Assert;
import org.junit.Test;

public class BillingTest {
    @Test
    public void checkBankAccountShouldReturnAccountAmount() {
        BankAccountMock bankAccountMock = new BankAccountMock();
        Assert.assertNotNull(bankAccountMock.returnAmount());
    }
}
