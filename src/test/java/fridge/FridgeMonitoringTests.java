package fridge;


import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class FridgeMonitoringTests {

    @Test
    public void listEmptyFridgeTest() {
        FridgeService fridgeService = new FridgeService();

        Assert.assertEquals(0, fridgeService.listItems().size());
    }


    @Test
    public void addProductTest() {
        FridgeService fridgeService = new FridgeService();

        Product apple = new Product("apple", new Date());
        fridgeService.addProduct(apple);

        Assert.assertEquals(1, fridgeService.listItems().size());
        Assert.assertTrue(fridgeService.listItems().contains(apple));
    }
}
