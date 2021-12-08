package entityservice;

import dao.CategoryDAO;
import entity.Category;

import java.util.List;

public class CategoryEntityService {

    private CategoryDAO categoryDAO;

    public CategoryEntityService() {
        categoryDAO = new CategoryDAO();
    }

    public List<Category> findAll(){
        return categoryDAO.findAll();
    }
}
