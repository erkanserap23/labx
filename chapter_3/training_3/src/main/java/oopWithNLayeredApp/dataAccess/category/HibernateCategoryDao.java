package oopWithNLayeredApp.dataAccess.category;

import oopWithNLayeredApp.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements  CategoryDao {


    List<Category>categories;


    public HibernateCategoryDao() {
      categories=new ArrayList<>();
        System.out.println("It works on Hibernate.");
    }


    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("category  Hibernate added");

    }

    @Override
    public List<Category> getAllCategory() {
        return categories;
    }
}
