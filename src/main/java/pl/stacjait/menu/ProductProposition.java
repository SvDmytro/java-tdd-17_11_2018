package pl.stacjait.menu;

/**
 * Created by konto on 17/11/2018.
 */
public class ProductProposition {
    private Product product;
    private long amount;

    public ProductProposition(Product product, long amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public long getAmount() {
        return amount;
    }
}
