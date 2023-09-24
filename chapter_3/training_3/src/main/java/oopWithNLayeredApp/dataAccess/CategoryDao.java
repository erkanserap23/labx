package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    List<Category>getAllCategory();
}
