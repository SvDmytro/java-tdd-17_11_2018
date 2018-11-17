package fridge;


import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


public class FridgeMonitoringTests {

    @Test
    public void listEmptyFridgeTest() {
        FridgeService fridgeService = new FridgeService();

        Assert.assertEquals(0, fridgeService.listNonexpiredItems().size());
    }


    @Test
    public void addProductTest() {
        FridgeService fridgeService = new FridgeService();

        Product apple = new Product("apple");

        long timeOffset = 24*60*60*1000;
        Date nonExpiredDate = new Date(System.currentTimeMillis() + timeOffset);
        ProductEntity appleEntity = new ProductEntity(apple, nonExpiredDate);
        fridgeService.addProduct(appleEntity);

        Assert.assertEquals(1, fridgeService.listNonexpiredItems().size());
        Assert.assertTrue(fridgeService.listNonexpiredItems().contains(appleEntity));
    }


    @Test
    public void addExpiredProductNotListedTest() {
        FridgeService fridgeService = new FridgeService();

        Product apple = new Product("apple");

        long outdatedOffset = 4000;
        Date expiredDate = new Date(System.currentTimeMillis() - outdatedOffset);
        ProductEntity appleEntity = new ProductEntity(apple, expiredDate);
        fridgeService.addProduct(appleEntity);

        Assert.assertEquals(0, fridgeService.listNonexpiredItems().size());
    }
}
