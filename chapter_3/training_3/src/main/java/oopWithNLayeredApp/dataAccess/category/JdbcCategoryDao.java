package oopWithNLayeredApp.dataAccess.category;

import oopWithNLayeredApp.entities.Category;

import java.util.List;

public class JdbcCategoryDao implements  CategoryDao {



    List<Category>categories;

    public JdbcCategoryDao(List<Category> categories) {
        this.categories = categories;
        System.out.println("It works on jdbc.");
    }

    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("category added");
    }

    @Override
    public List<Category> getAllCategory() {
        return categories;
    }

}
