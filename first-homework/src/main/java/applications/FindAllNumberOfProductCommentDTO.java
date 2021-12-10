package applications;

import dto.ProductCommentCountDTO;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class FindAllNumberOfProductCommentDTO {
    public static void main(String[] args) {
        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductCommentCountDTO> productCommentCountDTOList = service.findAllNumberOfProductComment();

        for (ProductCommentCountDTO productCommentCountDTO : productCommentCountDTOList) {
            System.out.println(productCommentCountDTO);
        }
    }
}