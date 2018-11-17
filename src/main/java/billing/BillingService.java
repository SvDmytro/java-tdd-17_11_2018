package billing;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class BillingService {

    BankAccountService bankAccountService;

    OrderService orderService;


    public Boolean handleOrder(String orderId, Double paymentAmount) {
        return bankAccountService.doPayment(paymentAmount,orderService.getAccountNumberFromOrderById(orderId));
    }
}
