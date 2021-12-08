import entity.Category;
import entityservice.CategoryEntityService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        CategoryEntityService service = new CategoryEntityService();
        List<Category> categoryList = service.findAll();

        for (Category category : categoryList) {
            System.out.println(category.getName());
        }
    }
}
