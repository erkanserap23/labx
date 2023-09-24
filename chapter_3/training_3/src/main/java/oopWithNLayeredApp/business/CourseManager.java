package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.CourseDao;
import oopWithNLayeredApp.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }


    public void add(Course curse) throws Exception {

        if(curse.getUnitPrice()<0){
            throw new Exception("The product price is less than 0.");
        }
        courseDao.add(curse);
        System.out.println("Courser added " +curse.getName());
    }





}

