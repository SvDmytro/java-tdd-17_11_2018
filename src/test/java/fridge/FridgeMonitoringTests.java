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

        Product apple = new Product("apple");

        ProductEntity appleEntity = new ProductEntity(apple, new Date());
        fridgeService.addProduct(appleEntity);

        Assert.assertEquals(1, fridgeService.listItems().size());
        Assert.assertTrue(fridgeService.listItems().contains(appleEntity));
    }


    @Test
    public void addExpiredProductNotListedTest() {
        FridgeService fridgeService = new FridgeService();

        Product apple = new Product("apple");

        long outdatedOffset = 4000;
        ProductEntity appleEntity = new ProductEntity(apple, new Date(System.currentTimeMillis() - outdatedOffset));
        fridgeService.addProduct(appleEntity);

        Assert.assertEquals(0, fridgeService.listItems().size());
    }


}
