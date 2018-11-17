import fridge.Product;

public class Ingredient {

    private Product product;
    private UnitEnum unit;
    private int quantity;

   public Ingredient(Product product, UnitEnum unit, int quantity) {
       this.product = product;
       this.unit = unit;
       this.quantity = quantity;

   }

   public int getQuantity() {
       return quantity;
   }


}
