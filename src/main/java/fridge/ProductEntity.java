package fridge;

import java.util.Date;


public class ProductEntity {
    private Product product;
    private Date expirationDate;

    public ProductEntity(final Product product, final Date date) {
        this.product = product;
        this.expirationDate = date;
    }

    ProductEntity(final Product product) {
        this.product = product;
        this.expirationDate = new Date();
    }

    Product getProduct() {
        return product;
    }

    void setProduct(final Product product) {
        this.product = product;
    }

    boolean isNotExpired() {
        return this.expirationDate.after(new Date());
    }
}
