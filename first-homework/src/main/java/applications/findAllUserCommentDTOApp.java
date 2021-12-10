package applications;

import dto.ProductCommentDTO;
import dto.ProductUserCommentDTO;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class findAllUserCommentDTOApp {
    public static void main(String[] args) {
        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductUserCommentDTO> productUserCommentDTOList = service.findAllUserCommentDTOByUserId(2L);

        for (ProductUserCommentDTO productUserCommentDTO : productUserCommentDTOList) {
            System.out.println(productUserCommentDTO);
        }
    }
}
