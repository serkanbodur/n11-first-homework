package applications;

import dto.ProductUserCommentDTO;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class FindAllUserCommentDTOApp {
    public static void main(String[] args) {
        ProductCommentEntityService service = new ProductCommentEntityService();

        // If 7L value is given to function so t
        List<ProductUserCommentDTO> productUserCommentDTOList = service.findAllUserCommentDTOByUserId(4L);

        for (ProductUserCommentDTO productUserCommentDTO : productUserCommentDTOList) {
            System.out.println(productUserCommentDTO);
        }
    }
}
