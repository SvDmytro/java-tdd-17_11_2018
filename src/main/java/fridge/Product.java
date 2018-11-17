package fridge;

import java.util.Date;
import java.util.Objects;

public class Product {
    String name;
    Date expirationDate;

    public Product(final String name, final Date date) {
        this.name = name;
        this.expirationDate = date;
    }


    String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(expirationDate, product.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, expirationDate);
    }
}
