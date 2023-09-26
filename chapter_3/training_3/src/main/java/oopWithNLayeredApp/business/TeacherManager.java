package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.teacher.TeacherDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Teacher;

import java.util.List;

public class TeacherManager {

    private TeacherDao teacherDao;
    public TeacherManager(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }


        public void add(Teacher teacherX) {
            boolean isActive = true;

            for (Teacher teacher : teacherDao.getAll()) {
                if (teacher.getName().equals(teacher.getName())) {
                    isActive = false;
                    System.out.println("The addition was not completed, please change the category name.");
                    break; // Eğer aynı isimde bir kategori bulursak döngüyü sonlandırıyoruz.
                }
            }

            if (isActive) {
              teacherDao.add(teacherX);
                System.out.println("Category added: " + teacherX.getName());
            }
        }

    public List<Teacher> getAll() {
        return teacherDao.getAll();
    }




}
