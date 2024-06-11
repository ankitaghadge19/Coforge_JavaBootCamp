package DependencyInjection.InjectingCollection.Models;

public class ProductDetails {
    private String name;
    private int qty;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, qty=%d, price=%.2f}", name, qty, price);
    }
}
