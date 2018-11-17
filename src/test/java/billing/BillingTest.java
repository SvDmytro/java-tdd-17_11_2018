package billing;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BillingTest {

    @Test
    public void billingServiceShouldHandleOrder() {
        OrderService orderService = new OrderService();
        BankAccountService bankAccountService = new BankAccountService();

        BillingService billingService = new BillingService(bankAccountService,orderService);
        Assert.assertTrue(billingService.handleOrder("123124",123.00));
    }
}
