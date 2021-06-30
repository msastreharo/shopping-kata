import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ProductTest {

    @Test
    void elPrecioDeLosProductosGratuitosEsSiempreCero() {
        FreeProduct freeProduct = new FreeProduct("perejil");

        assertThat(freeProduct.getPrice(), equalTo(0.0));
    }

    @Test
    void elPrecioDeLosProductosSinDescuentoEsElPrecioOriginal() {
        FoodProduct milk = new FoodProduct("milk", 0.99);
        FoodProduct juice = new FoodProduct("juice", 1.99);

        assertThat(milk.getPrice(), equalTo(0.99));
        assertThat(juice.getPrice(), equalTo(1.99));
    }

    @Test
    void elPrecioDeLosProductosConDescuentoSuperEsDiezPorcientoMenor() {
        DiscountedProduct discountedAvocados = new DiscountedProduct("avocados", 2.0);
        DiscountedProduct discountedFuet = new DiscountedProduct("fuet", 1.0);

        assertThat(discountedAvocados.getPrice(), equalTo(1.80));
        assertThat(discountedFuet.getPrice(), equalTo(0.90));
    }

    @Test
    void elPrecioDeLosProductosConDescuentoMegaEsVeinticincoPorcientoMenor() {
        SuperDiscountedProduct superDiscountedApples = new SuperDiscountedProduct("apples", 1.0);
        SuperDiscountedProduct superDiscountedSalmon = new SuperDiscountedProduct("salmon", 10.0);

        assertThat(superDiscountedApples.getPrice(), equalTo(0.75));
        assertThat(superDiscountedSalmon.getPrice(), equalTo(7.50));
    }
}
