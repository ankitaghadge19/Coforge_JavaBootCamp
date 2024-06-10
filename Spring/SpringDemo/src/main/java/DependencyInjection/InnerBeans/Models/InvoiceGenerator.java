package DependencyInjection.InnerBeans.Models;

public class InvoiceGenerator {
    private Product prod_order;

    public InvoiceGenerator(Product prod_order) {
        this.prod_order = prod_order;
    }

    public Product getProdOrder() {
        return prod_order;
    }

    public void setProdOrder(Product prod_order) {
        this.prod_order = prod_order;
    }

    public void generateInvoice(){
        System.out.println("Getting Orders details... "+prod_order.getItem());
    }
}
