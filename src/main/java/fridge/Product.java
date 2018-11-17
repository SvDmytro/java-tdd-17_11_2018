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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
         Product product = (Product)o;
        return product.getName().contains(this.name) ;
    }

    void setName(final String name) {
        this.name = name;
    }
}

