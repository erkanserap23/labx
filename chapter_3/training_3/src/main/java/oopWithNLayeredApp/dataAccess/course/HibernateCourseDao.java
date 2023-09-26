package oopWithNLayeredApp.dataAccess.course;

import oopWithNLayeredApp.dataAccess.teacher.TeacherDao;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao {

    List<Course>courses;


    public HibernateCourseDao() {
        courses = new ArrayList<>();
        System.out.println("It works on Hibernate.");
    }


    @Override
    public void add(Course course) {
        courses.add(course);
        System.out.println("Course Hibernate added");

    }
}
