package applications;

import dto.ProductCommentDTO;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class FindAllProductCommentApp {
    public static void main(String[] args) {
        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductCommentDTO> productCommentDTOList = service.findAllProductCommentDTO(2L);

        for (ProductCommentDTO productCommentDTO : productCommentDTOList) {
            System.out.println(productCommentDTO);
        }
    }
}
