package applications;

import entity.Product;
import entityservice.ProductEntityService;

import java.math.BigDecimal;
import java.util.List;

public class findGeLeApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<Product> productList = service.findAllProductListByPriceGeAndPriceLe(BigDecimal.valueOf(100), BigDecimal.valueOf(1000));

        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
