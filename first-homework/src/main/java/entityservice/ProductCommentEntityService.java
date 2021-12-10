package entityservice;

import dao.ProductCommentDAO;
import dto.ProductCommentCountDTO;
import dto.ProductCommentDTO;
import dto.ProductUserCommentDTO;

import java.util.List;

public class ProductCommentEntityService {

    private ProductCommentDAO productCommentDAO;

    public ProductCommentEntityService() {
        productCommentDAO = new ProductCommentDAO();
    }

    public List<ProductCommentDTO> findAllProductCommentDTO(Long id) {
        return productCommentDAO.findAllProductCommentDTOByProductId(id);
    }

    public List<ProductCommentCountDTO> findAllNumberOfProductComment()
    {
        return productCommentDAO.findAllNumberOfProductComment();
    }

    public List<ProductUserCommentDTO> findAllUserCommentDTOByUserId(Long id)
    {
        return productCommentDAO.findAllUserCommentDTOByUserId(id);
    }
}
