package oopWithNLayeredApp.dataAccess.teacher;

import oopWithNLayeredApp.dataAccess.category.CategoryDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class HibernateTeacherDao implements  TeacherDao {

    List<Teacher>teachers;

    public HibernateTeacherDao(  ) {
      teachers=new ArrayList<>();
        System.out.println("It works on Hibernate.");
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
