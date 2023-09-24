package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Teacher;

import java.util.List;

public class JdbcDao implements TeacherDao,CategoryDao, CourseDao  {
    @Override
    public void add(Category category) {

    }

    @Override
    public void add(Course course) {

    }

    @Override
    public void add(Teacher teacher) {

    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }
}
