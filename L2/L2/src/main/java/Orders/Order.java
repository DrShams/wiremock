package Orders;

import Products.Product;

import java.util.List;
public class Order {
    public static int id;
    public List<Product> productList;

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                '}';
    }

    public Order(List<Product> productList) {
        id++;
        this.productList = productList;
    }

}
