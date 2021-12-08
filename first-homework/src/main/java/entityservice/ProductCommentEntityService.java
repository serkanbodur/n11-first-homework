package entityservice;

import dao.ProductCommentDAO;
import dto.ProductCommentDTO;

import java.util.List;

public class ProductCommentEntityService {

    private ProductCommentDAO productCommentDAO;

    public ProductCommentEntityService() {
        productCommentDAO = new ProductCommentDAO();
    }

    public List<ProductCommentDTO> findAllProductCommentDTO(Long id) {
        return productCommentDAO.findAllProductCommentDTOByProductId(id);
    }
}
