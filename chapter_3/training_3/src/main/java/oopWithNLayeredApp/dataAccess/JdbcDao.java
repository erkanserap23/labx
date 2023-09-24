package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Teacher;

import java.util.List;

public class JdbcDao implements  CourseDao ,TeacherDao,CategoryDao{


    @Override
    public void add(Course course) {
        System.out.println("çalıştım");
    }


    @Override
    public void add(Teacher teacher) {
        System.out.println("çalıştım");
    }


    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public void add(Category category) {

    }

    @Override
    public List<Category> getAllCategory() {
        return null;
    }
}
