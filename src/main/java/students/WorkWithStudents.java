package students;

import org.springframework.beans.factory.annotation.Autowired;
import students.dao.StudentsDao;
import students.entities.Student;

public class WorkWithStudents {
    @Autowired
    private StudentsDao studentsDao;

    public void saveStudentToDb(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentsDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }
    }
}
