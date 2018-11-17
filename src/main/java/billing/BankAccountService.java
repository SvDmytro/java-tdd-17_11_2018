package billing;

import java.util.HashMap;
import java.util.Map;

public class BankAccountService {
    Map<String,Double> bankAcountMap;

    public BankAccountService() {
        bankAcountMap = new HashMap<>();
        bankAcountMap.put("21321423523",1245.2);
        bankAcountMap.put("12456",1235.2);
        bankAcountMap.put("111111",5545.2);
        bankAcountMap.put("32678",12345.2);
    }

    public Double returnAccountAmount(String accountNumber) {
        return bankAcountMap.get(accountNumber);
    }

    public Boolean canHandlePayment(String accountNumber,Double ammount) {
        return bankAcountMap.get(accountNumber) - ammount >= 0;
    }


    public boolean doPayment(Double amount,String accounNumber){
        return bankAcountMap.get(accounNumber) - amount >= 0;
    }
}
