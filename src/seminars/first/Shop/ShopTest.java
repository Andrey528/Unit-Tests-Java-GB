package seminars.first.Shop;

import org.assertj.core.api.Condition;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    public static void main(String[] args) {
        Shop shop = new Shop();

        List products = new ArrayList<>();
        products.add(new Product(30, "Water"));
        products.add(new Product(24, "Bread"));
        products.add(new Product(160, "Orange Juicy"));
        products.add(new Product(62, "Milk"));
        products.add(new Product(70, "Rice"));

        shop.setProducts(products);

        System.out.println(shop.sortProductsByPrice());
        System.out.println(shop.getMostExpensiveProduct());

        assertThat(shop.sortProductsByPrice()).hasSize(5);

        assertThat(isSorted(shop.getProducts())).isEqualTo(true);

        assertThat(shop.sortProductsByPrice()).extracting("title").contains("Milk", "Rice", "Bread", "Orange Juicy", "Water");
        assertThat(shop.sortProductsByPrice()).extracting("cost").contains(30, 24, 160, 62, 70);

        assertThat(shop.getMostExpensiveProduct()).extracting("cost").isEqualTo(160);
    }

    public static boolean isSorted(List<Product> products) {
        if (products.isEmpty() || products.size() == 1) {
            return true;
        }

        Iterator<Product> iter = products.iterator();
        Product current, previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (previous.getCost() < current.getCost()) {
                return false;
            }
            previous = current;
        }
        return true;
    }
}