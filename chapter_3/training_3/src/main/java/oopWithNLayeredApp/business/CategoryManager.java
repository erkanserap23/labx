package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.CategoryDao;
import oopWithNLayeredApp.entities.Category;

import java.util.List;

public class CategoryManager {

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    private CategoryDao categoryDao;



    public void add(Category category) throws Exception {
        for (Category category1 : categoryDao.getAllCategory()) {
            if (category1.getName() == category.getName()) {
                throw  new Exception("The addition was not completed, please change the teacher name.");
                //System.out.println("The addition was not completed, please change the category name.");
            }
            categoryDao.add(category);
            System.out.println("Category added");
        }

    }

    public List<Category> getAllCategory(){
        for (Category category : categoryDao.getAllCategory()) {
            System.out.println(category.getName());
        }
        return categoryDao.getAllCategory();
    }


}
