package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class HibernateDao implements  CourseDao ,TeacherDao ,CategoryDao{

   List<Teacher>teachers;
    List<Category>categories;
    List<Course>courses;

    public HibernateDao() {
      teachers = new ArrayList<>();
      categories=new ArrayList<>();
      courses=new ArrayList<>();
        System.out.println("It works on Hibernate.");
    }



    @Override
    public void add(Course course) {
    courses.add(course);
    }


    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void add(Category category) {
        categories.add(category);

    }

    @Override
    public List<Category> getAllCategory() {

        return categories;
    }
}
