package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.TeacherDao;
import oopWithNLayeredApp.entities.Teacher;

import java.util.List;

public class TeacherManager {

    private TeacherDao teacherDao;
    public TeacherManager(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public void add(Teacher teacher) throws Exception {


        for (Teacher teacher3 : teacherDao.getAll()) {
           if(teacher.getName()==teacher3.getName()){
               throw  new Exception("The addition was not completed, please change the teacher name.");
               //System.out.println("The addition was not completed, please change the teacher name.");
           }
           teacherDao.add(teacher);
        }



    };

    public List<Teacher> getAll() {
        for (Teacher teacher : teacherDao.getAll()) {
            System.out.println(teacher.getName());
        }
        return teacherDao.getAll();
    }




}
