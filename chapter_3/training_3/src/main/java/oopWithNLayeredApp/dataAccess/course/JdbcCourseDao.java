package oopWithNLayeredApp.dataAccess.course;

import oopWithNLayeredApp.dataAccess.teacher.TeacherDao;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao{

    List<Course>courses;


    public JdbcCourseDao() {
        courses = new ArrayList<>();
        System.out.println("It works on JDBC.");
    }


    @Override
    public void add(Course course) {
        courses.add(course);
        System.out.println("Course added");

    }
}
