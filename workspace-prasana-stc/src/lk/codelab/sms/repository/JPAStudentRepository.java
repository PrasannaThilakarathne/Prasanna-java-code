package lk.codelab.sms.repository;

import java.util.ArrayList;
import java.util.List;

import lk.codelab.sms.modal.Student;

public class JPAStudentRepository implements StudentRepository {
	
	/* (non-Javadoc)
	 * @see lk.codelab.sms.repository.StudentRepository#fethAllStudents()
	 */
	@Override
	public List<Student> fethAllStudents(){
		List<Student> students = new ArrayList<>();
		Student student = new Student();
		student.setId(1);
		student.setName("Prasanna");
		students.add(student);
		return students;
	}
}
