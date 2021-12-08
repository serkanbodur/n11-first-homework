package applications;

import dto.ProductDetailDTO;
import entityservice.ProductEntityService;

import java.util.List;

public class DTOApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<ProductDetailDTO> productDetailDTOList = service.findAllProductDetailDTOByCategoryBreakdown(3L);

        for (ProductDetailDTO productDetailDTO : productDetailDTOList) {
            System.out.println(productDetailDTO);
        }
    }
}
