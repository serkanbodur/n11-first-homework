package applications;

import entity.Product;
import entityservice.ProductEntityService;

public class FindById {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        Product urun = service.findById(1L);

        System.out.println(urun);
    }
}
