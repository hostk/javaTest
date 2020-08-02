package sqlTest;

import java.util.List;

public interface StudentDao {
	
	boolean saveStudent(Student student);
	boolean updateStudent(Student std);
	boolean deleteStudent(int id);
	List<Student> getStudentList();

}
