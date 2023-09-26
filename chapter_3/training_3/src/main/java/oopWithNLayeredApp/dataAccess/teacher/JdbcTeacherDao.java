package oopWithNLayeredApp.dataAccess.teacher;

import oopWithNLayeredApp.dataAccess.category.CategoryDao;
import oopWithNLayeredApp.dataAccess.course.CourseDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class JdbcTeacherDao implements TeacherDao {

    List<Teacher>teachers;

    public JdbcTeacherDao( ) {
        teachers=new ArrayList<>();
        System.out.println("It works on JDBC.");
    }


    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
        System.out.println(" Teacher Added");
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

}
