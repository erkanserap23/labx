package oopWithNLayeredApp;

import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.business.TeacherManager;
import oopWithNLayeredApp.dataAccess.category.HibernateCategoryDao;
import oopWithNLayeredApp.dataAccess.course.HibernateCourseDao;
import oopWithNLayeredApp.dataAccess.teacher.HibernateTeacherDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {


        Category category1 = new Category(1,"programlama");

        Category category2 = new Category(2,"programlama");

        Category category3 = new Category(3,"teknik");


        // -----------

        Course course = new Course();
        course.setId(2);
        course.setName("java");
        course.setUnitPrice(400);

        // -----------

        Course course2 = new Course();
        course2.setId(4);
        course2.setName("C#");
        course2.setUnitPrice(5);
        //------
        Teacher teacher1 = new Teacher();
        teacher1.setId(3);
        teacher1.setName("Engin Demiroğ");
        teacher1.setMail("sss@gg");
        //----
        Teacher teacher2 = new Teacher();
        teacher2.setId(3);
        teacher2.setName("Engin Demiroğ");
        teacher2.setMail("sss@gg");
        //-----
        Teacher teacher3 = new Teacher();
        teacher3.setId(3);
        teacher3.setName("ALİ");
        teacher3.setMail("sss@gg");

        TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao());
        teacherManager.add(teacher1);
        teacherManager.add((teacher2));
        teacherManager.add((teacher3));


        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);

       // categoryManager.getAllCategory();

        CourseManager courseManager= new CourseManager(new HibernateCourseDao());
        courseManager.add(course);
        courseManager.add(course2);


        for (Teacher teachers: teacherManager.getAll()){
            System.out.println(teachers.getName());
        }
        for (Category category: categoryManager.getAllCategory()){
            System.out.println(category.getName());
        }


    }}