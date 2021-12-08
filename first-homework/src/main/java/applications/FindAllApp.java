package applications;

import entity.Product;
import entityservice.ProductEntityService;

import java.util.List;

public class FindAllApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<Product> urunList = service.findAll();

        for (Product urun : urunList) {
            System.out.println(urun);
        }
    }
}
