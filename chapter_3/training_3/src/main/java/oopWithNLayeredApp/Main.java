package oopWithNLayeredApp;

import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.business.TeacherManager;
import oopWithNLayeredApp.dataAccess.HibernateDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Teacher;

import java.awt.*;

public class Main {
    public static void main(String[] args)throws Exception {


        Category category = new Category();
        category.setId(1);
        category.setName("programlama");

        // -----------

        Course course = new Course();
        course.setId(2);
        course.setName("java");
        course.setUnitPrice(400);

        // -----------

        Course course2 = new Course();
        course.setId(4);
        course.setName("C#");
        course.setUnitPrice(5);
        //------
        Teacher teacher = new Teacher();
        teacher.setId(3);
        teacher.setName("Engin Demiroğ");
        teacher.setMail("sss@gg");
        //----
        Teacher teacher2 = new Teacher();
        teacher.setId(3);
        teacher.setName("Engin Demiroğ");
        teacher.setMail("sss@gg");
        //-----
        Teacher teacher3 = new Teacher();
        teacher.setId(3);
        teacher.setName("ALİ");
        teacher.setMail("sss@gg");

        TeacherManager teacherManager = new TeacherManager(new HibernateDao());
        teacherManager.add(teacher);

        CategoryManager categoryManager = new CategoryManager(new HibernateDao());
        categoryManager.add(category);

        CourseManager courseManager= new CourseManager(new HibernateDao());
        courseManager.add(course);



    }}