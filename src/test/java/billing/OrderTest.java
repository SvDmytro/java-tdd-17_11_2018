package billing;

import org.junit.Assert;
import org.junit.Test;


public class OrderTest {

    @Test
    public void orderServiceShouldReturnAccountNumber() {
        OrderService orderService = new OrderService();

        Assert.assertNotNull(orderService.getAccountNumberFromOrderById("21321423523"));
    }

}
