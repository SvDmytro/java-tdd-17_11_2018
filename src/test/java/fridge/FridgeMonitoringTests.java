package fridge;


import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


public class FridgeMonitoringTests {


    private Product apple = new Product("apple");
    private Product plum = new Product("plum");
    private Product chocolate = new Product("chocolate");


    @Test
    public void listEmptyFridgeTest() {
        FridgeService fridgeService = new FridgeService();

        Assert.assertEquals(0, fridgeService.listNonexpiredItems().size());
    }


    @Test
    public void addProductTest() {
        FridgeService fridgeService = new FridgeService();


        long timeOffset = 24*60*60*1000;
        Date nonExpiredDate = new Date(System.currentTimeMillis() + timeOffset);
        ProductEntity nonExpiredApple = new ProductEntity(apple, nonExpiredDate);
        fridgeService.addProduct(nonExpiredApple);

        Assert.assertEquals(1, fridgeService.listNonexpiredItems().size());
        Assert.assertTrue(fridgeService.listNonexpiredItems().contains(nonExpiredApple));
    }


    @Test
    public void addExpiredProductNotListedTest() {
        FridgeService fridgeService = new FridgeService();

        long outdatedOffset = 4000;
        Date expiredDate = new Date(System.currentTimeMillis() - outdatedOffset);
        ProductEntity expiredApple = new ProductEntity(apple, expiredDate);
        fridgeService.addProduct(expiredApple);

        Assert.assertEquals(0, fridgeService.listNonexpiredItems().size());
    }


    @Test
    public void findByProductTest() {
        FridgeService fridgeService = new FridgeService();

        ProductEntity expiredApple = new ProductEntity(apple);
        ProductEntity freshApple = new ProductEntity(apple, new Date(System.currentTimeMillis() + 800000));

        ProductEntity expiredPlum = new ProductEntity(plum);

        fridgeService.addProduct(expiredApple);
        fridgeService.addProduct(expiredPlum);
        fridgeService.addProduct(freshApple);

        Assert.assertEquals(2, fridgeService.findByProduct(apple).size());
        Assert.assertEquals(1, fridgeService.findByProduct(plum).size());
        Assert.assertEquals(0, fridgeService.findByProduct(chocolate).size());

    }
}
