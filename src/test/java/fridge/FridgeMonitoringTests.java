package fridge;


import org.junit.Assert;
import org.junit.Test;

public class FridgeMonitoringTests {

    @Test
    void listEmptyFridgeTest() {
        FridgeService fridgeService = new FridgeService();

        Assert.assertEquals(0, fridgeService.listItems().size());
    }
}
