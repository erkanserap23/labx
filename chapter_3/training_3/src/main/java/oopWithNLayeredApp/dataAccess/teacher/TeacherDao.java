package oopWithNLayeredApp.dataAccess.teacher;

import oopWithNLayeredApp.entities.Teacher;

import java.util.List;

public interface TeacherDao {
    void add(Teacher teacher);
    List<Teacher> getAll();
}
