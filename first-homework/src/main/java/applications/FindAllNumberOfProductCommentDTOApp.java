package applications;

import dto.ProductCommentCountDTO;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class FindAllNumberOfProductCommentDTOApp {
    public static void main(String[] args) {
        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductCommentCountDTO> productCommentCountDTOList = service.findAllNumberOfProductComment();

        for (ProductCommentCountDTO productCommentCountDTO : productCommentCountDTOList) {

            // If you remove the comments then run program again, numberOfComments will be null
            // But i left it that way because I didn't understand exactly what we were going to do here
            // and I thought it would be more correct to see the count value as 0.

            /*
            int i = productCommentCountDTO.getNumberOfComments().intValue();

            if (i == 0)
            {
                String s = " ";
                ((String) productCommentCountDTO.getNumberOfComments());
            }
             */
            
            System.out.println(productCommentCountDTO);

        }
    }
}
