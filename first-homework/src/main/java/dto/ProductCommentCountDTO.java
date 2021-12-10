package dto;

import java.math.BigDecimal;

public class ProductCommentCountDTO {

    private Long productId;
    private String productName;
    private BigDecimal productPrice;
    private Long numberOfComments;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return productPrice;
    }

    public void setPrice(BigDecimal price) {
        this.productPrice = price;
    }

    public Long getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(Long numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public ProductCommentCountDTO(Long productId, String productName, BigDecimal productPrice, Long numberOfComments) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.numberOfComments = numberOfComments;
    }

    @Override
    public String toString() {
        return "ProductCommentCountDTO{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice + '\'' +
                ", numberOfComments=" + numberOfComments +
                '}';
    }
}
