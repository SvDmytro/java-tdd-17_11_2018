package fridge;


// abstract product
public class Product {
    private String name;

    public Product(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }
}

