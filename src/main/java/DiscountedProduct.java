public class DiscountedProduct {
    private String name;
    private double price;

    public DiscountedProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price - (price * 0.10);
    }
}
