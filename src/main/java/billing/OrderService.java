package billing;

import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private Map<String,Order> ordersMap;

    public OrderService() {
        ordersMap = new HashMap<>();
        ordersMap.put("123124",new Order("123124","21321423523",1231.0));
        ordersMap.put("44",new Order("44","12456",1231.0));
        ordersMap.put("22",new Order("22","111111",1231.0));
        ordersMap.put("111",new Order("111","32678",1231.0));
    }
    public String getAccountNumberFromOrderById(String orderId){
        return ordersMap.get(orderId).getBankAccount();
    }
}
