package applications;

import dto.ProductUserCommentDTO;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class FindAllUserCommentDTOApp {
    public static void main(String[] args) {
        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductUserCommentDTO> productUserCommentDTOList = service.findAllUserCommentDTOByUserId(3L);

        for (ProductUserCommentDTO productUserCommentDTO : productUserCommentDTOList) {
            System.out.println(productUserCommentDTO);
        }
    }
}
