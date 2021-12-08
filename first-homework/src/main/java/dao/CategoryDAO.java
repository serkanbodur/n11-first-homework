package dao;

import base.BaseDao;
import entity.Category;
import org.hibernate.query.Query;

import java.util.List;

public class CategoryDAO extends BaseDao {

    public List<Category> findAll(){

        Query query = getCurrentSession().createQuery(
                "select category from Category category");

        return query.list();
    }

}
