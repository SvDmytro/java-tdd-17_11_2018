package demo.tdd;

import java.time.LocalDate;

public class Product {

    private final String title;
    private final LocalDate expirationDate;

    public Product(final String title, final LocalDate expirationDate) {
        this.title = title;
        this.expirationDate = expirationDate;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}