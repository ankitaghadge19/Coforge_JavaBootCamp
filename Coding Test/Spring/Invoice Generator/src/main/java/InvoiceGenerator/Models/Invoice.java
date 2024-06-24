package InvoiceGenerator.Models;

public class Invoice {
    private Product prod_order;

    public Invoice(Product prod_order) {
        this.prod_order = prod_order;
    }

    public Product getProdOrder() {
        return prod_order;
    }

    public void setProdOrder(Product prod_order) {
        this.prod_order = prod_order;
    }

    public void generateInvoice() {
        System.out.println("Order details:");
        System.out.println(prod_order.getItem() + ", " + prod_order.getPrice());
    }
}
