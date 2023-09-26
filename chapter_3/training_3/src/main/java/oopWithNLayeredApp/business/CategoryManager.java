package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.category.CategoryDao;
import oopWithNLayeredApp.entities.Category;

import java.util.List;

public class CategoryManager {



    private CategoryDao categoryDao;
    public CategoryManager(CategoryDao categoryDao) {

        this.categoryDao = categoryDao;
    }

    public void add(Category categoryX) {
        boolean isActive = true;

        for (Category category : categoryDao.getAllCategory()) {
            if (category.getName().equals(categoryX.getName())) {
                isActive = false;
                System.out.println("The addition was not completed, please change the category name.");
                break; // Eğer aynı isimde bir kategori bulursak döngüyü sonlandırıyoruz.
            }
        }

        if (isActive) {
            categoryDao.add(categoryX);
            System.out.println("Category added: " + categoryX.getName());
        }
    }



    public List<Category> getAllCategory(){
        return categoryDao.getAllCategory();
    }


}
