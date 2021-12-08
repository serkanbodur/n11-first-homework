package entityservice;

import dao.ProductDAO;
import dto.ProductDetailDTO;
import entity.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductEntityService {
    private ProductDAO productDAO;

    public ProductEntityService() {
        productDAO = new ProductDAO();
    }

    public List<Product> findAll() {
        return productDAO.findAll();
    }

    public Product findById(Long id) {
        return productDAO.findById(id);
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe) {
        return productDAO.findAllProductListByPriceGeAndPriceLe(priceGe, priceLe);
    }

    public List<Product> findAllProductListByPriceBetween(BigDecimal priceGe, BigDecimal priceLe) {
        return productDAO.findAllProductListByPriceBetween(priceGe, priceLe);
    }

    public List<Product> findAllProductByCategoryBreakdown(Long breakdown) {
        return productDAO.findAllProductByCategoryBreakdown(breakdown);
    }

    public List<ProductDetailDTO> findAllProductDetailDTOByCategoryBreakdown(Long breakdown) {
        return productDAO.findAllProductDetailDTOByCategoryBreakdown(breakdown);
    }
}
