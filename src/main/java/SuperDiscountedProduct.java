public class SuperDiscountedProduct {
    String name;
    double price;

    public SuperDiscountedProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price - (price * 0.25);
    }
}
