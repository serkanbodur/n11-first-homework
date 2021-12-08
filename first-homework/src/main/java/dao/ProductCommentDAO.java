package dao;

import base.BaseDao;
import dto.ProductCommentDTO;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentDAO extends BaseDao {

    public List<ProductCommentDTO> findAllProductCommentDTOByProductId(Long id)
    {
        String sql = " select " +
                " new dto.ProductCommentDTO( product.name, product.category.name, product.price, user.name, user.surname,user.email,user.phone,product_comment.comment,product_comment.commentDate) " +
                " from ProductComment product_comment " +
                " left join Product product  on product_comment.product.id = product.id " +
                " left join User user on product_comment.user.id = user.id " +
                " where product.id = :id ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }
}
